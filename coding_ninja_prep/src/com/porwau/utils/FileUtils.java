package com.porwau.utils;

import java.io.File;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

public class FileUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("/");

		String enableSSL = StringUtils.trimToNull("hello   ");
//enableSSL.isEmpty();
		System.out.println(f.getFreeSpace());
		System.out.println(f.getAbsoluteFile() + " " + f.getAbsolutePath() + " " + f.getPath() + " "
				+ Arrays.toString(f.listRoots()) + f.length());
		Map m = System.getenv();
		Properties prop = System.getProperties();
		for (Map.Entry mappings : prop.entrySet()) {
			System.out.println(mappings.getKey() + ":" + mappings.getValue());

		}

		System.out.println("Available processors (cores): " + Runtime.getRuntime().availableProcessors());

		/* Total amount of free memory available to the JVM */
		System.out.println("Free memory (bytes): " + Runtime.getRuntime().freeMemory());

		/* This will return Long.MAX_VALUE if there is no preset limit */
		long maxMemory = Runtime.getRuntime().maxMemory();
		/* Maximum amount of memory the JVM will attempt to use */
		System.out.println("Maximum memory (bytes): " + (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));

		/* Total memory currently available to the JVM */
		System.out.println("Total memory available to JVM (bytes): " + Runtime.getRuntime().totalMemory());

		/* Get a list of all filesystem roots on this system */
		File[] roots = File.listRoots();

		/* For each filesystem root, print some info */
		for (File root : roots) {
			System.out.println("File system root: " + root.getAbsolutePath());
			System.out.println("Total space (bytes): " + root.getTotalSpace());
			System.out.println("Free space (bytes): " + root.getFreeSpace());
			System.out.println("Usable space (bytes): " + root.getUsableSpace());
		}
	}

	private static String validateProperty(String property) {
		String value = null;
		if (StringUtils.isNotEmpty(property)) {
			value = StringUtils.trim(property);
		}
		return value;
	}
}
