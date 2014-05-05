package org.afplib.generator.util;

public class CamelCase {

	public static String camelCase2Constant(String camelCase) {
		StringBuffer buf = new StringBuffer();
		
		boolean lastWasUpperCase = true;
		
		for(int index = 0; index < camelCase.length(); index++) {
			char c = camelCase.charAt(index);
			if(Character.isUpperCase(c) && buf.length() > 0 && !lastWasUpperCase) {
				buf.append("_");
			}
			if(Character.isUpperCase(c) && buf.length() > 0 && lastWasUpperCase 
					&& index + 1 < camelCase.length() 
					&& Character.isLowerCase(camelCase.charAt(index+1))) {
				buf.append("_");
			}
			if(Character.isDigit(c) && buf.length() > 0 && lastWasUpperCase 
					&& index + 1 < camelCase.length()) {
				buf.append("_");
			}
			if(Character.isUpperCase(c))
				lastWasUpperCase = true;
			else if(!Character.isDigit(c))
				lastWasUpperCase = false;
			buf.append(Character.toUpperCase(c));
		}
		
		return buf.toString();
	}
	
}
