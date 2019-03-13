package com.mr.briancar;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckInput {
	public static void checkAndPrint(String message){
    	String sh = "";
    	int i = 0;
        for( ; i<message.length() ;i++) {
        	if(message.charAt(i)=='/' && (i+1<message.length() && message.charAt(i+1)=='/'))
        		break;
        	else
        		sh = sh + message.charAt(i);
        }
        sh = sh.replace("->", ".");
        sh = sh + (message.substring(i,message.length()));
        System.out.println(sh);
    }
    
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while((line=br.readLine())!=null)
        {
            checkAndPrint(line);
        }   
    }
}