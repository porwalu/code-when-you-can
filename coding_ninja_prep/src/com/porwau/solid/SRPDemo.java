package com.porwau.solid;

class TextParser {
	private String parsedData;

	public TextParser(String input) {
		this.parsedData = input;
	}

	void parseData(String s) {
		this.parsedData = s.toUpperCase();
	}

	public String getParsedData() {
		return parsedData;
	}

	public void setParsedData(String parsedData) {
		this.parsedData = parsedData;
	}

}

class TextPrinter {
	private TextParser tp;

	public TextPrinter(TextParser t) {
		this.tp = t;
	}

	void printData() {
		System.out.println(this.tp.getParsedData());
	}
}

public class SRPDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = " I am utkarsh";
		TextParser parser = new TextParser(input);
		parser.parseData(input);
		TextPrinter printer = new TextPrinter(parser);
		printer.printData();
	}

}
