/*package whatever //do not write package name here */

import java.io.*;
import java.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
	    Code code = new Code();
	    Map<String,String> map = code.getStates("karnataka-bangalore||tamilnade-chennai||odisha-bbsr","||","-");
	    System.out.println(map);
	}
		
}