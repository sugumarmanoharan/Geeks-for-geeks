class Solution {
    public static int nextPrime(int n) {
    
        // code here to find next prime number
        // return next prime number
        n=n+1;
        while(true){
        boolean isprime=true;
        if (n<=1){
            isprime=false;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                isprime=false;
                break;
                }
            }
        }
        if (isprime)
        {
            return n;
        }
        n++;
        }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna