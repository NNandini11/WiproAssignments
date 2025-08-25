package com.kn.javafiles;


import java.io.FileReader;

public class ReadingFile {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("sample.txt");
		int ch;
		System.out.println("File is Created");
		while((ch=fr.read()) !=-1) {
			System.out.print((char)ch);
		}
fr.close();
	}

}
