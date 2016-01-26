package org.afplib.samples;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.afplib.base.SF;
import org.afplib.base.Triplet;
import org.afplib.io.AfpInputStream;
import org.eclipse.emf.ecore.EObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Histogram {

	private static final Logger log = LoggerFactory.getLogger(CountPagesAndResources.class);

	public static void main(String[] args) {
		
		HashMap<String, Integer> histogram = new HashMap<>();
		HashMap<String, Integer> sizeHistogram = new HashMap<>();
		
		try (AfpInputStream in = new AfpInputStream(
				new BufferedInputStream(new FileInputStream(args[0])))) {

			SF sf;
			while((sf = in.readStructuredField()) != null) {

				Integer count, size;
				int tripletSize = 0;
				
				for(EObject eo : sf.eContents()) {
					count = histogram.get(eo.eClass().getName());
					count = count == null ? 1 : count+1;
					histogram.put(eo.eClass().getName(), count);
					
					size = sizeHistogram.get(eo.eClass().getName());
					size = size == null ? ((Triplet)eo).getTripletLength() : size + ((Triplet)eo).getTripletLength();
					sizeHistogram.put(eo.eClass().getName(), size);
					
					tripletSize += ((Triplet)eo).getTripletLength();
				}

				count = histogram.get(sf.eClass().getName());
				count = count == null ? 1 : count+1;
				histogram.put(sf.eClass().getName(), count);
				
				size = sizeHistogram.get(sf.eClass().getName());
				size = size == null ? sf.getLength() : size + sf.getLength();
				sizeHistogram.put(sf.eClass().getName(), size);

			}
			
			List<String> top = histogram.entrySet()
					.stream()
					.sorted(Map.Entry.comparingByValue( (i1, i2) -> Integer.compare(i2, i1) ))
					.map((e) -> e.getKey())
					.collect(Collectors.toList());
			
			List<String> topSize = sizeHistogram.entrySet()
					.stream()
					.sorted(Map.Entry.comparingByValue( (i1, i2) -> Integer.compare(i2, i1) ))
					.map((e) -> e.getKey())
					.collect(Collectors.toList());
			
			System.out.println(String.format("%16s\t%s", "Type", "Count"));
			for(String t : top) {
				String d = t.length() <= 16 ? t : t.substring(0, 13)+"...";
				System.out.println(String.format("%16s\t%d", d, histogram.get(t)));
			}
			System.out.println();
			System.out.println(String.format("%16s\t%s", "Type", "Size"));
			for(String t : topSize) {
				String d = t.length() <= 16 ? t : t.substring(0, 13)+"...";
				System.out.println(String.format("%16s\t%d", d, sizeHistogram.get(t)));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
