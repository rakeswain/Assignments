/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.regex.*;
class Code {
	public Map getStates(String data , String del1,String del2){
	     String[] arr = data.split(Pattern.quote(del1));
	     
	     Map<String , String> map = new HashMap<String,String>();
	     for( String el : arr )
	     {
	          
	           String[] state_cap = el.split(del2);
	           map.put(state_cap[0],state_cap[1]);
	     }
	     return map;
	}
}