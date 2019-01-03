package testNG;
import raw.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.junit.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.fest.*;
import org.fest.swing.fixture.FrameFixture;
public class NewTest {
	DateCount dateCount;
	private FrameFixture frame;
	
	@Test(dataProvider="leapYearProvider",dataProviderClass=DateProviderClass.class)
	public void testIsLeapYear(int year,boolean expectResult) {
		Assert.assertEquals(DateCount.isLeapYear(year),expectResult);

	}

	@Test(dataProvider="dateValidProvider",dataProviderClass=DateProviderClass.class)
	public void testDateIsValid(int year,int month,int day,boolean expected) {
		Assert.assertEquals(dateCount.dateIsValid(year, month, day),expected);
	}

	@Test(dataProvider="calculateProvider",dataProviderClass=DateProviderClass.class)
	public void testCalculate(int year,int month,int day,int expected) {
		Assert.assertEquals(dateCount.calculate(year, month, day), expected);
	}

	@Test
	public void testInput() {
		frame.textBox("year").enterText("2019");
		frame.textBox("month").enterText("1");
		frame.textBox("day").enterText("3");
		frame.button("judge").click();
	}
	
	
  @BeforeClass
  public void beforeClass() {
		 dateCount=new DateCount();
		 frame = new FrameFixture(new Input());
		 frame.show();
  }

  @AfterClass
  public void afterClass() {
	  frame.cleanUp();
  }

}
