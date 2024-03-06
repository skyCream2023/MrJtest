package apiEx;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.LocalDateTime;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ex1 {
	public static void main(String[] args) {
		EventKeeper ek = new EventKeeper();
		NewDinoName ndn = new NewDinoName();
		String dinoName = ndn.dinoName();
		
		
//		//2.이벤트 소개
//		ek.eventLog("feedingTime1", LocalDateTime.of(LocalDate.now(), LocalTime.now()));
//		
//		System.out.println(ek.getEventDateTime("feedingTime1"));
//		
//		ek.logWeekEvent("Park Cleaning",  DayOfWeek.FRIDAY);
//		
//		System.out.println(ek.getWeekEvent("Park Cleaning"));
//		
//		HashMap<DayOfWeek, LocalTime> weeklyTime = new HashMap<>();
//		weeklyTime.put(DayOfWeek.FRIDAY, LocalTime.of(10,30));
//		
//		ek.logWeeklyEvent("Emergency Drill", weeklyTime);
//		
//		System.out.println(ek.getLogWeeklyEvent("Emergency Drill"));
		
//		//3.우리 안전점검 D-day
//		LocalDate lastcheck = LocalDate.of(2024, 2, 25);
//		LocalDate now = LocalDate.now();
//		long safeCheckDay = EventKeeper.nextCageCheckDate(lastcheck,now);
//		
//		System.out.println("다음 안전 점검까지 남은 일 수 : " + safeCheckDay);
		
//		//4. 10개 이름 리스트 출력
//		System.out.println(ndn.dinoName());
		
		//5. 
		System.out.println("새로 태어난 공룡의 전체 이름 : " + dinoName);
	}

}

class dino{
	private String name;
	private int age;
	private LocalDate birthday;
	public dino(String name, int age, LocalDate birthday) {
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public LocalDate getBirth() {
		return birthday;
	}
}



class EventKeeper{
	private HashMap<String, LocalDateTime> eventLog;
	private HashMap<String, DayOfWeek> weekEvent;
	private HashMap<String, HashMap<DayOfWeek, LocalTime>> weeklyEvent;
	
	public EventKeeper() {
		
		eventLog = new HashMap<>();
		weekEvent = new HashMap<>();
		weeklyEvent = new HashMap<>();
	}
	public void eventLog(String event, LocalDateTime eventTime) {
		eventLog.put(event, eventTime);
	}
	public LocalDateTime getEventDateTime(String eventName) {
		return this.eventLog.get(eventName);
	}
	public void logWeekEvent(String event, DayOfWeek dayOfWeek) {
		weekEvent.put(event, dayOfWeek);
	}
	public DayOfWeek getWeekEvent(String event) {
		return this.weekEvent.get(event);
	}
	public void logWeeklyEvent(String event, HashMap<DayOfWeek, LocalTime> weeklyTime) {
		weeklyEvent.put(event,  weeklyTime);
	}
	public HashMap<DayOfWeek, LocalTime> getLogWeeklyEvent(String event){
		return weeklyEvent.get(event);		
	}
	public static long nextCageCheckDate(LocalDate lastcheck, LocalDate now) {
		long lastSafeCheck = ChronoUnit.DAYS.between(lastcheck, now);
		long NextCheckDay = 45 - (lastSafeCheck % 45);
		return NextCheckDay;
	}

	
}

class NewDinoName{
	public NewDinoName() {}
	public String dinoName() {
	List<String> nameList = new ArrayList<>();
	nameList.add("axa");
	nameList.add("nodia");
	nameList.add("comedi");
	nameList.add("samsun");
	nameList.add("codi");
	nameList.add("loopang");
	nameList.add("fidion");
	nameList.add("casa");
	nameList.add("node");
	nameList.add("java");
	
	StringBuilder fullname = new StringBuilder();
	for (int i = 0; i < nameList.size();i++) {
		fullname.append(nameList.get(i));
		if(i < nameList.size() -1) {
			fullname.append(", ");
		}
	}
	return fullname.toString();
	
	}
	
	
}




