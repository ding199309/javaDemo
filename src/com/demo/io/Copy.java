package com.demo.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class Copy {
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("src/com/demo/io/Copy.java");		
		InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
		
		BufferedReader br=new BufferedReader(isr);		
		PrintWriter pw=new PrintWriter("src/com/demo/io/Copy2.java");		
		String line=null;
		while((line=br.readLine())!=null){
			//pw.print(line);
			System.out.println(line.trim());
		}
		System.out.println("over");
		pw.close();
		br.close();


	}

}
