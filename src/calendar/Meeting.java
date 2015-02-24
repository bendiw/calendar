package calendar;

import java.util.Date;
import java.util.List;
import org.joda.time.*;

public class Meeting {
	
	private LocalDate date;
	private String description;
	private String title;
	private List<Person> attending;
	private String startTime;
	private String endTime;
	private String room;
	
	public int convertTime(){
		
	}
	
	public String getDuration(){
		
	}
	
	public Meeting(LocalDate date, String start, String end, String title){
		this.date=date;
		this.startTime=start;
		this.endTime=end;
		this.title=title;
	}
	
	
	public LocalDate getDate(){
		return this.date;
	}
	
	
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getStartTime() {
		return startTime;
	}


	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}


	public String getEndTime() {
		return endTime;
	}


	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}


	public String getRoom() {
		return room;
	}


	public void setRoom(String room) {
		this.room = room;
	}


	public static void main(String[] args) {
		Meeting m = new Meeting(new LocalDate());
		System.out.println(m.getDate());
	}

}
