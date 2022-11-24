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

WebUI.click(findTestObject('Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/button_'))

WebUI.click(findTestObject('Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/img_Cart__396cs4 _3exPp9'))

WebUI.click(findTestObject('Object Repository/Page_Flipkart Offers  Deals of the Day - Ge_862de5/span_Electronics'))

WebUI.click(findTestObject('Object Repository/Page_Flipkart Offers  Deals of the Day - Ge_862de5/span_TVs  Appliances'))

WebUI.click(findTestObject('Object Repository/Page_Flipkart Offers  Deals of the Day - Ge_862de5/span_Men'))

WebUI.click(findTestObject('Object Repository/Page_Flipkart Offers  Deals of the Day - Ge_862de5/span_Women'))

WebUI.click(findTestObject('Object Repository/Page_Flipkart Offers  Deals of the Day - Ge_862de5/span_Baby  Kids'))

WebUI.click(findTestObject('Object Repository/Page_Flipkart Offers  Deals of the Day - Ge_862de5/span_Home  Furniture'))

WebUI.click(findTestObject('Object Repository/Page_Flipkart Offers  Deals of the Day - Ge_862de5/span_Sports, Books  More'))

WebUI.click(findTestObject('Object Repository/Page_Flipkart Offers  Deals of the Day - Ge_862de5/a_Flights'))

WebUI.click(findTestObject('Object Repository/Page_Flight Booking  Book Flight Tickets at_79ab8c/input_Round Trip_0-departcity'))

WebUI.click(findTestObject('Object Repository/Page_Flight Booking  Book Flight Tickets at_79ab8c/div_One WayRound TripFromPopular CitiesMumb_3557dc'))

WebUI.click(findTestObject('Object Repository/Page_Flight Booking  Book Flight Tickets at_79ab8c/div_FromPopular CitiesMumbai, INBOMHyderaba_2cadc1'))

WebUI.click(findTestObject('Object Repository/Page_Flight Booking  Book Flight Tickets at_79ab8c/button_30 3175'))

WebUI.click(findTestObject('Object Repository/Page_Flight Booking  Book Flight Tickets at_79ab8c/svg'))

WebUI.click(findTestObject('Object Repository/Page_Flight Booking  Book Flight Tickets at_79ab8c/div_Cabin Class__1XFPmK'))

WebUI.click(findTestObject('Object Repository/Page_Flight Booking  Book Flight Tickets at_79ab8c/span_SEARCH'))

WebUI.click(findTestObject('Object Repository/Page_Flight Booking  Book Flight Tickets at_79ab8c/svg_PRICE__2Pcql8 khcgkf'))

WebUI.click(findTestObject('Object Repository/Page_Flight Booking  Book Flight Tickets at_79ab8c/svg_PRICE__2Pcql8 _1lrvYG'))

WebUI.click(findTestObject('Object Repository/Page_Flight Booking  Book Flight Tickets at_79ab8c/div_IndiGo6E-5284  00151h 45mNon stop  0200_7dc9d5'))

WebUI.click(findTestObject('Object Repository/Page_Flight Booking  Book Flight Tickets at_79ab8c/span_Flight Details'))

WebUI.click(findTestObject('Object Repository/Page_Flight Booking  Book Flight Tickets at_79ab8c/div_Fare Summary'))

WebUI.closeBrowser()

