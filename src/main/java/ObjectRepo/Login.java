package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
@FindBy(id="email")
private WebElement emailTF;
@FindBy(id="password")
private WebElement passWordTF;
@FindBy(id="last")
private WebElement loginBTN;

public Login(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void emailTf(WebDriver driver,String username) {
	emailTF.sendKeys(username);
}
public void passWordTf(WebDriver driver,String pwd) {
	passWordTF.sendKeys(pwd);
}
public void loginBTN(WebDriver driver,String username) {
	loginBTN.click();}


}
