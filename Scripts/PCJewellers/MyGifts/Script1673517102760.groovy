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

WebUI.callTestCase(findTestCase('PCJewellers/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PNG/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/a_WelcomeRemo1'))

WebUI.click(findTestObject('Object Repository/PNG/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/a_My Account'))

WebUI.click(findTestObject('Object Repository/PNG/Page_Account  Gold  Diamond  Online Jewelle_3bdbfd/a_My Gifts'))

WebUI.click(findTestObject('Object Repository/PNG/Page_Account Information - My Gifts  Gold  _8d3810/div_No Records Found'))

WebUI.verifyElementText(findTestObject('Object Repository/PNG/Page_Account Information - My Gifts  Gold  _8d3810/div_No Records Found'), 
    'No Records Found')

WebUI.click(findTestObject('Object Repository/PNG/Page_Account Information - My Gifts  Gold  _8d3810/a_WelcomeRemo1'))

WebUI.click(findTestObject('Object Repository/PNG/Page_Account Information - My Gifts  Gold  _8d3810/a_Logout'))

WebUI.closeBrowser()

