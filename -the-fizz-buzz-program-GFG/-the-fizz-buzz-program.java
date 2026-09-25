import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
     
		
			
				if (n%3==0 && n%5==0) {
					System.out.print("FizzBuzz");
				}
				else if(n%3==0){
					System.out.print("Fizz");
				}
				else if(n%5==0) {
					System.out.print("Buzz");
				}
				else
				{
				    System.out.print(n);
				}
					
				}
    }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna