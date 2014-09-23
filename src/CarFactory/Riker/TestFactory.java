package CarFactory.Riker;

/**
 * <b>Title</B>: TestFactory.java Description: An experimental class I copied 
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

public class TestFactory {

	public static void main(String[] args) {
		 	System.out.println(CarFactory.buildCar(CarType.SMALL));
	        System.out.println(CarFactory.buildCar(CarType.SEDAN));
	        System.out.println(CarFactory.buildCar(CarType.LUXURY));
	        
	        /* three instances from the factory*/
	        Car a = new SmallCar();
	        Car b = new SedanCar();
	        Car c = new SmallCar();
	        
	        System.out.println("a car val is " + a.getCarValue());
	        System.out.println("b car val is " + b.getCarValue());
	        System.out.println("c car val is " + c.getCarValue());
	        
	        /* if test of the equals method over write*/
	        if (a == b) {
	        	System.out.println("a and b are equal, error");
	        }else {
	        	System.out.println("a and b are not equal all is as it should be");
	        }
	        
	        if (a.equals(c)) {
	        	System.out.println("a and c are equal all is as it should be");
	        }else {
	        	System.out.println("a and c are not equal error");
	        }
	        
	}

}
