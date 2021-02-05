import java.util.Calendar;

public class Ex47_class_Date {
	public static void main(String[] args) {
		String[] yoil = {"","일","월","화","수","목","금","토"};
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		 
		Calendar sDay = Calendar.getInstance(); // 시작일
		Calendar eDay = Calendar.getInstance(); // 종료일
		
//		sDay.set(year, month-1, 1);
//		eDay.set(year, month, 1); // 그 다음 월의 첫날로 set을 하면 
//		
//		eDay.add(Calendar.DATE, -1); // 이 과정을 거치면 따로 마지막 날짜를 확인할 필요가 없다. 
				
		for(int i=1; i < 13; i++) {
			sDay.set(year, i-1, 1);
			eDay.set(year, i, 1); // 그 다음 월의 첫날로 set을 하면
			eDay.add(Calendar.DATE, -1); // 이 과정을 거치면 따로 마지막 날짜를 확인할 필요가 없다. 
			
			START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK); // 첫째일이 무슨 요일인지.. 즉 몇칸을 띄울지 예측
			END_DAY = eDay.get(Calendar.DATE); // 지정한 날짜를 얻어온다.
			
			System.out.println("\t\t\t\t" + year + "년\t\t"+ i + "월");
			System.out.println("\t\tSU\tMO\tTU\tWE\tTH\tFR\tSA");
			
			for(int j=1; j<=START_DAY_OF_WEEK; j++) {
				System.out.print("\t");
			}
			
			for(int j=1,n=START_DAY_OF_WEEK; j<=END_DAY; j++, n++) {
				System.out.print((j<10) ? "\t "+j : "\t"+j);
				if( n % 7 == 0 ) System.out.print("\n\t");
			}
			
			System.out.println("\n\n");
		}
	}
}
