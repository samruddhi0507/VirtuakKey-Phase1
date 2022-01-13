package com.LockedMe.search;

import java.io.File;
import java.util.Scanner;

import com.LockedMe.Add.AddFile;

public class SearchFile extends AddFile{

	public void searchFile() {
	
		String path="D:\\simplilearn\\phase1\\";
		File f = new File(path);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name to search.");
		String FilenameSearch=sc.next();
		File filename[]=f.listFiles();
		int flag=0;
		for(File ff:filename) {
			if(ff.getName().equals(FilenameSearch)) {
				flag=1;
				break;
				
			}
			else {
				flag=0;
				
			}
			
		}
		if(flag==1) {
			System.out.println("Searched File "+ FilenameSearch + " is Available");
			
		}else {
			System.out.println("Searched File is Not Available");
		}
		
		
		
	}

}
