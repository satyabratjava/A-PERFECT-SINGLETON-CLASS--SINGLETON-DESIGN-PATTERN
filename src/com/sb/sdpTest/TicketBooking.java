package com.sb.sdpTest;

import com.sb.sdp.Printer;

public class TicketBooking implements Runnable{

	@Override
	public void run() {
	Printer p=null;
	p=Printer.getInstance();
	System.out.println("TicketBooking.run()");
	System.out.println(p.hashCode()+"---->"+ Thread.currentThread().getName());
		
	}

}
