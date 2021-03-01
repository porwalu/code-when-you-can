package com.porwau.restful.messenger.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.porwau.restful.messenger.database.DatabaseClass;
import com.porwau.restful.messenger.model.Message;

public class MessageService {

	private Map<Long, Message> msgMap = DatabaseClass.getMessageDB();

	public Map<Long, Message> getMsgMap() {
		return msgMap;
	}

	public void setMsgMap(HashMap<Long, Message> msgMap) {
		this.msgMap = msgMap;
	}

	public List<Message> getAllMessages() {
		return new ArrayList<Message>(msgMap.values());
	}

	public List<Message> getAllMessagesForAnYear(int year) {
		List<Message> messagesForYear = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		for (Message msg : msgMap.values()) {
			cal.setTime(msg.getCreatedAt());
			if (cal.get(Calendar.YEAR) == year) {
				messagesForYear.add(msg);
			}
		}
		return messagesForYear;
	}

	public List<Message> getAllMessagesPaginated(int start, int size) {
		List<Message> messagesPaginated = new ArrayList<>(msgMap.values());
		if(start > messagesPaginated.size()) {return null;}
		if(start+size > messagesPaginated.size()) {
			return messagesPaginated.subList(start, messagesPaginated.size());
			}else {
				return messagesPaginated.subList(start, start+size);
			}
	}

	public Message getMessage(Long id) {
		return getMsgMap().get(id);

	}

	public Message createMessage(Message message) {
		message.setId(getMsgMap().size() + 1);
		message.setCreatedAt(new Date());
		getMsgMap().put(message.getId(), message);
		return message;

	}

	public Message updateMessage(long messageId, Message message) {
		if (!getMsgMap().containsKey(messageId)) {
			return null;// doesnt exist
		} else {
			message.setCreatedAt(getMsgMap().get(messageId).getCreatedAt());
			getMsgMap().put(message.getId(), message);
			return message;
		}
	}

	public Message deleteMessage(long messageId) {
		return msgMap.remove(messageId);
	}
}
