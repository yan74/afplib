package org.afplib.generator.util;

import java.util.BitSet;

public class Math {

	public static Integer pow(Integer a, Integer b) {
		return (int) java.lang.Math.pow(a, b);
	}
	
	public static Integer sbin(Integer in, Integer size) {
		switch(size) {
		case 1: return (int) Short.valueOf(in.toString());
		case 2: return (int) Integer.valueOf(in.toString()).shortValue();
		case 4: return (int) Long.valueOf(in.toString()).intValue();
		}
		return in;
	}
	
	public static Integer defaultIndicator(Integer size, Boolean signed) {
		if(signed) return -1;
		
		switch(size) {
		case 1: return 0xff;
		case 2: return 0xffff;
		case 3: return 0xffffff;
		case 4: return 0xffffffff;
		}
		throw new IllegalArgumentException("Unsupported size "+size);
	}

	   public static Integer calculateFlagValue(Integer size, Integer bit) {
	        BitSet set = new BitSet(size);
	        set.set(size - bit - 1);
	        return (int) set.toLongArray()[0];
	    }

}
