package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class User extends BaseTest {
	@Test(groups= {"User","smoke"})
	public void createuser()
	{
		Reporter.log("createUser",true);
	}
	@Test(groups= {"User"})
	public void edituser()
	{
		Reporter.log("edituser",true);
	}
	@Test(groups= {"User"})
	public void removeuser()
	{
		Reporter.log("removeUser",true);
	}

}
