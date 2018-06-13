package com.bridgelabz.designPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializedSingleton implements Serializable{
	private static final long serialVersionUID = -76568657979115L;
	private SerializedSingleton() {
		
	}
	private static class SingletonHelper{
		private static final SerializedSingleton instance = new SerializedSingleton();
		
	}
	public static SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}
	protected Object readResolve() {
	    return getInstance();
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializedSingleton instanceOne = new SerializedSingleton().getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.ser"));
		out.writeObject(instanceOne);
		out.close();
		ObjectInput in = new ObjectInputStream(new FileInputStream("file.ser"));
		SerializedSingleton instanceTwo = (SerializedSingleton)in.readObject();
		
		in.close();
		
		System.out.println("instanceOne hashCode: "+ instanceOne.hashCode());
		System.out.println("instanceTwo hashCode: "+ instanceTwo.hashCode());
	}
}
