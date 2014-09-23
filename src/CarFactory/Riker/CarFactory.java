package CarFactory.Riker;

/**
 * <b>Title</B>: CarFactory.java Description: An experimental class I copied 
 * 		from an example at 
 * 		http://howtodoinjava.com/2012/10/23/implementing-factory-
 * 		design-pattern-in-java/
 * 
 * 		after the code was copied the equals() and toString() were over written.
 * 
 *  Copyright: original code only all copied work belongs to original owner
 * 	Copyright (c) 2014 Company: Silicon Mountain Technologies
 *
 * @author: Ryan Riker
 * @version 1.0
 * @since 09/10/2014 
 * last update: never
 */

public class CarFactory {
	
	
public static Car buildCar (CarType model) {
	Car car = null;
	
	/* builds the car instance based on the Enum value*/
	
	switch (model) {
	case SMALL:
		car = new SmallCar();
		break;
	case SEDAN:
		car = new SedanCar();
		break;
	case LUXURY:
		car = new LuxuryCar();
		break;
	default:
		//throw an exception? 
		break;
	}
	
	return car;
	
}


}
