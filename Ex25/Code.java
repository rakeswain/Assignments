/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;

import java.*;
public class Code
{
	public char[] mergeData(ArrayList<Character> list_one , ArrayList<Character> list_two){
	   
	   list_one.addAll(list_two);
	   Collections.sort(list_one);
	   char [] arr = new char[list_one.size()];
	   for(int i=0;i<list_one.size();i++)
	   {
	    arr[i]=list_one.get(i);   
	   }
	   
	   return arr;
	}
}
