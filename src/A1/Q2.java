package A1;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter person weight in kg: ");
		float w=sc.nextFloat();
		System.out.print("enter person height in meter: ");
		float h=sc.nextFloat();
		float bmi=w/(h*h);
		
		if(bmi<18.5) {
			System.out.println("the person is underweight");
		}
		else if(bmi>18.5&&bmi<24.9) {
			System.out.println("the person has normal weight");
		}
		else if(bmi>25.0&&bmi<29.9) {
			System.out.println("the person is overweight");
		}else {
			System.out.println("the person is obese");
		}
		
		
		

	}

}
