package polymorpgic.Cars;


public abstract class Cars {
	int discount;
	int daynum;
	int dayprice;
	
	String[] Arr1;
	String[] Arr2;
	String[] Arr3;
	String[] Arr4;
	
	public abstract int dayprice0(int num);                                 //定义租车时根据不同类型的日价格
	public abstract int discount1(int daynum);                              //根据天数输出折扣数

	public void totalmoney(int discount,int dayprice,int daynum) {           //计算租车所需钱
		System.out.println("租车共需："+discount * dayprice * daynum / 10+"元！");
	}
	
	
	public void show(String[] Arr1, String[] Arr2, String[] Arr3, String[] Arr4) {            //展示轿车/客车基本信息，供选择
		for (int i = 0; i <Arr1.length; ++i) {
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
