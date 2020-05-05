package com.sb.sdpTest;

public class MultithradingSingleTonTest {
	public static void main(String[] args) {
		
		TicketBooking t=null;
		Thread req=null;
		Thread req2=null;
		t=new TicketBooking();
		req=new Thread(t);
		req2=new Thread(t);
		req.start();
		req2.start();
	}

}
