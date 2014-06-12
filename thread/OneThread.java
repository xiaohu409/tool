
public class OneThread extends Thread{
	
	@Override
	public void run() {
		System.out.println(this.getName());
		Pro.setFlag();
	}

}
