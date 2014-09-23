package CarFactory.Riker;

/**
 * <b>Title</B>: SedanCar.java Description: An experimental class I copied 
 * 		from an example at 
 * 		http://howtodoinjava.com/2012/10/23/implementing-factory-
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

public class SedanCar extends Car {

	public SedanCar() {
		super (CarType.SEDAN);
		construct();
		this.setCarValue(2);

	}

	protected void construct() {
		System.out.println("building sedan car.");
		//do other building stuff
		
	}
	/* over writing the equals to compare value*/
	public boolean equals(Object otherCar) {
		
		boolean result = false;
		
		if ( otherCar == null) {
		 result = false;	
		}
		 if (getClass() != otherCar.getClass()) {
		 result = false;
		 }
		
		 final Car other = (Car) otherCar;
		 
		if (other.getCarValue() == 0){
			return false;
		}
		
		if (other.getCarValue() == getCarValue()) {
			result = true;

		}
		return result;
	}
	
	
	/* over writing the toString to display a non hash value*/
	public String toString () {
		String carModel = "you have made an instance of SEDAN car";
			return carModel;
		}
	
}