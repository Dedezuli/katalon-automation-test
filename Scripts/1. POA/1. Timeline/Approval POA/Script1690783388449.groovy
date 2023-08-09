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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Path menuju file JSON di direktori Data Files
def filePath = 'Data Files/user.json'

// Membaca isi file JSON ke dalam string
def jsonString = new File(filePath).text

// Mengurai JSON
def jsonSlurper = new JsonSlurper()
def jsonObject = jsonSlurper.parseText(jsonString)

// Mengambil nilai dari JSON
def userApproval = jsonObject.user_HBO
println(userApproval)
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login/a_Login'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Login/input_UserName'), userApproval)

WebUI.setText(findTestObject('Login/input_Password'), Password)

WebUI.setText(findTestObject('Login/input_Captcha'), 'aa')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Login/button_Log In'))

WebUI.delay(3)

WebUI.click(findTestObject('User Setting/i_profile'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('User Setting/a_Setting'))

WebUI.delay(3)

WebUI.takeScreenshot()

if (Jabatan != '') {
    WebUI.click(findTestObject('User Setting/input_Role', [('roleID') : Jabatan]))
}

if (Branch != '') {
    WebUI.click(findTestObject('User Setting/input_Branch', [('branchID') : Branch]))
}

WebUI.click(findTestObject('User Setting/button_Save_Setting'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('POA/Timeline/Approval/a_Approval'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('POA/Timeline/Approval/button_Approval POA'), 3)

WebUI.setText(findTestObject('POA/Timeline/Approval/input_Search_POA'), Search_POA)

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('POA/Timeline/Approval/button_View'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('POA/Timeline/Approval/textarea_Comment'), Comment)

WebUI.click(findTestObject('POA/Timeline/Approval/a_Detail_Approval'))

WebUI.click(findTestObject('POA/Timeline/Approval/Maximize_Approval'))

WebUI.delay(3)

WebUI.takeScreenshot()

if ((Action == 'Reject') && (Comment == '')) {
    WebUI.setText(findTestObject('POA/Timeline/Approval/textarea_Comment'), 'Reject')
}

Action = (' ' + Action)

WebUI.click(findTestObject('POA/Timeline/Approval/button_Approval', [('Action') : Action]))

try {
    WebUI.verifyAlertPresent(3)
}
catch (Exception e) {
    WebUI.click(findTestObject('POA/Timeline/Approval/button_Approval', [('Action') : Action]))
} 

WebUI.waitForAlert(3)

WebUI.acceptAlert(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.closeBrowser()

WebUI.closeBrowser()
