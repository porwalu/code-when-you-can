package com.porwau.designpatterns;

class DB {

	// private static final DB conn = new DB();
	private static DB conn;

	private DB() {

	}

	public static DB getInstance() {
		return conn;
	}

	public static synchronized DB getLazyInstance() {
		if (conn == null) {
			conn = new DB();
		}
		return conn;
	}

	public static DB getLazyInstanceDoubleLock() {
		if (conn == null) {
			synchronized (DB.class) {
				if (conn == null) {
					conn = new DB();
				}
			}
		}
			return conn;
		}

	public void printConn() {
		System.out.println("got conn");
	}
}

public class SingletonDemo {

	public static void main(String[] args) {
		DB conn = DB.getInstance();
		conn.printConn();
	}

}
