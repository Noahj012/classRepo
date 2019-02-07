
public class Rectangle
{
	
	private Point leftUpper;
	private Point leftLower;
	private Point rightUpper;
	private Point rightLower;
	
	public Rectangle(Point leftUpper, Point leftLower, Point rightUpper, Point rightLower)
	{
		super();
		this.leftUpper = leftUpper;
		this.leftLower = leftLower;
		this.rightUpper = rightUpper;
		this.rightLower = rightLower;
	}

	/**
	 * @return the leftUpper
	 */
	public Point getLeftUpper() 
	{
		return new Point(leftUpper);
	}

	/**
	 * @return the leftLower
	 */
	public Point getLeftLower() 
	{
		return new Point(leftLower);
	}

	/**
	 * @return the rightUpper
	 */
	public Point getRightUpper() 
	{
		return new Point(rightUpper);
	}

	/**
	 * @return the rightLower
	 */
	public Point getRightLower() 
	{
		return new Point(rightLower);
	}

	/**
	 * @param leftUpper the leftUpper to set
	 */
	public void setLeftUpper(Point leftUpper) 
	
	{
		this.leftUpper = leftUpper;
	}

	/**
	 * @param leftLower the leftLower to set
	 */
	public void setLeftLower(Point leftLower) 
	{
		this.leftLower = leftLower;
	}

	/**
	 * @param rightUpper the rightUpper to set
	 */
	public void setRightUpper(Point rightUpper) 
	{
		this.rightUpper = rightUpper;
	}

	/**
	 * @param rightLower the rightLower to set
	 */
	public void setRightLower(Point rightLower) 
	{
		this.rightLower = rightLower;
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Rectangle\n [leftUpper=" + leftUpper + ",\n leftLower=" + leftLower + ",\n rightUpper=" + rightUpper
				+ ",\n rightLower=" + rightLower + "]";
	}

	public int change (Point p)
	{
		return 0;
	}

}
