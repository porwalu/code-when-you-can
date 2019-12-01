package com.porwau.lcode.easy;

/**
 * Defanged IP is one which has dots (.) of IP octets sorrouned with '[]'
 * e.g. Defanged IP for 1.1.1.1 is 1[.]1[.]1[.]1
 * @author Utkarsh Porwal
 *
 */
public class DefangIP {

    /**
     * @param address - IP address in string format.
     * @return - Defanged IP in char array
     */
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
    	System.out.println("Defanged IP is " +String.valueOf(defangIPaddr("11110.100.100.100")));
    }
}
