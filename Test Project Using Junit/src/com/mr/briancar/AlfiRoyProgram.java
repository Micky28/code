package com.mr.briancar;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AlfiRoyProgram {
	    public static List<Integer> generatePrimeNumbers(int number){
	        if(number==0)
	            return Arrays.asList(0);
	        if(number==1)
	            return Arrays.asList(1);
	        for(int i = 2; i<=number;i++){
	            if(number%i==0){
	                return Arrays.asList(i);
	            }
	        }
	        return null;
	    }
	    
	    public static void main(String args[] ) throws Exception {
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int[] price = new int[n];
	        for(int i = 0; i < n ; i++){
	            price[i] = s.nextInt();
	            List<Integer> list = generatePrimeNumbers(price[i]);
	            if(list!=null)
	                System.out.println(price[i]-list.get(0));
	        }
	    }
	
}
