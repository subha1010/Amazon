package com.cucumber.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseclass {
		public static WebDriver driver;

		public static WebDriver launchBrowser(String browserName) throws Exception {
		try {
		if (browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		} 
		
		else if (browserName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver",
		System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new Exception();
		}
		}
		
		//Url Details

		public static void getUrlDetails(String url) {
			 driver.get(url);
		
			}
		
		//For Title
		
		public static String getTitleDetails() {
			String title = driver.getTitle();
			return title;
			}
		
		//isDisplayed

			public static boolean isDisplayed(WebElement element) throws Exception {
			try {
			boolean displayed = element.isDisplayed();
			return displayed;
			} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
			}
			}
			
			//isEnabled

			public static boolean isEnabled(WebElement element) throws Exception {
			try {
			boolean enabled = element.isEnabled();
			return enabled;
			} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
			}

			}
			
			//isSelected
			
			public static boolean isSelected(WebElement element) throws Exception {
			try {
			waitforVisibilityofElements(element);
			boolean selected = element.isSelected();
			return selected;
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
			}
			
			}
			
			//waitforvisibility

			private static void waitforVisibilityofElements(WebElement element) throws Exception {
				try {
					WebDriverWait wb = new WebDriverWait(driver, 30);
					wb.until(ExpectedConditions.visibilityOf(element));
					} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception();
					}
					}
			
			//to clear
			
			public static void elementClear(WebElement element) throws Exception {
				try {
				waitforVisibilityofElements(element);
				element.clear();
				} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new Exception();
				}
				}
			
			//click
			
			public static void elementClick(WebElement element) throws Exception {
				try {
				waitforVisibilityofElements(element);
				element.click();
				} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new Exception("Element not clickable" + element);

				}

				}
			
			
                 //DropDown 
				public static void selectDropDown(WebElement element, String options,
				String values) throws Exception {
				try {
				Select sc = new Select(element);
				if (options.equals("value")) {
				sc.selectByValue(values);
				} else if (options.equals("index")) {
				sc.selectByIndex(Integer.parseInt(values));
				} else if (options.equals("visibilityOfText")) {
				sc.selectByVisibleText(values);
				}
				} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new Exception();
				}
				}
				
				
				    public static void mouseHover(WebElement element) throws Exception {
                    try {
                    	waitforVisibilityofElements(element);
					Actions ac = new Actions(driver);
					ac.moveToElement(element).build().perform();
					} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception();
					}
					}
			

				    public static void scrollIntoView(WebElement element) throws Exception {
				    	try {
				    	JavascriptExecutor js = (JavascriptExecutor) driver;
				    	js.executeScript("arguments[0].scrollIntoView();", element);
				    	} catch (Exception e) {
				    	e.printStackTrace();
				    	throw new Exception();
				    	}

				    	}

				    	public static void scrollBy(String width, String height) throws Exception {
				    	try {
				    	JavascriptExecutor js = (JavascriptExecutor) driver;
				    	js.executeScript("windows.scrollBy(" + width + "," + height + ")");
				    	} catch (Exception e) {
				    	// TODO Auto-generated catch block
				    	e.printStackTrace();
				    	throw new Exception();
				    	}

				    	}

				    	public static void scrollTo() throws Exception {
				    	try {
				    	JavascriptExecutor js = (JavascriptExecutor) driver;
				    	js.executeScript("windows.scrollTo(0,document.body.scrollHeight)");
				    	} catch (Exception e) {
				    	// TODO Auto-generated catch block
				    	e.printStackTrace();
				    	throw new Exception();
				    	}
				    	}

				    	public static String getElementText(WebElement element) throws Exception {
				    	try {
				    	waitforVisibilityofElements(element);
				    	String sText = element.getText();
				    	return sText;
				    	} catch (Exception e) {
				    	// TODO Auto-generated catch block
				    	e.printStackTrace();
				    	throw new Exception();
				    	}
				    	}
				    	
				    	public static void sendKeys(WebElement element, String value)
				    	{
				    		element.sendKeys(value);
				    	}
				    	
				    	public static void highLightWebElement(WebElement element)
				    	{
				    		JavascriptExecutor js = (JavascriptExecutor) driver;
				    		js.executeScript("arguments[0].setAttribute('style','background: green;border:solid 2px red');", element);
				    	}

			
				
				}
