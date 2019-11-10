/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;
import java.lang.Character;
import java.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your option");
		char option = sc.next().charAt(0);
		Code code = new Code();
		
		System.out.println(code.changeString("hello",Character.toUpperCase(option)));
	}
}
