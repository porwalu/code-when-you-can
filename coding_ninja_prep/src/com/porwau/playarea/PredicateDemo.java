package com.porwau.playarea;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<String> p = (a) -> a.equals("Utkarsh");

		System.out.println(p.test("Utkarsh"));

	}

}
