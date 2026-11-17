package chapter3.oop;

// 실행 단축키 : ctrl + F11
public class MyData {
	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.setMonth(13);
		System.out.println(date.getMonth());
		
		MyDate date2 = new MyDate(2026,13,16);
		System.out.println(date2.getMonth());
		
	}
}
