package com.abc.service;

import com.abc.dao.abcdao;
import com.abc.dao.abcdaointerface;
import com.abc.entity.abcuser;

public class abcservice implements abcserviceinterface{

	private abcdaointerface ad;
	public abcservice() {
		ad=new abcdao();
	}
	
	//No need to use main function here
	
	public int createprofileservice(abcuser au) {
		// TODO Auto-generated method stub
		int i=ad.createprofiledao(au);
		return i;
	}
}
