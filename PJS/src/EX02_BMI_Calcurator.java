import java.util.Scanner;

public class EX02_BMI_Calcurator {
	public static void main(String[] args) {
		String name;
		int age;
		double height;
		int weight;
		int waist_circumference;
		float bmi_index = 0;
		String grade;
		String gender;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �̸��� �Է��ϼ��� : ");
		name = sc.next();
		System.out.println("����� ���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		System.out.println("����� Ű�� �Է��ϼ��� : ");
		height = sc.nextDouble();
		System.out.println("����� �����Ը� �Է��ϼ��� : ");
		weight = sc.nextInt();
		System.out.println("����� �㸮�ѷ��� �Է��ϼ��� : ");
		waist_circumference = sc.nextInt();
		System.out.println("����� ������ �Է��ϼ���(����/����) : ");
		gender = sc.next();
		
		bmi_index = (float)(weight/((height*0.01)*(height*0.01)));
		// BMI ���� = ������/(Ű*Ű)
		
		
//		1)
//		if(bmi_index < 18.5) grade = "��ü��";
//		else if(18.5 <= bmi_index && bmi_index <= 22.9) grade = "����";
//		else if(23 <= bmi_index && bmi_index <= 24.9)grade = "�����ܰ�"; 
//		else if(25 <= bmi_index && bmi_index <= 29.9) grade = "1�ܰ� ��";
//		else if(30 <= bmi_index && bmi_index <= 34.9) grade = "2�ܰ� ��"; 
//		else grade = "3�ܰ��";
//		
//		if (grade == "����" || grade == "�����ܰ�") {
//			if(gender.equals("����") && waist_circumference >= 90) grade = grade + "�̳�, 1�ܰ� �񸸰� ���赵�� ����մϴ�.";
//			if(gender.equals("����") && waist_circumference >= 85) grade = grade + "�̳�, 1�ܰ� �񸸰� ���赵�� ����մϴ�.";
//		}
//		
//		System.out.printf("%s���� ���̴� %d��, Ű�� %.1f, �����Դ� %d �Դϴ�. \n", name, age, height, weight);
//		System.out.printf("BMI ������ %.1f �Դϴ�. \n", bmi_index);
//		System.out.printf("����� �񸸵��� %s", grade);
		
		
//		2)
		
		// ��ü��      < 18.5
		// ����       18.5 ~ 22.9
		// �����ܰ�   23 ~ 24.9
		// 1�ܰ� ��  25 ~ 29.9
		// 2�ܰ� ��  30 ~ 34.9
		// 3�ܰ� ��   >= 35
		// * �� ���ܰ�� ��ü�� �Ǵ� ����ü������, 3�ܰ� ���� �������� �θ� �� �ִ�.
		
		// BMI ������ �����̰ų� �� ���ܰ�� �㸮�ѷ��� 90cm�̻�, ���� 85cm�̻��̸� ������ 1�ܰ� ��ȯ�ڿ� ����� ����
		// ���� �� ���ܰ� �պ��� ���濡�� BMI�� ���Ҿ� �㸮�ѷ��� ����ž� �Ѵ�.		
	}
}
