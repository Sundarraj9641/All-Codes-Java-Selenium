package com.asianpaints.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots 
{
	public static void CaptureScreen(WebDriver driver,String filename) throws IOException
    {
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //TakesScreenshot ts = (TakesScreenshot)driver;
        //File scr = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src , new File("./Screenshot/" + filename+".png"));
    }

}
