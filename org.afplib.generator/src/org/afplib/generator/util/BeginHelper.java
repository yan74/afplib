package org.afplib.generator.util;

public class BeginHelper {

	public static boolean isBegin(Integer id) {
		return (id & 0xff00) == 0xa800;
	}
	
}
