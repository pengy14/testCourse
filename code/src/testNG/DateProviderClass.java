package testNG;
import org.testng.annotations.DataProvider;

public class DateProviderClass {
	 @DataProvider(name = "leapYearProvider")
	 public static Object[][] leapYear() {
		int[] test= {2000,2004,1999,100};
		Object [][] objArray = {{2000,true},{2004,true},{1999,false},{100,false}};
		return objArray;
	 }
	
	 @DataProvider(name = "dateValidProvider")
	 public static Object[][] dateIsValid() {
		int[] test= {2000,2004,1999,100};
		Object [][] objArray = {{2111, 12, 11,false},{1899, 12, 11,false},{1991, -1, 11,false},{1991, 13, 11,false},{2000, 12, 0,false},{2000, 12, 33,false},{1991, 12, 11,true}};
		return objArray;
	 }
	 
	 @DataProvider(name = "calculateProvider")
	 public static Object[][] calculate() {
		int[] test= {2000,2004,1999,100};
		Object [][] objArray = {{1800, 12, 11,-1},{1991, 12, 31,365}};
		return objArray;
	 }
}
