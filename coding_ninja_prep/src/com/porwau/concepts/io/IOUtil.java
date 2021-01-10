package com.porwau.concepts.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class IOUtil {

	public static String read(InputStream in) {
		BufferedReader bi = null;
		StringBuilder sb = new StringBuilder();
		String line = "";

		try {
			bi = new BufferedReader(new InputStreamReader(in, "UTF-8"));
			while ((line = bi.readLine()) != null) {
				// System.out.println(line);
				sb.append(line).append("\n");
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}

	public static void write(String webpage) throws IOException {
		BufferedWriter bw = null;
		try {
			 bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\porwau\\Desktop\\abc.html"),"UTF-8"));
			 bw.write(webpage);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
