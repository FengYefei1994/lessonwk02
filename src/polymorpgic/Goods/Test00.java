package polymorpgic.Goods;

import java.util.Scanner;

public class Test00 {

	public static void main(String[] args) {
		System.out.println("输入想要咨询的商品价格：TV/food？");
		Scanner scan=new Scanner(System.in);
		String good1=scan.next();
		Goods goods=Return.Return1(good1);      //调用静态Return1，确认生产哪一具体产品对象————向上转型
		scan.close();
		goods.printPrice();
	}

}
