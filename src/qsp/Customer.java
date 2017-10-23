package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Customer extends BaseTest {
	@Test(groups= {"Customer","smoke"})
	public void createCustomer()
	{
		Reporter.log("createCustomer",true);
	}
	@Test(groups= {"Customer"})
	public void editCustomer()
	{
		Reporter.log("editCustomer",true);
	}
	@Test(groups= {"Customer"})
	public void removeCustomer()
	{
		Reporter.log("removeCustomer",true);
	}

}
