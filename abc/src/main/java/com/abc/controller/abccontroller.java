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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void createprofile() throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter name");
		String name=br.readLine();
		
		System.out.println("enter email");
		String email=br.readLine();
		
		System.out.println("enter password");
		String password=br.readLine();
		
		System.out.println("enter address");
		String address=br.readLine();
		abcuser au=new abcuser();
		au.setName(name);
		au.setEmail(email);
		au.setPassword(password);
		au.setAddress(address);
		abccontrollerinterface ci=new abccontroller();
		int i=ci.createprofileservice(au);
		if(i>0) {
			System.out.println("created");
		}
		else {
			System.out.println("not created");
		}
		
		
	}

	public int createprofileservice(abcuser iu) {
		// TODO Auto-generated method stub
		return 0;
	}

}
