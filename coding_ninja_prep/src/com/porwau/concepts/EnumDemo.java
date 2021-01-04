package com.porwau.concepts;

public enum EnumDemo {
	SPICY("Hot chilli"), SWEET("Like Sugar");
	private String description;

	public String getDescription() {
		return description;
	}

	private EnumDemo(String description){
		this.description = description;
	}

	public static void main(String args[]) {
		System.out.println(SPICY.name());
		System.out.println(SPICY.toString());
		System.out.println(SPICY);
		System.out.println(SPICY.getDescription());
		System.out.println(SPICY.getDeclaringClass());
		System.out.println(SPICY.values()[0]);

		for( EnumDemo e:EnumDemo.values()){
			System.out.println(e.getDescription());
		}
		System.out.println(SPICY.equals(SWEET));


		
	}
}
