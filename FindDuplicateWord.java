/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
     static ArrayList<String> findDuplicateWord(String str){
         
         HashMap<String, Integer> hm = new HashMap<>();
         
         ArrayList<String> strg = new ArrayList<>();
         
         String[] s = str.split(" ");
         
         for(String tempStr:s){
             if(hm.get(tempStr)!= null){
                 hm.put(tempStr,hm.get(tempStr)+1);
             }
             else {
                 hm.put(tempString,1);
             }
             
         }
         
         Iterator<String> tempStr = hm.keySet().iterator();
         while(tempStr.hasNext()){
             String temp = tempStr.next();
             if(hm.get(temp)>1){
                 strg.add(temp);
             }
         }
        return strg; 
     }
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<String> str = findDuplicateWord("I am am learnning java java java");
	
    	for(String i: str){
    	    System.out.println(""+i);
    	}
    
	}
}
