public class Rectangle {
	private static Rectangle instance;
	private int wigth;
	private int height;
	
	private Rectangle() {};
	
	public static Rectangle getInstance() {
		if(instance == null ) {
		return new Rectangle();
	}
		return instance;
	}

	public void setWigthHight(int wigth,int height) {
		this.wigth = wigth;
		this.height = height;
		
	}
	public int getArea() {
		return this.wigth*this.height;
	}
}
