package UnitTests;

import static Servlet.HelloWorld.ADDRESS_PATTERN;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddressRegexTest {
	
	Pattern pattern;
	
	@BeforeGroups(groups="addressTest")
	public void initializePattern() {
		pattern = Pattern.compile(ADDRESS_PATTERN);
		}
	
	@DataProvider(name="address")
	public static Object[][] patterns() {
		return new Object[][] { {"ismail@gmail", true}, {"meryem@yahoo.ti", true}, {"hitch", false}, {"ahmed.za", false},
				{"asmaa@aol", true}};
	}
	
	@Test(groups="addressTest", dataProvider="address")
	public void addressRegexTest(String address, boolean bool) {
		Matcher matcher = pattern.matcher(address);
		boolean matches = matcher.matches();
		Assert.assertEquals(matches, bool);
	}
	
}
