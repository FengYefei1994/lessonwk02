package polymorpgic.Cars;


public class Sedan extends Cars {
	
	private int[] discount1=new int[] {7,90,150};
	private int[] discount2=new int[] {9,8,7};

	String[] Arr1 = new String[] {"1","宝马","X6","京NY28588","800"};
	String[] Arr2 = new String[] {"2","宝马","X6","京CNY3284","800"};
	String[] Arr3 = new String[] {"3","别克","林荫大道","京NT37465","300"};
	String[] Arr4 = new String[] {"4","别克","GL8","京NT96968","600",};

	
	public int discount1(int daynum) {         //根据天数输出具体折扣
		
		if(daynum>discount1[2]) {
			discount=discount2[2];
		}else if(daynum>discount1[1]) {
			discount=discount2[1];
		}else if(daynum>discount1[0]) {
			discount=discount2[0];
		}else {
			discount=10;
		}
		return discount;
	}
	
	public int dayprice0(int num) {          //选择租赁轿车时进行的分支——车辆种类，选择对应价格
		switch (num) {
		case 1:
			dayprice = 800;
			break;
		case 2:
			dayprice = 800;
			break;
		case 3:
			dayprice = 300;
			break;
		case 4:
			dayprice = 600;
			break;
		default:
			dayprice = 0;
			break;
		}
		return dayprice;
	}
	
	public void show1() {
		super.show(Arr1, Arr2, Arr3, Arr4);
	}
	
	public void show() {
		for (int i = 0; i < Arr1.length; ++i) {
			System.out.print(Arr1[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < Arr1.length; ++i) {
			System.out.print(Arr2[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < Arr1.length; ++i) {
			System.out.print(Arr3[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < Arr1.length; ++i) {
			System.out.print(Arr4[i] + "\t");
		}
		System.out.println();
	}
}
