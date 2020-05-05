package com.sb.sdp;

import com.sb.commons.CommonsUtil;

public class Printer extends CommonsUtil{
	//here object will be created before class loading
	//private static  Printer INSTANCE=new Printer();//EAger Instantiation (Wrong Practice)
	
	//Object will create at class loading time,or it will load the object when there is a need 
	private static Printer INSTANCE;//Lazy instantiation 
	
	private static final long serialVersionUID=143L;
	
	//one of the way to stop Reflection API to access our private Constructor
	private  static boolean flag=false;
	
	
	//private constructor to stop creating object other clas
	private Printer()
	{
		if(flag==true)
			throw new IllegalArgumentException ("object already created::Not possible to creat another object");
	flag=true;
		System.out.println("Printer::0-param constructor");
	}
	
	//static factory method
	//class level synchronization (NOT GOOD)
	/*public static synchronized Printer getInstance()
	{
		if(INSTANCE==null)
			INSTANCE=new Printer();
		return INSTANCE;
		
	}*/
	
	public static Printer getInstance()
	{
		if(INSTANCE==null)//first null check
		{
			synchronized(Printer.class)
			{
				if(INSTANCE==null)//2nd null check
					INSTANCE=new Printer();
			}
		}//Synchronized
		return INSTANCE;
	}
	public void printdat(String string)
	{
		System.out.println("data");
	}
	
	
	//solving cloning problem of single ton DesignPattern(RECOMENDED)
	public Object clone() throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException("clone not allowed in singleton java class");
	}
	
	//solving cloning problem (NOT RECOMNDED)
	
	/*public Object clone() throws CloneNotSupportedException 
	{
	return INSTANCE;	
	}*/
	
	
	//Solving Deserilaization probelm in singleton
	
	/*public Object readResolve()
	{
		System.out.println("Printer.readResolve()");
		return INSTANCE;
	}*/
	
	//Recomended DEserialization process  to solve problem on singleton class
	public Object readResolve()
	{
		System.out.println("Printer.readResolve()");
		throw new IllegalArgumentException("printer do not want to support deserilizaton");
	}

}
