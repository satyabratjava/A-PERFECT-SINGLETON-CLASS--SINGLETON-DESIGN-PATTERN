package com.sb.sdpTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.sb.sdp.Printer;

public class DeserializationSingleTonTest {
		public static  void serialize(Object ob)
		{
			ObjectOutputStream os=null;
			try {
				os=new ObjectOutputStream(new FileOutputStream("G:/stud.ser"));
				os.writeObject(ob);
				os.flush();
				System.out.println("Object Serialized");
				
				
			}
			catch (IOException e1) {
				e1.printStackTrace();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
				if(os!=null)
					os.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			
		}
		

public static  Object   deSerialize() {
	ObjectInputStream ois=null;
	 Object obj=null;		
	try {
		ois=new ObjectInputStream(new FileInputStream("E:/stud.ser"));
		obj=ois.readObject();
		System.out.println("DeSerialization is done");
	
	}
	catch(IOException ioe) {
		ioe.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
	try {
		if(ois!=null)
			ois.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	return obj;
}//method

public static void main(String[] args) {
	Printer p1=null;
	Printer p2=null;
	//get SingleTon object
	p1=Printer.getInstance();
	//perform Serialization
	/*DeserilziationSingletonTest.serialize(p1);
	System.out.println(p1.hashCode());*/
	try {
    //perform DeSerilization
	p2=(Printer)DeserializationSingleTonTest.deSerialize();
	System.out.println(p1.hashCode()+"   "+p2.hashCode());
	System.out.println("p1==p2?"+(p1==p2));
	}
	catch(Exception e) {
		e.printStackTrace();
	}
			
	
}

}

