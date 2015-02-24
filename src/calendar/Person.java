package calendar;

import java.util.List;
import org.joda.time.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Person {
	
	
	
	public static void main(String[] args) {
		Map<LocalDate, List<Meeting>> m = new HashMap<LocalDate,List<Meeting>>();
		Person p = new Person();
		Meeting me = new Meeting(new LocalDate());
		try {
		    Thread.sleep(1000);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		Meeting m2 = new Meeting(new LocalDate());
		if(m.containsKey(me.getDate())) {
	        //Add to existing list
	        m.get(me.getDate()).add(me);

	    } else {
	        //Create new list
	        List<Meeting> meetings = new ArrayList<Meeting>(1);
	        meetings.add(me);
	        m.put(me.getDate(), meetings);
	    }
		if(m.containsKey(m2.getDate())) {
	        //Add to existing list
	        m.get(m2.getDate()).add(m2);

	    } else {
	        //Create new list
	        List<Meeting> meetings = new ArrayList<Meeting>(1);
	        meetings.add(m2);
	        m.put(m2.getDate(), meetings);
	    }

//		p.m.put(m2.getDate(),m2);
//		System.out.println(p.m.get(4));
		System.out.println(m.size());
		System.out.println(m.get(m2.getDate()));
	}
	
	private String name;
	private String email;
	private String idNo;
	private ArrayList<Group> groups;
	private Calendar cal;
	
	public boolean isMemberOf(Group group){
		if(groups.contains(group)){
			return true;
		}
		return false;
	}

	public Calendar getCalendar(){
		return this.cal;
	}
	
	
	private boolean isValidName(String name){
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (! (Character.isLetter(c)) && !(c==' ')) {
				return false;
			}
			if(c==' '){
				count++;
			}
		}
		if(count==0){
			return false;
		}
		String[] parts = name.split(" ");
		String firstName = parts[0];
		String surName = parts[1];
		if(firstName.length()<2 || surName.length()<2){
			return false;
		}
		return true;
		}
	
	private boolean isValidEmail(String email){
		int atCount=0;
		if(email=="\0"){
			return true;
		}
		for (int i = 0; i < email.length(); i++) {
			char c = email.charAt(i);
			if(c=='@'){
				atCount++;
			}
		}
		if(atCount==0||atCount>1){
			return false;
		}
		return true;
	}

	public void setName(String name) {
		if (isValidName(name)){
			this.name = name;
		}else{
			throw new IllegalArgumentException("Invalid name!");
		}
	}

	public void setEmail(String email){
		if(isValidEmail(email)){
			this.email=email;
		}
		else{
			throw new IllegalArgumentException("Invalid email!");
		}
	}

	public String getName(){
		return this.name;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public String getID(){
		return this.idNo;
	}

	
}

