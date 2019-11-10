/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.regex.*;
class Code {
	public List checkPerfectCouple(HashMap<String,String> map){
	     
	     List<String> list=new ArrayList<String>();
	     for( Map.Entry mapEle : map.entrySet() )
	     {
	          
	           String key =(String) mapEle.getKey();
	           String value =(String) mapEle.getValue();
	           String[] couple = value.split("-");
	           int counter = 0;
	           int len =0;
	           if(couple[0].length()>couple[1].length())
	           {
	               len = couple[0].length();
	               
	               for(int i =0;i<len;i++)
	               {
	                   if(couple[1].contains(String.valueOf(couple[0].charAt(i))))
	                   {
	                       counter++;
	                   }else
	                   {
	                       break;
	                   }
	               }
	           }else{
	               
	                len = couple[1].length();
	            
	               for(int i =0;i<len;i++)
	               {
	                   if(couple[0].contains(String.valueOf(couple[1].charAt(i))))
	                   {
	                       counter++;
	                   }else
	                   {
	                       break;
	                   }
	               }
	           }
	           
	           if(counter == len )
	           {
	           
	             //System.out.println(key);
	             list.add(key);
	           }
	     }
	     return list;
	}
}