package com.porwau.playarea;

public class HashChainingDemo {

	public static void main(String[] args) {

		ChainedHashTable cHash = new ChainedHashTable(10);
		
		cHash.put("porwal", new Emp(1, "utkarsh", "porwal"));
		cHash.put("khanna", new Emp(1, "mayank", "khanna"));
		cHash.put("singh", new Emp(1, "sachin", "singh"));
		cHash.put("rawat", new Emp(1, "ashu", "rawat"));
		cHash.put("baroni", new Emp(1, "lily", "baroni"));
		
		System.out.println(cHash.get("rawat"));


	}

}
