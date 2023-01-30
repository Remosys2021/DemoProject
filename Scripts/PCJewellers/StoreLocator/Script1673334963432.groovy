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

WebUI.navigateToUrl('https://www.pcjeweller.com/')

WebUI.click(findTestObject('Object Repository/PNG/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/a_Store Locator'))

WebUI.switchToWindowTitle('Store Locator | PC Jeweller')

WebUI.setText(findTestObject('Object Repository/PNG/Page_Store Locator  PC Jeweller/input_Store Locator_hc-search'), '411057')

WebUI.click(findTestObject('Object Repository/PNG/Page_Store Locator  PC Jeweller/input_My Location_locatoraid-search-form-button'))

WebUI.click(findTestObject('Object Repository/PNG/Page_Store Locator  PC Jeweller/div_Plot No-5, N-3, CIDCO, Aurangabad , Mah_dee2c6'))

WebUI.closeBrowser()

