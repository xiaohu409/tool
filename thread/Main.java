
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread() {
			@Override
			public void run () {
				System.out.println(isAlive());
			}
		};
		OneThread one = new OneThread();
		OneThread two = new OneThread();
		OneThread three = new OneThread();
		OneThread four = new OneThread();
		OneThread five = new OneThread();
		t.start();
		one.start();
		two.start();
		three.start();
		four.start();
		five.start();
	}

}
