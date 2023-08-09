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

WebUI.click(findTestObject('User Setting/i_profile'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('User Setting/a_Setting'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

if (Jabatan != '') {
    WebUI.click(findTestObject('User Setting/input_Role', [('roleID') : Jabatan]))
}

WebUI.click(findTestObject('User Setting/button_Save_Setting'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Settlement Group/a_BOA'))

WebUI.click(findTestObject('Settlement Group/a_TRANSACTION BOA'))

WebUI.navigateToUrl('https://newprmdev.kalbenutritionals.web.id/PRO_RFSV2/Index')

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Settlement Group/input_SearchToDoList'), Search_POA)

WebUI.click(findTestObject('Settlement Group/button_SearchToDo'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Settlement Group/a_View'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Settlement Group/button_Push'))

WebUI.click(findTestObject('Settlement Group/button_OK'))

WebUI.waitForElementClickable(findTestObject('Settlement Group/a_Back'), 300)

WebUI.delay(7)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

