import static org.junit.Assert.*;

import org.junit.Test;

public class PointTest {

	private static final int CONSTANT_X = 7;

	@Test
	public void testPoint() {
		Point p = new Point();
		int expected = 0;
		int actual = p.getX();
		assertEquals(expected, actual);
	}

	@Test
	public void testPointPoint() {
		Point p = new Point(new Point(CONSTANT_X,CONSTANT_X));
		int expected = CONSTANT_X;
		int actual = p.getX();
		assertEquals(expected, actual);
	}

	@Test
	public void testPointIntInt() {
		Point p = new Point(CONSTANT_X,CONSTANT_X);
		int expected = CONSTANT_X;
		int actual = p.getX();
		assertEquals(expected, actual);
	}

}
