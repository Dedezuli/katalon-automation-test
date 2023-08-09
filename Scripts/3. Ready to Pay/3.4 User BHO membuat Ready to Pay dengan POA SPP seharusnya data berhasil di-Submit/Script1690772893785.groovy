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
//excel
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.io.File as File
import java.io.FileInputStream as FileInputStream
import java.io.IOException as IOException

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login/a_Login'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Login/input_UserName'), 'Yannuar.Kusuma')

WebUI.setText(findTestObject('Login/input_Password'), 'asdf')

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

WebUI.click(findTestObject('Ready to Pay/a_Create'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Ready to Pay/button_GROUPING'))

WebUI.setText(findTestObject('Ready to Pay/input_search_grouping'), 'POA SPP')

WebUI.click(findTestObject('Ready to Pay/button_Select_grouping'))

WebUI.click(findTestObject('Ready to Pay/button_BRANCH NAME'))

WebUI.setText(findTestObject('Ready to Pay/input_search_Branch'), 'BOGOR')

WebUI.click(findTestObject('Ready to Pay/button_Select_Branch'))

WebUI.click(findTestObject('Ready to Pay/button_DEPARTMENT NAME'))

WebUI.setText(findTestObject('Ready to Pay/input_search_department'), 'CABANG')

WebUI.click(findTestObject('Ready to Pay/button_Select_Department'))

WebUI.selectOptionByLabel(findTestObject('Ready to Pay/Select KN'), 'KN 3', false)

WebUI.selectOptionByLabel(findTestObject('Ready to Pay/Select Type Budget'), 'Budget Allocation', false)

WebUI.selectOptionByLabel(findTestObject('Ready to Pay/Select Payment Type (1)'), 'TRANSFER', false)

WebUI.selectOptionByLabel(findTestObject('Ready to Pay/Select Bank Type'), 'BANK CENTRAL ASIA', false)

WebUI.selectOptionByLabel(findTestObject('Ready to Pay/Select Promo Type'), 'TRADE', false)

WebUI.click(findTestObject('Ready to Pay/button_Search'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Ready to Pay/input_search_POA'), 'NUR ')

WebUI.click(findTestObject('Ready to Pay/First_checkbox'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Ready to Pay/button_Submit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

rdtp = WebUI.getAttribute(findTestObject('Ready to Pay/input_READY TO PAY NO'), 'value')

WebUI.verifyNotMatch(rdtp, '', false)

WebUI.closeBrowser()

