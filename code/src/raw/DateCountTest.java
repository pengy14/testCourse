package raw;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DateCountTest {

	DateCount dateCount;
	@Before
	public void setUp() throws Exception {
		 dateCount=new DateCount();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsLeapYear() {
		assertEquals(true,DateCount.isLeapYear(2000));
		assertEquals(true,DateCount.isLeapYear(2004));
		assertEquals(false,DateCount.isLeapYear(1999));
		assertEquals(false,DateCount.isLeapYear(100));
	}

	@Test
	public void testDateIsValid() {
		assertEquals(false,dateCount.dateIsValid(2111, 12, 11));
		assertEquals(false,dateCount.dateIsValid(1899, 12, 11));
		assertEquals(false,dateCount.dateIsValid(1991, -1, 11));
		assertEquals(false,dateCount.dateIsValid(1991, 13, 11));
		assertEquals(false,dateCount.dateIsValid(2000, 12, 0));
		assertEquals(false,dateCount.dateIsValid(2000, 12, 33));
		assertEquals(true,dateCount.dateIsValid(1991, 12, 11));
	}

	@Test
	public void testCalculate() {
		assertEquals(-1,dateCount.calculate(1800, 12, 11));
		assertEquals(365,dateCount.calculate(1991, 12, 31));
	}

}
