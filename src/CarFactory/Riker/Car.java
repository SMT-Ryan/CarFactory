package CarFactory.Riker;

/**
 * <b>Title</B>: Car.java Description: An experimental class I copied from an 
 * 		example at http://howtodoinjava.com/2012/10/23/implementing-factory-
 * 		design-pattern-in-java/
 * 
 * 		after the code was copied the equals() and toString() were over written.
 * 
 * Copyright: original code only all copied work belongs to original owner
 * 	Copyright (c) 2014 Company: Silicon Mountain Technologies
 *
 * @author: Ryan Riker
 * @version 1.0
 * @since 09/10/2014 
 * last update: never
 */


public abstract class Car {

	private CarType model = null;
	private int carValue;
	
	/* Constructor set to take car model*/
	
	public Car(CarType model) {
		this.model = model;
		arrangeParts();
	}

	/* method below would be were the car was assembled */
	
	private void arrangeParts() {
		//does something
		System.out.println("arranging car parts");
	}
	
	/* demands a construct method in all cars*/
	
	protected abstract void construct();

	
	/* getters and setters*/
	public CarType getModle() {
		return model;
	}
	
	public int getCarValue() {
		return carValue;
	}
	
	public void setCarValue(int newValue){
		this.carValue = newValue;
		
	}
	
	public void setModel(CarType model) {
		this.model = model;
	}
	
}
