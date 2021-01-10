package com.porwau.concepts.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOCharStream {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\porwau\\Desktop\\limits.txt";
		//bufferedReadFromFile(fileName);
		bufferedReadFromConsole();
	}

	private static void bufferedReadFromConsole() {
		BufferedReader br=null;
		BufferedWriter bw=null;


		try {
			String line;
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\porwau\\Desktop\\limits-java.txt")));

			while ((line = br.readLine()) != null && !line.equals("STOP")) {//continue till user put STOP in console.
				System.out.println(line);
				bw.write(line+"\n");
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}

	private static void bufferedReadFromFile(String fileName) {
		BufferedReader br=null;

		try {
			String line;
			br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
