package designpatterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonPatterTest {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		PerfectInitialization p1 = PerfectInitialization.getInstance();
		ObjectOutput out = 	new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
		
		out.writeObject(p1);
		
		p1.setI(20);
		
		ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
		
		PerfectInitialization p2 = (PerfectInitialization) in.readObject();
		System.err.println(p1.getI());
		System.err.println(p2.getI());
		
		
	}

}
