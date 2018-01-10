package com.porwau.lcode.easy;

public class ShuffleString {

    private static String restoreString(String s, int[] indices) {
        int length=indices.length;
        char[] shuffleArray = new char[length];
        for(int i=0;i<length;i++){
            shuffleArray[indices[i]]=s.charAt(i);
        }            
        return String.valueOf(shuffleArray);
    }
	public static void main(String[] args) {
		String reverseThis = "aaiougrt";
		System.out.println(reverseThis + " is shuffled to : "+ restoreString(reverseThis, new int[]{4,0,2,6,7,3,1,5}));
	}

}
