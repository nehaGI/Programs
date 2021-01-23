//str = "I love India"
//rvsStr = "India love I";

class Main { 
  
    // Method to reverse words of a String 
    static String reverseWords(String str) 
    { 
        String[] string = str.split(" "); 
        String result = ""; 
  
        
        for (int i = string.length-1;i>=0; i--) { 
            
                result = result + string[i]+" "; 
            } 
        return result; 
    } 
  
   public static void main(String[] args) 
    { 
        System.out.println(reverseWords("I love India")); 
  
    } 
} 
