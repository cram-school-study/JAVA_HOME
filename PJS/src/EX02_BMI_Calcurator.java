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
		System.out.println("당신의 이름을 입력하세요 : ");
		name = sc.next();
		System.out.println("당신의 나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.println("당신의 키를 입력하세요 : ");
		height = sc.nextDouble();
		System.out.println("당신의 몸무게를 입력하세요 : ");
		weight = sc.nextInt();
		System.out.println("당신의 허리둘레를 입력하세요 : ");
		waist_circumference = sc.nextInt();
		System.out.println("당신의 성별을 입력하세요(남자/여자) : ");
		gender = sc.next();
		
		bmi_index = (float)(weight/((height*0.01)*(height*0.01)));
		// BMI 지수 = 몸무게/(키*키)
		
		
//		1)
//		if(bmi_index < 18.5) grade = "저체중";
//		else if(18.5 <= bmi_index && bmi_index <= 22.9) grade = "정상";
//		else if(23 <= bmi_index && bmi_index <= 24.9)grade = "비만전단계"; 
//		else if(25 <= bmi_index && bmi_index <= 29.9) grade = "1단계 비만";
//		else if(30 <= bmi_index && bmi_index <= 34.9) grade = "2단계 비만"; 
//		else grade = "3단계비만";
//		
//		if (grade == "정상" || grade == "비만전단계") {
//			if(gender.equals("남자") && waist_circumference >= 90) grade = grade + "이나, 1단계 비만과 위험도가 비슷합니다.";
//			if(gender.equals("여자") && waist_circumference >= 85) grade = grade + "이나, 1단계 비만과 위험도가 비슷합니다.";
//		}
//		
//		System.out.printf("%s님의 나이는 %d세, 키는 %.1f, 몸무게는 %d 입니다. \n", name, age, height, weight);
//		System.out.printf("BMI 지수는 %.1f 입니다. \n", bmi_index);
//		System.out.printf("당신의 비만도는 %s", grade);
		
		
//		2)
		
		// 저체중      < 18.5
		// 정상       18.5 ~ 22.9
		// 비만전단계   23 ~ 24.9
		// 1단계 비만  25 ~ 29.9
		// 2단계 비만  30 ~ 34.9
		// 3단계 비만   >= 35
		// * 비만 전단계는 과체중 또는 위험체중으로, 3단계 비만은 고도비만으로 부를 수 있다.
		
		// BMI 지수가 정상이거나 비만 전단계라도 허리둘레가 90cm이상, 여성 85cm이상이면 위험이 1단계 비만환자와 비슷한 수준
		// 향후 비만 진단과 합병증 예방에서 BMI와 더불어 허리둘레가 고려돼야 한다.		
	}
}
