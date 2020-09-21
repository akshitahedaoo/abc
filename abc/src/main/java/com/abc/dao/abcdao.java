package com.abc.dao;

import java.util.ArrayList;

import com.abc.entity.abcuser;


public class abcdao implements abcdaointerface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int createprofiledao(abcuser au) {
		// TODO Auto-generated method stub
		ArrayList<abcuser> ll= new ArrayList<abcuser>();
		abcuser a=new abcuser();
		
		a.setName(au.getName());
		a.setEmail(au.getEmail());
		a.setPassword(au.getPassword());
		a.setAddress(au.getAddress());
		System.out.println("hello");
		
		

		int i=ll.size();

		if(i>0) {
			return 1;
		}
		else {
			return 0;
		}
		
	}

	public int createprofiledao() {
		// TODO Auto-generated method stub
		return 0;
	}

}
