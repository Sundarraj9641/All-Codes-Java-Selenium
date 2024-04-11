package com.asianpaints.steps;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.asianpaints.pages.HomeDecor;
import com.asianpaints.pages.InteriorDesigns;
import com.asianpaints.pages.LoginPage;
import com.asianpaints.pages.StorageAndWardrobes;
import com.asianpaints.pages.ViewStore;
import com.asianpaints.pages.Wallpapers;
import com.asianpaints.utils.ScreenShots;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination extends BaseStep {
		LoginPage login;
		ViewStore page5;
			InteriorDesigns page4;
			Wallpapers page3;
			StorageAndWardrobes page2;
			HomeDecor page;
			
//		@Given("User is on home page")
//	    public void user_is_on_home_page() throws InterruptedException {
//			setupDriver();
//	        login = new LoginPage(driver);
//	        //login.pop();
//	    }
//	    @When("User clicks on login button")
//	    public void user_clicks_on_login_button() throws InterruptedException {
//	         login.loginButton();
//	    }
//	    @Then("User enters mobile number")
//	    public void user_enters_mobile_number() throws InterruptedException {
//	        login.enterMobile("9381427483");
//	    }
//	    @Then("User clicks on submit button")
//	    public void user_clicks_on_submit_button() throws InterruptedException {
//	        login.submitButton();   
//	    }
//	    @When("User enters OTP")
//	    public void user_enters_otp() throws InterruptedException {
//	        login.submitButton2();
//	    }
//	    @Then("User again clicks on submit button")
//	    public void user_again_clicks_on_submit_button() throws InterruptedException, IOException {
//	    }
		
		@Given("user is on Homedecor page")
		public void user_is_on_homedecor_page() throws InterruptedException 
		{
			setupDriver();
		    //driver.navigate().to("https://www.asianpaints.com/");
			page = new HomeDecor(driver);
		    System.out.println("HomeDecor");
		    page = new HomeDecor(driver);
		    page.homedecor();
			
		}
		@When("user clicks on sofas")
		public void user_clicks_on_sofas() throws InterruptedException
		{
			page.sofa();
		}
		@Then("it should redirect to the sofas")
		public void it_should_redirect_to_the_sofas() throws InterruptedException 
		{
			page.sofasub();
		}
		@Then("user should view the specific sofas")
		public void user_should_view_the_specific_sofas() throws InterruptedException 
		{
			page.selectcity();
		}
		@Then("user is on Amritsar")
		public void user_is_on_amritsar() throws InterruptedException 
		{
			page.Amritsar();
		}
		@Then("user clicks on findstore")
		public void user_clicks_on_findstore() throws InterruptedException, IOException 
		{
			page.findstore();
		       String actual = driver.findElement(By.xpath("//*[@id=\"globalFormPopUpWoosmap\"]/div/div/div[1]/h3")).getText();
		        String expected = "FIND STORE NEAR ME";
		        System.out.println(actual);
		        System.out.println(expected);
		        Assert.assertEquals(actual,expected);
		        System.out.println("Displayed Successfully");    
		        ScreenShots.CaptureScreen(driver, "screenshot1");
		}
		
		
		
//Scenario2
//			@Given("user is on Homedecor page1")
//			public void user_is_on_homedecor_page1() throws InterruptedException {
//				setupDriver();
//				//driver.navigate().to("https://www.asianpaints.com/");
//				page2 = new StorageAndWardrobes(driver);
//				page2.Homedecor();
//			}
//
//			@And("user clicks on Storage and Wardrobes")
//		public void user_clicks_on_storage_and_wardrobes() throws InterruptedException{
//			
//			//page2 = new StorageAndWardrobes(driver);
//			//page2=PageFactory.initElements(driver, StorageAndWardrobes.class);
//		    page2.wardrobes();
//		}
//		@When("user clicks on recommended Wardrobes")
//		public void user_clicks_on_recommended_wardrobes() throws InterruptedException{
//		   page2.storage();
//		}
//		@And("user is on SelectCity")
//		public void user_is_on_select_city()throws InterruptedException {
//		    page2.Selectcity();
//		}
//		@Then("user chooses one city")
//		public void user_chooses_one_city()throws InterruptedException{
//			page2.onecity();
//		}
//		@And("Book a visit")
//		public void book_a_visit()throws InterruptedException {
//		    page2.Bookavisit();
//		}
//		@Then("user clicks on findstore")
//		public void user_clicks_on_findstore()throws InterruptedException {
//		    page2.findstore();
//		}
//		@And("user will try to write name")
//		public void user_will_try_to_write_name() throws InterruptedException {
//			page2.name();
//		}
//		@Then("Submit the details")
//		public void submit_the_details() throws IOException {
//		    page2.submit();
//		    String actual = driver.findElement(By.xpath("//*[@id=\"globalFormPopUpProduct\"]/div/div/div[1]/h3")).getText();
//	        String expected = "Asian Paints Beautiful Homes Store";
//		    System.out.println(actual);
//	        System.out.println(expected);
//	        Assert.assertEquals(actual,expected);
//	        System.out.println("Displayed Successfully");
//	   ScreenShots.CaptureScreen(driver, "screenshot2");
//	}	
//		//Scenario 3
//		@Given("user is on Homedecor page")
//		public void user_is_on_homedecor_page() throws InterruptedException {
//			setupDriver();
//				page3 = new Wallpapers(driver);
//			    page3.homedecor1();
//		}
//		@When("user is on Wallpaper website select one design")
//		public void user_is_on_wallpaper_website_select_one_design() throws InterruptedException {
//			page3.wallpaper();
//		}
//		@When("user can redirect to designer collection")
//		public void user_can_redirect_to_designer_collection() throws InterruptedException {
//			page3.design();
//		}
//		@Then("user clicks on any design")
//		public void user_clicks_on_any_design() throws InterruptedException {
//			page3.paint();
//		}
//		@Then("write {string}")
//		public void write(String pc) throws InterruptedException, IOException{
//			page3.pin_code(pc);
//		    
//		}
//		@Then("user clicks on check")
//		public void user_clicks_on_check() throws InterruptedException {
//			page3.check();
//		}
//		@Then("click on Add To Cart")
//		public void click_on_add_to_cart() throws InterruptedException, IOException {
//			page3.addToCart();
//			ScreenShots.CaptureScreen(driver, "screenshot3");
//			driver.close();
//			driver.quit();
//		}
//		
//	
//		//Scenario 4
//	@Given("user is on Homedecor")
//	public void user_is_on_homedecor() {	
//		setupDriver();
//			//driver.navigate().to("https://www.asianpaints.com/");
//			page4 = new InteriorDesigns(driver);
//			//page4=PageFactory.initElements(driver, interiorDesignPositive.class);
//		}
//		@When("user is on interior Design Service")
//		public void user_is_on_interior_Design_Service() throws InterruptedException {
////				page4 = new interiorDesignPositive(driver);
////				page4=PageFactory.initElements(driver, interiorDesignPositive.class);
//				page4.interiorDesign();
//		 }
//		@When("user enter the name")
//		public void user_enter_the_name() throws InterruptedException {
//			//page4 = new interiorDesignPositive(driver);
//			//page4=PageFactory.initElements(driver, interiorDesignPositive.class);
//			page4.enterName("Ashritha");				
//		}
//		@When("user enter the Email")
//		public void user_enter_the_email() throws InterruptedException {
//			//page4 = new interiorDesignPositive(driver);
//			page4.Email("sashritha@gmail.com");	
//		  	}
//		@When("user enter the mobile")
//		public void user_enter_the_mobile() throws InterruptedException {
//			//page4 = new interiorDesignPositive(driver);
//			page4.mobile("7386834200");	
//	
//		    }
//		@Then("user enter to the Pincode")
//		public void user_enter_to_the_Pincode() throws InterruptedException {
//			//page4 = new interiorDesignPositive(driver);
//			page4.Pincode("509103");	
//	
//			}
//		@Then("Book Free site visit")
//		public void book_free_site_visit() throws InterruptedException, IOException {
//			//page4 = new interiorDesignPositive(driver);
//			//page4=PageFactory.initElements(driver, interiorDesignPositive.class);
//			page4.BookFreeSitevisit();	
//			ScreenShots.CaptureScreen(driver, "screenshot4");
//			driver.close();
//			driver.quit();
//		}
//	
//	//Scenario 5
		@Given("user is on HomeDecor")
		public void user_is_on_home_decor() throws InterruptedException{
			setupDriver();
			page5 = new ViewStore(driver);
			//page5 = PageFactory.initElements(driver, viewStore.class);
			page5.HomeDecor();
		}
		@When("user clicks on Bathroom fitting")
		public void user_clicks_on_bathroom_fitting() throws InterruptedException {
		    page5.Web();
		}
//		@When("user moves to find at nearest store") 
//		public void user_moves_to_find_at_nearest_store() throws InterruptedException{
//		  page5.nearestStore();
//		}
		@Then("user locate your nearest location")
		public void user_locate_your_nearest_location() throws InterruptedException {
		    page5.City();
		}
		@Then("user clicks on view store")
		public void user_clicks_on_view_store() throws InterruptedException, IOException {
		  page5.viewStore();
		  ScreenShots.CaptureScreen(driver, "screenshot5");
		  driver.close();
		  driver.quit();
		}
	}	

