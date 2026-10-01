class Solution {
    public int findMin(int a, int b) {
        int s=a+b;
        int m=a-b;
        int p=a*b;
        
        if (b == 0) {
                    return Math.min(s, Math.min(m, p));
                }
        int d=a/b;
        if(s<m && s<p && s<d){
            return s;
        }
        else if(m<s && m<p && m<d){
            return m;
        }
        else if(p<s && p<m && p<d){
        
           return p;
        }
        else{
            return d;
        }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna