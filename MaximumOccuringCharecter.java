/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
static HashMap<Character, Integer> findMaximumOccurringChar(String str){
		int maxCount =0;
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i <str.length() ; i++) {
			char c = str.charAt(i);
			if(hm.containsKey(c)){
				int count = hm.get(c);
				count++;
				if(maxCount<count)
					maxCount++;
				hm.put(c, count);
			}else
				hm.put(c, 1);
			
		}
 
		Iterator<Character> temp = hm.keySet().iterator();
	
		while(temp.hasNext()){
			char key = temp.next();
			//check count
			if(hm.get(key)==maxCount){
			   	HashMap<Character, Integer> maxCharHM = new HashMap<>();
			   	maxCharHM.put(key,maxCount);
		    	return maxCharHM;
			}
		}
		
		return hm;
	}
 
	public static void main(String[] args) {
			HashMap<Character,Integer> hm=findMaximumOccurringChar("javajavajavapppppppp");
			System.out.println(hm);
		
	}

}
