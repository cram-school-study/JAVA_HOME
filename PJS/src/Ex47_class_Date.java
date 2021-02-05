import java.util.Calendar;

public class Ex47_class_Date {
	public static void main(String[] args) {
		String[] yoil = {"","��","��","ȭ","��","��","��","��"};
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		 
		Calendar sDay = Calendar.getInstance(); // ������
		Calendar eDay = Calendar.getInstance(); // ������
		
//		sDay.set(year, month-1, 1);
//		eDay.set(year, month, 1); // �� ���� ���� ù���� set�� �ϸ� 
//		
//		eDay.add(Calendar.DATE, -1); // �� ������ ��ġ�� ���� ������ ��¥�� Ȯ���� �ʿ䰡 ����. 
				
		for(int i=1; i < 13; i++) {
			sDay.set(year, i-1, 1);
			eDay.set(year, i, 1); // �� ���� ���� ù���� set�� �ϸ�
			eDay.add(Calendar.DATE, -1); // �� ������ ��ġ�� ���� ������ ��¥�� Ȯ���� �ʿ䰡 ����. 
			
			START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK); // ù°���� ���� ��������.. �� ��ĭ�� ����� ����
			END_DAY = eDay.get(Calendar.DATE); // ������ ��¥�� ���´�.
			
			System.out.println("\t\t\t\t" + year + "��\t\t"+ i + "��");
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
