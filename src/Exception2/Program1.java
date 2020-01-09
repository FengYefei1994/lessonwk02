package Exception2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Person a = new Person();
		try {

			System.out.print("请输入年龄：");
			Scanner input = new Scanner(System.in);
			int age1 = input.nextInt();
			try {
				a.setAge(age1);
			} catch (Exception e) {
				//System.out.println("年龄在1~100之间！");
				e.printStackTrace();
			}

		} catch (InputMismatchException e) {

			System.out.println("请输入一个为整数的年龄！");
			throw new RuntimeException();
		}

		finally {
			System.out.print("实际年龄为："+a.getAge());
			System.out.println("\n欢迎提出建议！");
		}
	}
}
