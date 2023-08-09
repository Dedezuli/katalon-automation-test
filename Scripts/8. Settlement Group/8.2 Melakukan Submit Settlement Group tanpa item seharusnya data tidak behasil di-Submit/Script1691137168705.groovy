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

WebUI.setText(findTestObject('Login/input_UserName'), Username)

WebUI.setText(findTestObject('Login/input_Password'), Password)

WebUI.setText(findTestObject('Login/input_Captcha'), 'aa')

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Login/button_Log In'))

WebUI.delay(3)

WebUI.navigateToUrl('https://newprmdev.kalbenutritionals.web.id/PRO_RFSV2/Index')

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Settlement Group/a_Create'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Settlement Group/button_GROUPING_LOV'))

WebUI.setText(findTestObject('Settlement Group/input_search_Grouping'), Grouping)

WebUI.click(findTestObject('Settlement Group/button_Select_Grouping'))

WebUI.click(findTestObject('Settlement Group/button_POA NUMBER_LOV'))

WebUI.setText(findTestObject('Settlement Group/input_search_POA Number'), POA)

WebUI.click(findTestObject('Settlement Group/button_search_POA Number'))

WebUI.click(findTestObject('Settlement Group/button_Select_POA Number'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Settlement Group/button_Submit'))

WebUI.click(findTestObject('Settlement Group/button_OK'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementPresent(findTestObject('Settlement Group/div_Mohon Ceklist Completed Data ke 1 Di Menu Item'), 3)

WebUI.closeBrowser()

