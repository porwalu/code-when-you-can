package com.porwau.designpatterns;
import java.util.ArrayList;
import java.util.List;

import sun.awt.SubRegionShowable;

class Channel{
	private String title;
	List<Subscriber> subs = new ArrayList<>();

	
	public String getTitle() {
		return title;
	}
	
	void subscribe(Subscriber sub) {
		subs.add(sub);
	}
	
	void unsubscribe(Subscriber sub) {
		subs.remove(sub);
	}
	
	void upload(String title) {
		this.title = title;
		notifyAllSubs();
		
	}
	void notifyAllSubs() {
		
		subs.forEach(p->p.notifyAll());
	//	subs.forEach(Subscriber::notifyAll);
//		for(Subscriber sub: subs) {
//			sub.notifySub();
//		}
	}
}

class Subscriber{
	String name;
	Channel ch;
	
	public Subscriber(String name) {
		this.name = name;
	}

	void subscribeChannel(Channel ch) {
		this.ch = ch;
		ch.subscribe(this);
	}
	
	void notifySub() {
		System.out.println("Hi " + name + ", New Video uploaded:" + ch.getTitle());
	}

	public void unsubscribeChannel(Channel ch) {
		ch.unsubscribe(this);
		ch=null;
	}
}


public class ObserverPattern {

	public static void main(String[] args) {
		Channel javaChannel = new Channel();
		
		Subscriber s1 = new Subscriber("utkarsh");
		Subscriber s2 = new Subscriber("vasu");
		Subscriber s3 = new Subscriber("ashutosh");
		Subscriber s4 = new Subscriber("nitin");
//		javaChannel.subscribe(s1);
//		javaChannel.subscribe(s2);
//		javaChannel.subscribe(s3);
//		javaChannel.subscribe(s4);

		s1.subscribeChannel(javaChannel);
		s2.subscribeChannel(javaChannel);
		s3.subscribeChannel(javaChannel);
		s4.subscribeChannel(javaChannel);


		s4.unsubscribeChannel(javaChannel);
//		javaChannel.unsubscribe(s4);
		javaChannel.upload("How to learn java");


	}

}
