package com.hm.oppsbasics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class ReadingInput {

	public static void main(String[] args) {
		
		Reader reader=null;
		try {
			reader = new FileReader("hello.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Scanner scan = new Scanner(reader);
		String str = scan.nextLine();
		System.out.println(str);
		
		
	}
	
}
