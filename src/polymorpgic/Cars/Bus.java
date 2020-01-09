package polymorpgic.Cars;

public class Bus extends Cars {

	private int[] discount1 = new int[] { 3, 7, 30, 150 };
	private int[] discount2 = new int[] { 9, 8, 7, 6 };

	String[] Arr1 = new String[] { "1", "金杯", "16", "京6566754", "800" };
	String[] Arr2 = new String[] { "2", "金龙", "16", "京8696997", "800" };
	String[] Arr3 = new String[] { "3", "金杯", "34", "京9696996", "1500" };
	String[] Arr4 = new String[] { "4", "金龙", "34", "京8696998", "1500" };

	public int discount1(int daynum) {

		if (daynum >= discount1[3]) {
			discount = discount2[3];
		} else if (daynum >= discount1[2]) {
			discount = discount2[2];
		} else if (daynum >= discount1[1]) {
			discount = discount2[1];
		} else if (daynum >= discount1[0]) {
			discount = discount2[0];
		} else {
			discount = 10;
		}
		return discount;
	}


	public int dayprice0(int num) { // 选择租赁轿车时进行的分支——车辆种类，选择对应价格
		switch (num) {
		case 1:
			dayprice = 800;
			break;
		case 2:
			dayprice = 800;
			break;
		case 3:
			dayprice = 1500;
			break;
		case 4:
			dayprice = 1500;
			break;
		default:
			dayprice = 0;
			break;
		}
		return dayprice;
	}
	
	public void show2() {
		super.show(Arr1, Arr2, Arr3, Arr4);
	}
}
