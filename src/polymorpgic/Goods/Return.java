package polymorpgic.Goods;

public class Return {
	public static Goods Return1(String type) {
		Goods goods=null;
		if(type.equals("TV")) {
			goods=new Tvs();
		}else if(type.equals("food")){
			goods=new Foods();
		}
		return goods;
	}
}
