package Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

import Asianpaintspages.Homedecor;
import Asianpaintspages.storageAndWardrobes;
import Asianpaintspages.wallPaperDesigns;
import io.cucumber.java.en.And;
//import Asianpaintspages.Homedecor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination{
	WebDriver driver = BaseStep.setupDriver();
	wallPaperDesigns page3;
	storageAndWardrobes page2;
	Homedecor page1;
//	@Given("user is on Homedecor page")
//	public void user_is_on_homedecor_page() throws InterruptedException{
//	    System.out.println("HomeDecor");
//	    page1 = new Homedecor(driver);
//	    page1.homedecor();
//	}
//	@When("user clicks on sofas")
//	public void user_clicks_on_sofas() throws InterruptedException
//	{
//		page1.sofa();
//		
//	}
//	@Then("it should redirect to the sofas")
//	public void it_should_redirect_to_the_sofas() throws InterruptedException{
//		page1.sofa_sub();
//	    
//	}
//	@Then("user should view the specific sofas")
//	public void user_should_view_the_specific_sofas() throws InterruptedException{
//	   page1.selectcity();
//	}
//	@Then("user is on Amritsar")
//	 public void user_is_on_Amritsar() throws InterruptedException {
//		page1.Amritsar();
//	 }
//	 @Then("user clicks on findstore")
//	   public void user_clicks_on_findstore() throws InterruptedException {
//	       page1.findstore();
//	   }
//	@Given("user is on Homedecor page")
//	public void user_is_on_homedecor_page() throws InterruptedException{
//		driver.navigate().to("https://www.asianpaints.com/");
//		page2 = new storageAndWardrobes(driver);
//		page2=PageFactory.initElements(driver, storageAndWardrobes.class);
//	    page2.Homedecor();
//	}
//	@And("user clicks on Storage and Wardrobes")
//	public void user_clicks_on_storage_and_wardrobes() throws InterruptedException{
//		page2 = new storageAndWardrobes(driver);
//		page2=PageFactory.initElements(driver, storageAndWardrobes.class);
//	    page2.wardrobes();
//	}
//	@When("user clicks on recommended Wardrobes")
//	public void user_clicks_on_recommended_wardrobes() throws InterruptedException{
//	   page2.storage();
//	}
//	@And("user is on SelectCity")
//	public void user_is_on_select_city()throws InterruptedException {
//	    page2.Selectcity();
//	}
//	@Then("user chooses one city")
//	public void user_chooses_one_city()throws InterruptedException{
//		page2.onecity();
//	}
//	@And("Book a visit")
//	public void book_a_visit()throws InterruptedException {
//	    page2.Bookavisit();
//	}
//	@Then("user clicks on findstore")
//	public void user_clicks_on_findstore()throws InterruptedException {
//	    page2.findstore();
//	}
//	@And("user will try to write name")
//	public void user_will_try_to_write_name() throws InterruptedException {
//		page2.name();
//	}
//	@Then("Submit the details")
//	public void submit_the_details() {
//	    page2.submit();
//}	
//}
	@Given("user is on Homedecor page")
	public void user_is_on_homedecor_page() throws InterruptedException{
		driver.navigate().to("https://www.asianpaints.com/");
		page3 = new wallPaperDesigns(driver);
		page3=PageFactory.initElements(driver, wallPaperDesigns.class);
	    page3.homedecor1();
	}
	@When("user is on Wallpaper website select one design")
	public void user_is_on_wallpaper_website_select_one_design() throws InterruptedException {
		page3 = new wallPaperDesigns(driver);
		page3=PageFactory.initElements(driver, wallPaperDesigns.class);
		page3.wallpaper();
	}
	@And("user can redirect to designer collection")
	public void user_can_redirect_to_designer_collection() throws InterruptedException {
		page3 = new wallPaperDesigns(driver);
		page3=PageFactory.initElements(driver, wallPaperDesigns.class);
		page3.design();
	}
	@Then("user clicks on any design")
	public void user_clicks_on_any_design() throws InterruptedException {
		page3 = new wallPaperDesigns(driver);
		page3=PageFactory.initElements(driver, wallPaperDesigns.class);
		page3.paint();
	}
	@Then("write {string}")
	public void write(String pc) throws Exception {
//		page3 = new wallPaperDesigns(driver);
//		page3=PageFactory.initElements(driver, wallPaperDesigns.class);
		page3.pin_code(pc);
	}
	@And("user clicks on check")
	public void user_clicks_on_check() throws InterruptedException {
		page3 = new wallPaperDesigns(driver);
		page3=PageFactory.initElements(driver, wallPaperDesigns.class);
		page3.check();
	}
	@And("click on Add To Cart")
	public void click_on_add_to_cart() throws InterruptedException {
		page3 = new wallPaperDesigns(driver);
		page3=PageFactory.initElements(driver, wallPaperDesigns.class);
		page3.addToCart();
		driver.close();
		driver.quit();
	}
}

