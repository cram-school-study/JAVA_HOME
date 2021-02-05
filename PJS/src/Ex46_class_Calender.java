import java.util.Calendar;

public class Ex46_class_Calender {
	public static void main(String[] args) {
		String[] yoil = {"","일","월","화","수","목","금","토"};
		Calendar today = Calendar.getInstance();
		
		//날짜표시
		System.out.println(today.get(Calendar.YEAR)+"년");
		System.out.println(today.get(Calendar.MONTH)+1);
		System.out.println(today.get(Calendar.DATE));
		System.out.println(yoil[today.get(Calendar.DAY_OF_WEEK)]);
		System.out.println(today.get(Calendar.WEEK_OF_YEAR) + "주/52주"); // 그 해의 몇번째 주
		
		//시간표시
		System.out.println(today.get(Calendar.HOUR));
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		System.out.println(today.get(Calendar.MILLISECOND));
		
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(1993, 3, 21); // 실제론 - 1993년 4월 21일
		System.out.println(date1);
		System.out.println(toString(date1));
		
		date2.set(2020, 10, 20);
		
		long difference =
				(date2.getTimeInMillis()-date1.getTimeInMillis());
		System.out.println("살아온 초 입니다. " + difference/1000);
		System.out.println("살아온 분 입니다. " + (difference/1000)/60);
		System.out.println("살아온 시간 입니다. " + (difference/1000)/(60*60));
		System.out.println("살아온 일 입니다. " + (difference/1000)/(60*60*24));
		System.out.println("살아온 주 입니다. " + (difference/1000)/(60*60*24*7));
		System.out.println("살아온 달 입니다. " + (difference/1000)/(60*60*24*30));
		System.out.println("살아온 연도 입니다. " + (difference/1000)/(60*60*24*365));
		
		date1.add(Calendar.MONTH, 1);
		System.out.println(date2.MONTH);
	}
	
	public static String toString(Calendar date) {
		String[] yoil = {"","일","월","화","수","목","금","토"};
		return date.get(Calendar.YEAR)+"년 " + 
				(date.get(Calendar.MONTH)+1)+ "월" +
				(date.get(Calendar.DATE)) + "일 " +
				yoil[(date.get(Calendar.DAY_OF_WEEK))] +"요일";
		
	}
}
