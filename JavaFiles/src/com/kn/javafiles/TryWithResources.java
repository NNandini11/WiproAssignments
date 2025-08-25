package com.kn.javafiles;

import java.io.FileReader;

public class TryWithResources {

	public static void main(String[] args) throws Exception {
		try(FileReader rf=new FileReader("sample.txt")){
			int ch;
			System.out.println("File Content");
			while((ch=rf.read())!=-1) {    //Fetching integer values
				System.out.print((char)ch); // converting int to char
				// automatically closes file without using rf.close()
			}
		}

	}

}
