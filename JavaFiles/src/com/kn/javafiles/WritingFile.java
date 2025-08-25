package com.kn.javafiles;

import java.io.FileWriter;

public class WritingFile {

	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("sample.txt");
		fw.write("This is a Sample Text File");
		fw.close();
		System.out.println("File Created and Written");
		

	}

}
