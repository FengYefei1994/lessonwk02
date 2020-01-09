package Exception1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		
		try {
			Scanner input=new Scanner(System.in);
			System.out.println("请输入课程代号(1~3)：");
			int a= input.nextInt();
			String[] b=new String[3];
			b[0]="数学";
			b[1]="语文";
			b[2]="英语";	
			System.out.println(a+"号是"+b[a-1]);
		} catch (InputMismatchException e) {
			System.out.println("请输入整数！");
			RuntimeException exception=new RuntimeException();
			throw exception;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("请输入1~3之间的数！");
			
			throw new RuntimeException();                        //实例化时省略实例化的部分
			
		}
		finally {
			System.out.println("\n欢迎提出建议！");
		}
	}
}

