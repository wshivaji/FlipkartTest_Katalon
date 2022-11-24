import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser("https://flipkart.com/")

WebUI.maximizeWindow()

WebUI.click(findTestObject("Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/input_Sign up with your mobile number to ge_72f4e5"))

WebUI.click(findTestObject("Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/button_"))

WebUI.mouseOver(findTestObject("Object Repository/Page_Flipkart Offers  Deals of the Day - Ge_862de5/span_Electronics"))

WebUI.waitForPageLoad(4)

WebUI.mouseOver(findTestObject("Object Repository/Page_Flipkart Offers  Deals of the Day - Ge_862de5/span_Home  Furniture"))

WebUI.waitForPageLoad(4)

WebUI.mouseOver(findTestObject("Object Repository/Page_Flipkart Offers  Deals of the Day - Ge_862de5/span_Men"))

WebUI.waitForPageLoad(4)

WebUI.mouseOver(findTestObject("Object Repository/Page_Flipkart Offers  Deals of the Day - Ge_862de5/span_Sports, Books  More"))

WebUI.waitForPageLoad(4)

WebUI.mouseOver(findTestObject("Object Repository/Page_Flipkart Offers  Deals of the Day - Ge_862de5/span_TVs  Appliances"))

WebUI.waitForPageLoad(4)

WebUI.mouseOver(findTestObject("Object Repository/Page_Flipkart Offers  Deals of the Day - Ge_862de5/span_Women"))

WebUI.waitForPageLoad(4)

WebUI.closeBrowser()


