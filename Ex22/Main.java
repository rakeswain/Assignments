/*package whatever //do not write package name here */

import java.io.*;
import java.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
	    Code code = new Code();
	    HashMap<String,String> map = new HashMap<String,String>();
	    map.put("1","VIMAL-MALIV");
	    map.put("2","RAMA-AMAR");
	    map.put("3","SUSAN-JENNY");
	    map.put("4","NIPPUN-PUNI");
	    
	    List<String> perfectCouples = code.checkPerfectCouple(map);
	    System.out.println(perfectCouples);
	}
		
}