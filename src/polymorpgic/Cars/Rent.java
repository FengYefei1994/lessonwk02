package polymorpgic.Cars;

import java.util.Scanner;

public class Rent {
	static int dayprice;
	static int daynum;
	static int discount;
	int totalmoney;

	public static void rent() {
		String[] title = new String[] { "序号", "品牌", "型号", "*车牌号码*", "日租金" };
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入想要租赁的车辆类型序号：" + "\n1、轿车" + "\n2、客车");		
		
		switch (scan.nextInt()) {
		case 1:                                             //选择租赁轿车时进行的分支
		{
			Sedan s1 = new Sedan();
			for (int i = 0; i < title.length; ++i) {
				System.out.print(title[i] + "\t");
			}
			System.out.println();
			
			s1.show1();
			System.out.println("\n请输入想要租赁轿车的序号：");
			dayprice=s1.dayprice0(scan.nextInt());
			System.out.println("请输入想要租赁轿车的天数：");		
			discount=s1.discount1(scan.nextInt());
			s1.totalmoney(discount, dayprice, daynum);
			break;
		}
		
		case 2:
		{
			Bus s2 = new Bus();
			for (int i = 0; i < title.length; ++i) {
				System.out.print(title[i] + "\t");
			}
			System.out.println();
			s2.show2();

			System.out.println("\n请输入想要租赁客车的序号：");
			dayprice=s2.dayprice0(scan.nextInt());
			System.out.println("请输入想要租赁客车的天数：");		
			discount=s2.discount1(scan.nextInt());
			s2.totalmoney(discount, dayprice, daynum);			
			break;						
		}	
		default:
			break;		
		}
		scan.close();
	}
}
