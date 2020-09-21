package com.abc.service;

import com.abc.dao.abcdao;
import com.abc.dao.abcdaointerface;
import com.abc.entity.abcuser;

public class abcservice implements abcserviceinterface{

	private abcdaointerface ad;
	public abcservice() {
		ad=new abcdao();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int createprofileservice(abcuser au) {
		// TODO Auto-generated method stub
		int i=ad.createprofiledao(au);
		return i;
		
		
		
	}
	public void createprofileservice() {
		// TODO Auto-generated method stub
		
	}
	

}
