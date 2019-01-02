package testNG;
import raw.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.junit.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
	DateCount dateCount;
	
	
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

  @BeforeClass
  public void beforeClass() {
		 dateCount=new DateCount();
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
