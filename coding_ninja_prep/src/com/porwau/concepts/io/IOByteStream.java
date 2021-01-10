package com.porwau.concepts.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOByteStream {
	public static void getL() {
		System.out.println("hi");
		try {
			throw new Exception("Just Like that");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This is file Read using buffer. We will see performance benefits here.
	 * 
	 * @param fName
	 */
	static void regularFileRead(String fName) {
		FileInputStream fin = null;
		FileOutputStream fout = null;
		int data;
		System.out.println("Inside Regular Read");
		try {
			long startTime = System.currentTimeMillis();
			fin = new FileInputStream(fName);
			fout = new FileOutputStream("C:\\Users\\porwau\\Desktop\\Desktop\\installer.msi");
			while ((data = fin.read()) != -1) {

				// System.out.println(data);
				fout.write(data);

			}
			System.out.println("Time elapsed - " + (System.currentTimeMillis() - startTime) / 1000 + " seconds");
		} catch (FileNotFoundException f) {
			f.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fin.close();
				fout.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * * This is regular file read. We will see performance benefits here.
	 * 
	 * @param fName
	 */
	static void bufferedFileRead(String fName) {
		System.out.println("Inside buffered Read");
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		int data;
		byte[] byteArr = new byte[4000];
		try {
			long startBuffer = System.currentTimeMillis();
			bis = new BufferedInputStream(new FileInputStream(fName));
			bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\porwau\\Desktop\\nbr2playerBuffered.msi"));
			//while( (data = bis.read()) !=-1){// this improved performance 440 times for a 3MB file
			while((data = bis.read(byteArr)) != -1) {
				System.out.println("Number of bytes read = " + data);
				bos.write(byteArr, 0, data);//reading a group and buffering helps performance improvement.
			}
			System.out.println("Time taken for buffered read/write " + (System.currentTimeMillis() - startBuffer) + " seconds.");
		} catch (FileNotFoundException f) {
			f.printStackTrace();
		}catch (IOException i) {
			i.printStackTrace();
		} 
		finally {
			try {
				bis.close();
				bos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

	}

	public static void main(String[] args) {
		String fileName = "C:\\Users\\porwau\\Desktop\\nbr2player.msi";
		// Security_backlog_ERR0916_1.pptx
		bufferedFileRead(fileName);
		//regularFileRead(fileName);

	}

}
