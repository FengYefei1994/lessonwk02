package Interface2;

public class Test00 {
	public static void main(String[] args) {
 
		//把墨盒、纸张当成打印机的属性进行初始化；
		//墨盒、纸张更换后，替换颜色，纸张大小
		Inbox inbox1=new Grayinbox();
		paper paper=new A4paper();
		
		//实例化打印机
		Printer p =new Printer();
		
		//把墨盒、纸张放进打印机中
		p.setInbox(inbox1);
		p.setPaper(paper);
		
		//打印
		p.print();
	}
}
