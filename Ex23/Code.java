/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;
import java.lang.Character;
import java.*;
public class Code
{
    
    static StringBuilder removeDuplicatesFromString(StringBuilder string)  
    {  
    
        int[] table = new int[256]; 
        char[] chars = string.toString().toCharArray(); 
  

        int endIndex = 0; 
      
        for(int i = 0; i < chars.length; i++) 
        { 
            if(table[chars[i]] == 0) 
            { 
                table[chars[i]] = -1; 
                chars[endIndex++] = chars[i];  
            } 
        } 
      
        return new StringBuilder(String.copyValueOf(Arrays.copyOfRange(chars, 0, endIndex))); 
    }  
    
    
    
    
    
    
    
	public String changeString(String string, char ch){
	    StringBuilder str = new StringBuilder(string);
	    switch(ch){
	        case 'A':
	            str.append(str);
	            break;
	        case 'B':
	            for(int i=0;i<str.length();i=i+2){
	                str.setCharAt(i,'*');   
	            }
	            break;
	        case 'C':
	            str = removeDuplicatesFromString(str);
	            break;
	        case 'D':
	             for(int i=0;i<str.length();i=i+2){
	                str.setCharAt(i,Character.toUpperCase(str.charAt(i)));   
	            }
	            break;
	        default: 
	            System.out.println("Wrong option!");
	        
	    }
	    return str.toString();
	}
}
