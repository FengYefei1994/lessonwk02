package Interface2;

public class Printer {
	Inbox inbox;
	paper paper;
	
	public Inbox getInbox() {
		return inbox;
	}
	
	public void setInbox(Inbox inbox) {
		this.inbox=inbox;
	}
	
	public paper getPaper() {
		return paper;
	}
	
	public void setPaper(paper paper) {
		this.paper=paper;
	}
	
	public void print() {
		System.out.println("使用"+inbox.getColor()+"的墨盒在"+paper.getSize()+"的纸张上打印");
	}
}
