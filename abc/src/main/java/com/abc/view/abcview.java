package com.abc.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.abc.controller.abccontroller;
import com.abc.controller.abccontrollerinterface;

public class abcview {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("***********MAIN MENU***********");
		System.out.println("press 1 to create profile");
		System.out.println("enter your choice");
		int i=Integer.parseInt(br.readLine());
		
		abccontrollerinterface ai=new abccontroller();
		switch(i) {
		case 1: ai.createprofile();
			break;
		default:System.out.println("wrong choice");
		}
	}

}
