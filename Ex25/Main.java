/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;

import java.*;
public class Main
{
	public static void main(String[] args) {
	
		ArrayList<Character> list_one = new ArrayList<Character>(Arrays.asList('A','D'));
		ArrayList<Character> list_two = new ArrayList<Character>(Arrays.asList('B','F'));
		Code code = new Code();
		char[] arr = code.mergeData(list_one,list_two);
		System.out.println(arr);
		
	}
}
