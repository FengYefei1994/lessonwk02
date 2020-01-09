package Interface1;

public class Test01 {

	public static void main(String[] args) {
		phone1 p1=new phone1();
		p1.showIn("苹果", "6Plus");
		System.out.println("可实现的功能有：");
		p1.message();
		p1.phoneCall();
		p1.Audiop("小苹果");
		p1.Videop("Troy");                   //带参在接口中定义
		p1.Takephoto("故宫的雪");
		p1.Internet("特朗普作死");

	}

}
