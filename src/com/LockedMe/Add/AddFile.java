package com.LockedMe.Add;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddFile {

	public void AddFile() throws IOException  {

		String path="D:\\simplilearn\\phase1\\";
		
		Scanner No=new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Enter Numbers of files to be Created.");
		int NoOF=No.nextInt();
		
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<>();
		
		for (int i =0;i<NoOF;i++) {
		 
			System.out.println(" ");
			System.out.println("Enter the file name to create.");
			String filename= sc.next();
			String SaveFile = path+ filename;
			File f= new File(SaveFile);
			Boolean result = f.createNewFile();
			if(result == false) {
				System.out.println("File not Created. " );
				break;
			}
			else {
				al.add(SaveFile);
				System.out.println("File has Been Created at: "+ SaveFile);
				
			
			}
			System.out.println("File Name: "+filename);
			System.out.println("-------------------------------------------------------");
			
		}
		
		
	}

	

}
