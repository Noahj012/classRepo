
public class Point
{
	private int x;
	private int y;
	static private int counter = 0;
	
	public Point()
	{
		this(0,0);
		System.out.println("Using default constructor");
	}
	
	public Point (Point p)
	{
		this(p.getX(), p.getY());
	}
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
		++counter;
	}

	
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x = " + x + ", y = " + y + "]";
	}
}
