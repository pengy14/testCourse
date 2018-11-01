import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValidCircleTest {
	ValidCircle validCircle;
	@Before
	public void setUp() throws Exception {
		validCircle=new ValidCircle();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculate() {
	    Point point1=new Point();
        Point point2=new Point();
        Point point3=new Point();
        point1.x=0;
        point1.y=0;
        point2.x=0;
        point2.y=0;
        point3.x=0;
        point3.y=8;
		assertEquals(-1, validCircle.calculate(null, point1, point1),0.1);
		assertEquals(-1, validCircle.calculate(point1, null, point1),0.1);
		assertEquals(-1, validCircle.calculate(point1, point1, null),0.1);
        assertEquals(-1, validCircle.calculate(point1, point2, point3),0.1);//1,2
        point2.y=8;
        assertEquals(-1, validCircle.calculate(point1, point2, point3),0.1);//2,3
        point1.y=8;
        point2.y=0;
        assertEquals(-1, validCircle.calculate(point1, point2, point3),0.1);//1,3
        point1.x=0;
        point1.y=0;
        point2.x=0;
        point2.y=4;
        point3.x=0;
        point3.y=8;
        assertEquals(-1, validCircle.calculate(point1, point2, point3),0.1);
        point3.x=3;
        point3.y=0;
        
        assertEquals(2.5, validCircle.calculate(point1, point2, point3),0.1);
        point1.x=3;
        point1.y=0;
        point2.x=0;
        point2.y=4;
        point3.x=0;
        point3.y=8;
        assertEquals(2.5, validCircle.calculate(point1, point2, point3),0.1);
	}

	@Test
	public void testCalRadius() {
		assertEquals(2.5,ValidCircle.calRadius(0.0, 0.0, 1.5, 2.0),0.1);
	}

}
