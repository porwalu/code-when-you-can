package com.porwau.exception;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

public class ExceptionDemo {

	public static void main(String[] args)  {
		
		
		
		File f = new File("abc.txt");
		//FileInputStream fi = null;
		
		;
//		try(BufferedInputStream bi = new BufferedInputStream(new FileInputStream(f))){
//			System.out.println("Hello");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		
		
		System.out.println("Inside main");
//		excepDemo();
		System.out.println("Inside main again");
        String majorVersion = null;
        String[] splitVersion = null;
        String version = "4.6.0.1";
        if(version.contains("u")) {
        	System.out.println("Old style version");
        	splitVersion = StringUtils.split(version, 'u');
        }else {
        	System.out.println("New style version");
        	splitVersion = StringUtils.split(version, '.');
        }
        
        if (splitVersion.length > 0) {
        	if(!version.contains("u")) {
        		majorVersion = splitVersion[0] + "." + splitVersion[1];
        	}else {
        		majorVersion = splitVersion[0];
        	}
        } 
//		String[] split = StringUtils.split("4.5.1.0", '.');
//		String[] split2 = StringUtils.split("4.5u1", '.');
//		System.out.println(Arrays.toString(split));
//		System.out.println(split[0]);
//		majorVersion=split[0] + "." + split[1];
//		String majorVersion2=split2[0] + "." + split2[1];

		System.out.println("major version is :" + majorVersion);
	//	System.out.println("major version is :" + majorVersion2);


	//	throw new NumberFormatException();//unchecked exception

	}

	private static void excepDemo()  throws FileNotFoundException{
		System.out.println("Inside excepDemo");		
		//try {
		//	throw new OutOfMemoryError();
//		}catch(FileNotFoundException fnfe) {
//System.out.println("FNFE found");
//		}
//		System.out.println("Inside excepDemo again");		


	}
}
