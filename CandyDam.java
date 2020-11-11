
class CandyDam { 
  
    // Return the maximum water that can be stored 
    public int candyDam(int h[]) 
    { 
  
        // To store the maximum water so far 
        int max = 0; 
  
        // Both the pointers are pointing at the first 
        // and the last buildings respectively 
        int i = 0, j = h.length - 1; 
  
        // While the water can be stored between 
        // the currently chosen buildings 
        while (i < j) { 
  
            // Update maximum water so far and increment i 
            if (h[i] < h[j]) { 
                max = Math.max(max, (j - i - 1) * h[i]); 
                i++; 
            } 
  
            // Update maximum water so far and decrement j 
            else if (h[j] < h[i]) { 
                max = Math.max(max, (j - i - 1) * h[j]); 
                j--; 
            } 
  
            // Any of the pointers can be updated (or both) 
            else { 
                max = Math.max(max, (j - i - 1) * h[i]); 
                i++; 
                j--; 
            } 
        } 
  
        return max; 
    } 
  