package com.aarya.types;
import java.util.Scanner;


public class Artist {
	
	public int artistId;
	public String artistName;
	
	Scanner input=new Scanner(System.in);
	
	public void createnewArtist()
	{
		System.out.println("enter artist =");
		artistId =input.nextInt();
		
		System.out.println("enter artist name");
		artistName=input.next();
	}
	
	public void showArtist()
	{
		System.out.println(" "+artistId);
		System.out.println(" "+artistName);
	}

}
