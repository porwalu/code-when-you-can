package com.porwau.lcode.easy;

public class DefangIP {

    private static char[] defangIPaddr(String address) {
        char []ch = new char[address.length()+6];
       int j = 0;
        for(int i = 0; i< address.length(); i++){    
            if (address.charAt(i) != '.'){
                 ch[i+j] = address.charAt(i);     
            } else{
                ch[i+j] = '[';
                ch[i+j+1] = '.';
                ch[i+j+2] = ']';
                j+=2;
            }                              
        } 
        return ch;
    }
    
    public static void main(String[] args) {
    	System.out.println("Defanged IP is " +String.valueOf(defangIPaddr("1.1.1.1")));
    }
}
