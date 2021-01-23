/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
   
    static HashMap<Character,Integer> findDuplicateCharacter(String str){
         HashMap<Character, Integer> hm = new HashMap<>();
         
         for(int i=0;i<str.length();i++)
         {
             char ch = str.charAt(i);
              if(hm.get(ch) !=null)
                 hm.put(ch,hm.get(ch)+1);
              else 
                hm.put(ch,1);
             
        }
        return hm;
         
        //Uncomment the below code if u want to show only the character which are duplicates // and remove return statement above
        
      /*  Iterator<Character> tempChar = hm.keySet().iterator();
        while(tempChar.hasNext())
        {
            char temp = tempChar.next();
            if(hm.get(temp)>1)
                 System.out.println(temp);
                
        }*/
            
        
    }    
     
	public static void main (String[] args) throws java.lang.Exception
	{
		
		HashMap<Character ,Integer> hmap = findDuplicateCharacter("google");
		System.out.println(hmap);
	
    	
	}
}
