package Exception2;

public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception { // throws异常谁调用谁解决异常，调用者用catch抓捕异常进行处理
		if (age >= 1 && age <= 100) {
			this.age = age;
		} else {
			// 不满足条件抛出异常
			
			//不带参返回异常
			//throw new AgeException();
			
			//带参返回异常
			throw new AgeException("年龄范围为1~100！");
			
			//抛出异常实例化程序语句精简过程，实例化与抛出异常合为一句
			/*AgeException exception1=new AgeException("年龄范围为1~100！");
			* throw exception1;
			*/
		}
	}
}
