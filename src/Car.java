
public class Car {

   private String color;
   private int currentMPH;
   
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
	   this.currentMPH = 0;
   }
   
   public String getOutput()
   {
	  return this.getColor()+ " car now doing " +this.currentMPH+"mph"; 
   }
   public void accelerate (int mph)
   {
	  this.currentMPH = mph;
   }
   
   // Another function called in the getOutput
   private String getColor()
   {
	   return this.color;
   }
   
}
