
public class FizzBuzzApp {
	
	public static void main(String[] args) {
	
	for (int index=1; index < 100; index++)
	{
	   int threemod = index % 3;
	   int fivemod = index % 5;
		   
	   if (threemod == 0 && fivemod == 0){
         System.out.println("FizzBuzz");  
	   }
	   else if (threemod == 0) {
		   System.out.println("Fizz");
	   }
	   else if (fivemod == 0) {
		   System.out.println("Buzz");
	   }
	   else System.out.println(index);
	 } 

  }
	
}
