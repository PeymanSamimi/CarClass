
public class Car {

   private String color;
   Car()
   {
		//this is defining the default color -default constructor 
	   this("black");
   }
   
   	// this is a constructor to allow parameters into our function in the main class
	//inputColor is a local variable
   Car(String inputcolor)
   {
		// can also be written as inputColor = color
	   this.color=inputcolor;
   }
}
