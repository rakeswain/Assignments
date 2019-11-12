/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.*;
class Main {
    static boolean validateUserName(String str){
        if(str.endsWith("_job")&&str.lastIndexOf("_")>=8)
          {
            //System.out.println(str.lastIndexOf("_"));
            return true;  
          }
            
        else 
            return false;
        
    }
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    if(checkString(str)){
	         System.out.println("Valid");
	    }else{
	        System.out.println("Invalid");
	    }
	}
}
