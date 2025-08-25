package com.kn.javafiles;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File df=new File("demo.txt");
		if(df.delete()) {
			System.out.println("File Deleted Successfully!");
		}else {
			System.out.println("File is not available, can't download");
		}

	}

}
