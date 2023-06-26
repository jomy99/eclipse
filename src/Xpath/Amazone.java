package Xpath;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazone {
	ChromeDriver driver;
@Before
public void setup()
{
	driver= new ChromeDriver();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458706470&hvpos=&hvnetw=g&hvrand=15830320044578167187&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007776&hvtargid=kwd-10573980&hydadcr=14453_2154373");
}
@Test
public void testimg() throws IOException
{
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//copying to drive
	FileHandler.copy(f,new File("C://Users//91890//Pictures/error.png"));
}

}
