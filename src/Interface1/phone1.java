package Interface1;

public class phone1 extends Phone implements Videop,Audiop,Takephoto,Internet{

	@Override
	public void Internet(String name) {
		System.out.println("浏览"+name);
		
	}

	@Override
	public void Takephoto(String name) {
		System.out.println("拍摄"+name);
		
	}

	@Override
	public void Audiop(String name) {
		System.out.println("听"+name);
		
	}

	@Override
	public void Videop(String name) {
		System.out.println("观看"+name);
		
	}

	@Override
	public void message() {
		System.out.println("双方互相发短信！");

	}

	@Override
	public void phoneCall() {
		System.out.println("双方互相打电话！");
	}
}
