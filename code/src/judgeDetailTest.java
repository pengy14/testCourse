import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class judgeDetailTest {
	private judgeDetail jd;
	 
	@Before
	public void setUp() throws Exception {
		jd=new judgeDetail();
	}
	

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void testIsLeapYear() {
		assertEquals(false,jd.isLeapYear(2001));
		assertEquals(true,jd.isLeapYear(2000));
	}

	@Test
	public void testJudge() {
	}

	@Test
	public void testConvert() {
	}

}
