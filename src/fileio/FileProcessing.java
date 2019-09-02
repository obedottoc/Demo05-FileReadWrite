package fileio;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileProcessing {
	
	public static void WriteTable(int n,String filename)
	{
		PrintStream out;
		int i;
		try
		{
			out=new PrintStream(filename);
			for(i=1;i<=10;i++)
			{
				out.printf("%2d*%2d=%3d\n",i,n,i*n);
			}
		}catch(Exception e)
		{
			System.out.println("Error:"+e.getMessage());
		}
		
	}
	
	public static void ReadTable(String filename)
	{
		FileInputStream fs;
		File f;
		int data;
		try
		{
			f=new File(filename);
			if(!f.exists()){
				System.out.println("File does not exists.");
				return;
			}
			fs=new FileInputStream(f);
			do{
				data=fs.read();
				if(data!=-1)
					System.out.print((char)data);
				
			}while(data!=-1);
			
			
		}catch(Exception e)
		{
			System.out.println("Error:"+e.getMessage());
		}
		
	}

	public static void main(String[] args) {
		int option,n;
		Scanner sc=new Scanner(System.in);
		String filename;
		
		
		while(true)
		{
			System.out.println("1. To write multiplication table");
			System.out.println("2. To read a file");
			System.out.println("3. Exit");
			System.out.print("Enter your choice:");
			
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.print("Enter a number:");
				n=sc.nextInt();
				System.out.println("Enter the filename:");
				filename=sc.next();
				FileProcessing.WriteTable(n, filename);
				break;
			case 2:
				System.out.println("Enter the filename:");
				filename=sc.next();
				FileProcessing.ReadTable(filename);
				break;
			case 3:
				System.out.println("Thankyou for using file application !!!");
				break;
			default:
				System.out.println("Please enter a valid number !!!");
			}
			
			if(option==3)
			{		
				break;
			}
		}

	}

}
