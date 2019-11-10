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

    
    
    
    
    
    
	public boolean checkPositive(String string)
	   {
	       for(int i=0;i<string.length()-1;i++)
	       {
	           int flag = (int)string.charAt(i+1)-(int)string.charAt(i); 
	           if(flag<0)
	           return false;
	       }
	       return true;
	   }
}
