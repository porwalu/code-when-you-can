package com.porwau.restful.messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.porwau.restful.messenger.model.Message;

public class DatabaseClass {
	
	private static Map<Long,Message> messageDB = new HashMap<>();
	private static Map<Long,Message> profileDB = new HashMap<>();
	static {//Default Message DB
		Message msg1 = new Message( 1L, "What a lovely weather in Bangalore", "Utkarsh");
		Message msg2 = new Message(2L, "Gloomy London. Too much rain", "Utkarsh");
		messageDB.put(1L, msg1);
		messageDB.put(2L, msg2);
	}
	public static Map<Long, Message> getMessageDB() {
		return messageDB;
	}
	public static Map<Long, Message> getProfileDB() {
		return profileDB;
	}
}
