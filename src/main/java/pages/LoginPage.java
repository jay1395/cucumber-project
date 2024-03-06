package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
WebDriver driver;
	
	public void openBrowser() {
		driver = new FirefoxDriver();
	}
	
	public void openLoginPage() {
		 driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=5DR82Z1QA0s&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJvYXV0aF9rZXkiOiI1RFI4MloxUUEwcyIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNzAyNzY0ODk5LCJpYXQiOjE3MDI3NjM2OTksImp0aSI6IjM5NmMwYzhiLTE3ZjEtNDY3NS04OGUxLWVjMzVmMGFlNWFmNSIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.iQhiAJg04hllqqzI7nxvNczymP2C4oazjJ2aWN922bzclKBe0shiTdVks3Vkzp_QzgxSdIm5o3vhCdGGYrzBFWoLiKAzVkfgqjdUwrzIY4K53fOElE6LYIq_Q-W1KWQb9pxqZlUcGSz-3hu71_iUs-i0_9XovsLHv-U0xXbo_0KMrAJi6IsEmpjedSpLbQWt_y97cZSYIztmLfAFqqhgit79rtTdZKuo7EClvrRHTLu1LhbtZT7VHtB5vPci2VRjiKSjVNMyW_pFJS5dWddii1IQSCCGWf19cPgfhxIYBBsroFsvb6oRpnQNkDx5WaXwzJjk07M8F5DkXHwr8Bq13Q&preferred_environment=");	
	}
	
	public String readTitle() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		return actualTitle;
	}
	
	public void enterEmailPassword(String a, String b) {
		driver.findElement(By.id("usernameInput-input")).sendKeys(a);
		driver.findElement(By.id("password-input")).sendKeys(b);		
	}
	
	public void clickOnLoginButton() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", driver.findElement(By.id("signIn")));
	}
	
	public String readEmailErr() {
		String actualErr = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualErr);
		return actualErr;
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	

	
}
