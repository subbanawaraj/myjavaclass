package org.apex.assignment;

import java.util.Scanner;
import java.io.*;

public class ReadTextFile {

	public static void main(String[] args)  throws IOException
	{
		File temp = new File("test.txt");
		Scanner scan = new Scanner(temp);
		String str = "";
		int freq = 0;
		
		while(scan.hasNext()) {
			str += scan.nextLine().trim();
		}		
		
		for (int i=0; i < str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'A') freq++;
		}
		
		System.out.println(freq);
		
		
		
		scan.close();
	}

}
