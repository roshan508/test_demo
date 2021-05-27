package com.selenium.javaBasics;

public class Constructor {

	 int id;
	String name;
	//public ConstructorExample() {
	// id=30;
	// name="Jon";
	// System.out.println("This is no param constructor");
	//}
	public Constructor(int id, String name) {
	this.id=id;
	this.name=name;
	}
	//public ConstructorExample(float id, String name) {
	// this.id=id;
	// this.name=name;
	//}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//ConstructorExample obj= new ConstructorExample();//no parameter
	//System.out.println(obj.id);
	//System.out.println(obj.name);

	Constructor obj2= new Constructor(100, "Amit");//With parameter
	System.out.println(obj2.id);
	System.out.println(obj2.name);

	//ConstructorExample obj3= new ConstructorExample(100.3f, "Amit");//With parameter
	//System.out.println(obj3.id);
	//System.out.println(obj3.name);
	}

	}
	