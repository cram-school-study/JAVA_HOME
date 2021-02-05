import java.util.Calendar;

public class Ex46_class_Calender {
	public static void main(String[] args) {
		String[] yoil = {"","��","��","ȭ","��","��","��","��"};
		Calendar today = Calendar.getInstance();
		
		//��¥ǥ��
		System.out.println(today.get(Calendar.YEAR)+"��");
		System.out.println(today.get(Calendar.MONTH)+1);
		System.out.println(today.get(Calendar.DATE));
		System.out.println(yoil[today.get(Calendar.DAY_OF_WEEK)]);
		System.out.println(today.get(Calendar.WEEK_OF_YEAR) + "��/52��"); // �� ���� ���° ��
		
		//�ð�ǥ��
		System.out.println(today.get(Calendar.HOUR));
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		System.out.println(today.get(Calendar.MILLISECOND));
		
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(1993, 3, 21); // ������ - 1993�� 4�� 21��
		System.out.println(date1);
		System.out.println(toString(date1));
		
		date2.set(2020, 10, 20);
		
		long difference =
				(date2.getTimeInMillis()-date1.getTimeInMillis());
		System.out.println("��ƿ� �� �Դϴ�. " + difference/1000);
		System.out.println("��ƿ� �� �Դϴ�. " + (difference/1000)/60);
		System.out.println("��ƿ� �ð� �Դϴ�. " + (difference/1000)/(60*60));
		System.out.println("��ƿ� �� �Դϴ�. " + (difference/1000)/(60*60*24));
		System.out.println("��ƿ� �� �Դϴ�. " + (difference/1000)/(60*60*24*7));
		System.out.println("��ƿ� �� �Դϴ�. " + (difference/1000)/(60*60*24*30));
		System.out.println("��ƿ� ���� �Դϴ�. " + (difference/1000)/(60*60*24*365));
		
		date1.add(Calendar.MONTH, 1);
		System.out.println(date2.MONTH);
	}
	
	public static String toString(Calendar date) {
		String[] yoil = {"","��","��","ȭ","��","��","��","��"};
		return date.get(Calendar.YEAR)+"�� " + 
				(date.get(Calendar.MONTH)+1)+ "��" +
				(date.get(Calendar.DATE)) + "�� " +
				yoil[(date.get(Calendar.DAY_OF_WEEK))] +"����";
		
	}
}
