package com.sb.sdpTest;

import java.lang.reflect.Constructor;

import com.sb.sdp.Printer;

public class RefectionApiSingleTonTest {
	public static void main(String[] args) {
		
		Printer p1=null;
		Printer p2=null;
		Class c=null;
		Constructor con[]=null;
		//get object
		p1=Printer.getInstance();
		try {
			//load the class
			c=Class.forName("com.sb.sdp.Printer");
			
			//get all the constructor of loaded class
			con=c.getDeclaredConstructors();
			
			//get access to private constructor
			con[0].setAccessible(true);
			
			//Create object using NewInstance
			p2=(Printer) con[0].newInstance();
			System.out.println(p1.hashCode() +p2.hashCode());
			System.out.println("p1==p2?" +(p1==p2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
