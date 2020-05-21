package com.porwau.lcode.easy;

public class DivideWithoutOperators {

	public static void main(String[] args) {
int dividend = -2147483648;
int divisor = -10;

System.out.println("Quotient of division is " + divide(dividend,divisor));
	}

	private static int divide(int dividend, int divisor) {
	     if(divisor == dividend){return 1;}
	        if(dividend == 0){return 0;}
	        if(divisor == 1) {
	        	return dividend;
	        }else if(divisor == -1) {
	        	return -dividend;
	        }
	        boolean divisorNegative = false;
	        boolean dividendNegative = false;
	        int count = 0;
	        if(divisor < 0 ){
	            divisorNegative = true;
	            divisor = -divisor;
	        }
	        if(dividend < 0){
	            dividendNegative = true;
	            dividend = -dividend;
	        }
	        
	        if(divisor > dividend){//both negative or both positve.
	            return 0;
	        }
	        
	        while(dividend >= divisor){
	            dividend-= divisor;
	            count++;
	        }
	    
	        return (dividendNegative||divisorNegative) && !(dividendNegative && divisorNegative) ?-count:count;

	}

}
