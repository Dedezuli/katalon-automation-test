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

WebUI.navigateToUrl('https://newprmdev.kalbenutritionals.web.id/PromoOnline/ManPower')

not_run: WebUI.click(findTestObject('Ready to Pay/Maximize'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Man Power/Man Power List/a_List Form RFP'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Man Power/Man Power List/btnCreateRFP_on_ListFormRFP'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Man Power/Man Power List/button_FindSupplier'))

WebUI.setText(findTestObject('Man Power/Man Power List/input_search_Supplier'), Supplier)

WebUI.click(findTestObject('Man Power/Man Power List/button_Select_Supplier'))

WebUI.setText(findTestObject('Man Power/Man Power List/input_INVOICE_NUMBER'), Invoice_Number)

WebUI.setText(findTestObject('Man Power/Man Power List/input_INVOICE_DESC'), Invoice_Desc)

WebUI.setText(findTestObject('Man Power/Man Power List/input_TAX_INV_NUMBER'), Tax_Invoice_Num)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Man Power/Man Power List/a_ADD POA'))

WebUI.setText(findTestObject('Man Power/Man Power List/input_Search POA_AddPOA'), Search_POA)

WebUI.delay(15)

WebUI.click(findTestObject('Man Power/Man Power List/button_SelectPOA_AddPOA'))

if (Amount != '') {
    WebUI.setText(findTestObject('Man Power/Man Power List/input_FirstPOA_AMOUNT'), Amount)
}

if (PPH != '') {
    WebUI.selectOptionByLabel(findTestObject('Man Power/Man Power List/select_FirstPOA_TarifPPN'), PPH, false)
}

if (PPN != 'No PPN') {
    WebUI.selectOptionByLabel(findTestObject('Man Power/Man Power List/select_FirstPOA_TarifPPH'), PPN, false)
}

WebUI.scrollToElement(findTestObject('Man Power/Man Power List/input_search POA_InvoiceLine'), 3)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Man Power/Man Power List/a_Save_RFP'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Man Power/Man Power List/a_Submit_RFP'))

WebUI.waitForElementPresent(findTestObject('Man Power/Man Power List/a_Push RFP'), 350)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Man Power/Man Power List/a_Push RFP'))

WebUI.waitForElementPresent(findTestObject('Man Power/Man Power List/a_Print RFP'), 350)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Man Power/Man Power List/a_Print RFP'))

WebUI.waitForElementPresent(findTestObject('Man Power/Man Power List/button_Back_Print RFP'), 350)

WebUI.delay(15)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

