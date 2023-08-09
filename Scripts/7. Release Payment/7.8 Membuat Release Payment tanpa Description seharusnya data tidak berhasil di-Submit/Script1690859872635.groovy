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

WebUI.setText(findTestObject('Login/input_UserName'), 'adm.jember')

WebUI.setText(findTestObject('Login/input_Password'), 'asdf')

WebUI.setText(findTestObject('Login/input_Captcha'), 'aa')

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Login/button_Log In'))

WebUI.delay(3)

WebUI.click(findTestObject('Ready to Pay/a_BOA'))

WebUI.click(findTestObject('Ready to Pay/a_TRANSACTION BOA'))

WebUI.click(findTestObject('Release Payment/a_Release Payment'))

not_run: WebUI.click(findTestObject('Ready to Pay/Maximize'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Release Payment/a_Create'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.selectOptionByLabel(findTestObject('Release Payment/select_TipeKasbon'), 'POA', false)

WebUI.click(findTestObject('Release Payment/button_RELEASE DATE'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Release Payment/a_Date28'))

WebUI.click(findTestObject('Release Payment/button_Find_REQUESTOR'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Release Payment/input_search_Pegawai'), Requestor)

WebUI.click(findTestObject('Release Payment/button_Select_Pegawai'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Release Payment/input_DESCRIPTION'), Description)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Release Payment/button_Submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

