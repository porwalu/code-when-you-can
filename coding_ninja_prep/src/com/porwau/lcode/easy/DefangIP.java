package com.porwau.lcode.easy;

/**
 * Defanged IP is one which has dots (.) of IP octets surrounded with '[]'
 * e.g. Defanged IP for 1.1.1.1 is 1[.]1[.]1[.]1
 * @author Utkarsh Porwal
 *
 */
public class DefangIP {

    /**
     * @param address - IP address in string form
     * @return - - Defanged IP in char array

     */
    private static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< address.length(); i++){    
            if (address.charAt(i) != '.'){
                 sb.append(address.charAt(i));     
            } else{
                sb.append("[.]");
            }                              
        } 
        return sb.toString();
    }
    
    public static void main(String[] args) {
    	System.out.println("Defanged IP is " + defangIPaddr("1.1.1.1"));
    }
}
