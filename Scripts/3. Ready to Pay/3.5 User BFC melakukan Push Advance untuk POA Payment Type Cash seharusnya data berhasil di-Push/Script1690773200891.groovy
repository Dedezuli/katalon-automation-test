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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login/a_Login'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Login/input_UserName'), 'Dessi')

WebUI.setText(findTestObject('Login/input_Password'), 'AA')

WebUI.setText(findTestObject('Login/input_Captcha'), 'aa')

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Login/button_Log In'))

WebUI.delay(3)

WebUI.click(findTestObject('Ready to Pay/a_BOA'))

WebUI.click(findTestObject('Ready to Pay/a_TRANSACTION BOA'))

WebUI.click(findTestObject('Ready to Pay/a_Ready To Pay'))

not_run: WebUI.click(findTestObject('Ready to Pay/Maximize'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Ready to Pay/input_search_RDTP NO'), 'TXT/BGR/062023/PRO/6')

WebUI.click(findTestObject('Ready to Pay/button_Index_Search'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Ready to Pay/a_VIEW'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('Ready to Pay/input_FILE NAME'), 3)

WebUI.setText(findTestObject('Ready to Pay/input_search_POA'), 'NUR')

WebUI.setText(findTestObject('Ready to Pay/input_date transfer'), '30')

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Ready to Pay/button_Update RDTP'))

WebUI.waitForElementPresent(findTestObject('Ready to Pay/button_OK'), 5)

WebUI.click(findTestObject('Ready to Pay/button_OK'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Ready to Pay/button_Submit Advance'))

WebUI.waitForElementPresent(findTestObject('Ready to Pay/button_OK'), 5)

WebUI.click(findTestObject('Ready to Pay/button_OK'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Ready to Pay/button_Push Advance'))

WebUI.waitForElementPresent(findTestObject('Ready to Pay/button_Print Advance'), 150)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Ready to Pay/button_Print Advance'))

WebUI.waitForElementPresent(findTestObject('Ready to Pay/a_Back_RFS'), 350)

WebUI.delay(10)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementPresent(findTestObject('Ready to Pay/a_Back_RFS'), 5)

WebUI.closeBrowser()

