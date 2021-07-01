import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void test() {

				//create an instance of a class
				//Car() is an object - has variables and functions stored in it
				//Car is a subclass and must be created
				Car littleRedCorvet = new Car("red"); 
				
				// when the color is not specified, it will pick the default color and it must be defined in the Car class
				Car foo = new Car();


	}

}
