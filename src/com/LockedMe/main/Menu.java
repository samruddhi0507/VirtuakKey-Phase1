package com.LockedMe.main;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.LockedMe.display.DisplayFile;
import com.LockedMe.search.SearchFile;

public class Menu {

	public static void main(String[] args) throws IOException  {
		while(true) {
		Scanner sc=new Scanner (System.in);
		System.out.println("------------------------------------------------------");
		System.out.println("**** Welcome to the Virtual key ****");
		System.out.println("------------------------------------------------------");
		System.out.println("Virtual key LockedMe is the Application From Company Lockers Pvt. Ltd.");
		System.out.print(" Developed by : Samruddhi Randive ");
		System.out.println("Work As: Full Stacks Developer. ");
		System.out.println(" ");
		System.out.println("Choose the Below option Number: ");
		System.out.println("1. Display  Files and Current Folder");
		System.out.println("2. File Manipulation ");
		System.out.println("3. Exit");
		System.out.println(" ");
		
		int option = sc.nextInt();
		switch(option) {
		case 3:{
			System.out.println("LockerMe Has been Exited.");
			System.exit(0);
			break;
			
		}

		case 1: {
			com.LockedMe.display.DisplayFile obj4 =new com.LockedMe.display.DisplayFile();
			obj4=DisplayF();
			break;
			
		}
				case 2:
				{
						//while(true) {
							System.out.println(" ");
							System.out.println("------------------------------------------------------");
							System.out.println("Choose the Below option Number: ");
							System.out.println(" ");
							System.out.println("1. Add Files");
							System.out.println("2. Delete a File");
							System.out.println("3. Search a File");
							System.out.println("4. Return to Main Menu");
							int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			{
				com.LockedMe.Add.AddFile obj=new com.LockedMe.Add.AddFile();
				obj.AddFile();
				break;
			}
		case 2:{
	
			com.LockedMe.delete.DeleteFile obj2=new com.LockedMe.delete.DeleteFile();
			obj2.DeleFile(); 
			break;
		}
		case 3:{
			SearchFile obj3=new SearchFile();
			obj3.searchFile(); 
			break;
		}
		
	
	}

				}
				
	}
	}
	}

	private static DisplayFile DisplayF() {
		
		String path="D:\\simplilearn\\phase1\\";
		File f=new File(path);
		File filename[]=f.listFiles();
		Arrays.sort(filename);
		System.out.println("File available in the folder."+  path);
		System.out.println(" ");
		for(File ff:filename) {
			
			System.out.println(ff.getName());
			
		}
		System.out.println(" ");
		return null;
	}

	
}
