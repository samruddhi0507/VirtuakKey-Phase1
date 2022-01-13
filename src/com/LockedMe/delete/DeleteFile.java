package com.LockedMe.delete;

import java.io.File;
import java.util.Scanner;

import com.LockedMe.Add.AddFile;

public class DeleteFile extends AddFile{

	public void DeleFile() {
		
		
			

		String path= "D:\\simplilearn\\phase1\\";
		System.out.println("Enter the file name to Delete from the files. ");
		Scanner sc=new Scanner(System.in);
		String filename=sc.next();
		String SaveFile=path + filename;
		File f= new File(SaveFile);
		f.delete();
		System.out.println("Your File has Succesfully Deleted: "+ f);
		
	}
}