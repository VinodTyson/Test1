package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Product extends BaseTest {
	@Test(groups= {"Product","smoke"})
	public void createproduct()
	{
		Reporter.log("createProduct",true);
	}
	@Test(groups= {"Product"})
	public void editproduct()
	{
		Reporter.log("editProduct",true);
	}
	@Test(groups= {"Product"},enabled=false)
	public void removeproduct()
	{
		Reporter.log("removeProduct",true);
	}

}
