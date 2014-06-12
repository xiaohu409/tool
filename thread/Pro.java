class Pro {
	private static int FLAG = 3;
	
	public static synchronized void setFlag() {
		if (FLAG > 0) {
			Pro.FLAG  = Pro.FLAG - 1  ;
			System.out.println(Pro.FLAG);
		}
		else {
			System.out.println("不好意思没有票了");
		}
	}
}
