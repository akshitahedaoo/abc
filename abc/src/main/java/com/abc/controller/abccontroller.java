package com.abc.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.abc.entity.abcuser;
import com.abc.service.abcservice;
import com.abc.service.abcserviceinterface;

public class abccontroller implements abccontrollerinterface {
	private abcserviceinterface as;
	
	public abccontroller() {
		as=new abcservice();
	}
	
	//No need to add a main function here



	@Override
	public void createprofile() throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter name");
		String name=br.readLine();

		System.out.println("enter email");
		String email=br.readLine();

		System.out.println("enter password");
		String password=br.readLine();

		System.out.println("enter address");
		String address=br.readLine();
		//Created a new entity for user and filled its value
		abcuser au=new abcuser();
		au.setName(name);
		au.setEmail(email);
		au.setPassword(password);
		au.setAddress(address);
		
		int i = as.createprofileservice(au);
		
		if(i>0) {
			System.out.println("created");
		}
		else {
			System.out.println("not created");
		}
	}
}
