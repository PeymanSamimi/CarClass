import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void test() {

		// when the color is not specified, it will pick the default color and it must be defined in the Car class
		Car foo = new Car();
		
		foo.accelerate(20);
		assertEquals("black car now doing 20mph", foo.getOutput());
		
		
		//create an instance of a class
		//Car() is an object - has variables and functions stored in it
		//Car is a subclass and must be created
		Car littleRedCorvet = new Car("red"); 
		assertEquals("red car now doing 0mph", littleRedCorvet.getOutput());		
				


	}

}
