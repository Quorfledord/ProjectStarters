
public class Tester
{
	public static void main(String gg[])
	{
		int p = 386, q = 581, n = 0;

		
		System.out.println("Hello");
		//Start timing first loop when “Hello” is printed
		long startTime = System.currentTimeMillis();

		for(int j=0; j<2000000000; j++)
		{
			//Use this extra loop for faster computers
			//for(int k = 0; k < 1000; k++) 
			n = ((p * 2) + q) / 2;
		}

		//When this line prints, stop timing the first loop and
		//begin timing the second loop.
		System.out.println(n);

		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime; // in milliseconds
		System.out.println("The first algorithm took " +
			(elapsedTime)/1000.0 + " to run.");
		
		// Restart time tracker
		startTime = System.currentTimeMillis();
		
		for(int j=0; j<2000000000; j++)
		{
		    //Use this extra loop for faster computers
			//for(int k = 0; k < 1000; k++) 
		    // Edit here for project
			//n = ..appropriate code for speed.. ;
		}
		System.out.println(n);

		endTime = System.currentTimeMillis();
		elapsedTime = endTime - startTime; // in milliseconds
		System.out.println("The second algorithm took " +
			(elapsedTime)/1000.0 + " to run.");

	}
}

