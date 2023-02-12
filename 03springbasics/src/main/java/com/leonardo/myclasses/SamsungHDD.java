package com.leonardo.myclasses;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component


public class SamsungHDD implements IHardDiisk {

	@Override
	public void powerOnHDD() {
		// TODO Auto-generated method stub
      System.out.println("My hard disk is power on");
	}

	@Override
	public void powerOffHDD() {
		// TODO Auto-generated method stub
	     System.out.println("My hard disk is power ff");
	}

	@Override
	public void readHDD() {
		// TODO Auto-generated method stub
	     System.out.println("My hard disk is reading");
	}

}
