import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;
import java.lang.*;


/**
 * Created by jussi on 1/29/17.
 */

class SalisTest{


    public static void main(String[] args){

        Pattern p = Pattern.compile("[a-z]{1,3}[0-9]{1,3}[A-Z]{1,3}");
	String password =   "Abc1A2";
	StringBuilder sb1 = new StringBuilder();
	StringBuilder sb2 = new StringBuilder();
	StringBuilder sb3 = new StringBuilder();
	char[] charArray = password.toCharArray();
	String word =null;		
	for(int i=0; i<charArray.length;i++){			
		word= Character.toString(charArray[i]);
		if(word.matches("[a-z]")){	
			if(!sb1.substring(0).equals(word))		
				sb1.append(word);

		}
		if(word.matches("[0-9]")){
			if(!sb2.substring(0).equals(word))
				sb2.append(word);	
			}	
		
		if(word.matches("[A-Z]")){
			if(!sb3.substring(0).equals(word))
				sb3.append(word);


		}

	}	
		

	StringBuilder sb = new StringBuilder();
		sb.append(sb1.toString());
		sb.append(sb2.toString());
		sb.append(sb3.toString());
		System.out.println(sb.substring(0));
		System.out.println(sb.toString());	
	
	Matcher m = p.matcher(sb.toString());	
		System.out.println(m.find());			

    }




}
