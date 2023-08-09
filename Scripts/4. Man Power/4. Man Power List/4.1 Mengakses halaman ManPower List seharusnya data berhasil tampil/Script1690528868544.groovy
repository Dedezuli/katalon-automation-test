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
import groovy.json.JsonSlurper

// Path menuju file JSON di direktori Data Files
def filePath = 'Data Files/user.json'

// Membaca isi file JSON ke dalam string
def jsonString = new File(filePath).text

// Mengurai JSON
def jsonSlurper = new JsonSlurper()
def jsonObject = jsonSlurper.parseText(jsonString)

// Mengambil nilai dari JSON
def userHBO = jsonObject.user_HBO
println(userHBO)

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login/a_Login'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Login/input_UserName'), userHBO)

WebUI.setText(findTestObject('Login/input_Password'), Password)

WebUI.setText(findTestObject('Login/input_Captcha'), 'aa')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Login/button_Log In'))

WebUI.delay(3)

WebUI.navigateToUrl('https://newprmdev.kalbenutritionals.web.id/PromoOnline/ManPower')

not_run: WebUI.click(findTestObject('Ready to Pay/Maximize'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Man Power/Man Power List/a_List Form RFP'), 3)

WebUI.closeBrowser()

