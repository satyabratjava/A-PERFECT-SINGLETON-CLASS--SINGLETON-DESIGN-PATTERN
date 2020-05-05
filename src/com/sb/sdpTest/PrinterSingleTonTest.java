package com.sb.sdpTest;

import com.sb.sdp.Printer;

public class PrinterSingleTonTest {
	
	public static void main(String[] args) {
		try {
			Printer p1=null;
			Printer p2=null;
			
//			p1=new Printer()/not possible by new Operator
			p1=Printer.getInstance();
			p2=Printer.getInstance();
			System.out.println(p1.hashCode()+" " +p2.hashCode());
			System.out.println("p1==p2?" +(p1==p2));
			
			System.out.println("--------------------------------------");
			p1.printdat("heloo");
			p2.printdat("hii");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
