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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.flipkart.com/')

WebUI.click(findTestObject('Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/input_Get access to your Orders, Wishlist a_a7d639'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/input_Get access to your Orders, Wishlist a_a7d639'))

WebUI.click(findTestObject('Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/button_'))

WebUI.click(findTestObject('Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/div_Mobiles'))

WebUI.click(findTestObject('Object Repository/Page_Mobile Phones Online at Best Prices in India/div_Brand__24_Dny'))

WebUI.click(findTestObject('Object Repository/Page_All Categories- Buy Products Online at_3f99e0/div_Price -- Low to High'))

WebUI.closeBrowser()

