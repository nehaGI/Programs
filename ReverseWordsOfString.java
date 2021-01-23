 class Main { 
  
    // Method to reverse words of a String 
    static String reverseWords(String str) 
    { 
        String[] string = str.split(" "); 
        String result = ""; 
  
        
        for (int i = 0; i < string.length; i++) { 
            if (i == string.length - 1) 
                result = string[i] + result; 
            else
                result = " " + string[i] + result; 
        } 
        return result; 
    } 
  
   public static void main(String[] args) 
    { 
        String s1 = "Welcome to geeksforgeeks"; 
        System.out.println(reverseWords(s1)); 
  
    } 
} 
