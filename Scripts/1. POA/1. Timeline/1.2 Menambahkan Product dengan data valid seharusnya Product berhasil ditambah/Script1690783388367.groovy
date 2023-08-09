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
//import table row
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

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

WebUI.click(findTestObject('POA/Timeline/Create Program/a_PoA'))

WebUI.click(findTestObject('POA/Timeline/Create Program/a_Timeline'))

not_run: WebUI.click(findTestObject('POA/Timeline/Create Program/Maximize_Form'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('POA/Timeline/Create Program/a_Create Program'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('POA/Timeline/Create Program/input_NamaProgram'), Nama_Program)

WebUI.selectOptionByLabel(findTestObject('POA/Timeline/Create Program/select_Tipe Program'), Tipe_Program, false)

WebUI.selectOptionByLabel(findTestObject('POA/Timeline/Create Program/select_Payment Type'), Payment_Type, false)

WebUI.click(findTestObject('POA/Timeline/Create Program/button_StartDate'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('POA/Timeline/Create Program/a_startDate', [('Start_Date') : Start_Date]))

WebUI.click(findTestObject('POA/Timeline/Create Program/button_EndDate'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('POA/Timeline/Create Program/a_endDate', [('End_Date') : End_Date]))

WebUI.setText(findTestObject('POA/Timeline/Create Program/textarea_Description'), Description)

WebUI.setText(findTestObject('POA/Timeline/Create Program/textarea_Background'), Background)

WebUI.setText(findTestObject('POA/Timeline/Create Program/textarea_Objective'), Objective)

WebUI.setText(findTestObject('POA/Timeline/Create Program/textarea_BrandingExposure'), Branding_Exposure)

WebUI.setText(findTestObject('POA/Timeline/Create Program/textarea_Obtained Compensation'), Obtained_Compensation)

WebUI.click(findTestObject('POA/Timeline/Create Program/button_FindProgramKN'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('POA/Timeline/Create Program/button_SelectProgramKN'))

WebUI.click(findTestObject('POA/Timeline/Create Program/button_FindJenisProgram'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('POA/Timeline/Create Program/button_SelectJenisProgram'))

WebUI.click(findTestObject('POA/Timeline/Create Program/button_FindCOA'), FailureHandling.STOP_ON_FAILURE)

switch (COA) {
    case 'LISTING PRODUCT':
        WebUI.click(findTestObject('POA/Timeline/Create Program/button_BTL_ListingProduct'))

        break
    case 'SPG/MAN POWER':
        WebUI.click(findTestObject('POA/Timeline/Create Program/button_BTL_SPGManPower'))

        break
    case 'FLOOR DISPLAY/PROMOTIONALS PLACE RENT':
        WebUI.click(findTestObject('POA/Timeline/Create Program/button_BTL_Floor DisplayPromotionalPlaceRent'))

        break
    case 'TRADE OFFER CONDITIONAL':
        WebUI.click(findTestObject('POA/Timeline/Create Program/button_BTL_TradeOfferConditional'))

        break
    case 'NBB/DATA':
        WebUI.click(findTestObject('POA/Timeline/Create Program/button_BTL_NBBData'))

        break
    case 'WEAR PACK':
        WebUI.click(findTestObject('POA/Timeline/Create Program/button_BTL_WearPack'))

        break
    case 'OUTLET PROMO INFO PLACEMENT':
        WebUI.click(findTestObject('POA/Timeline/Create Program/button_BTL_OutletPromoInfoPlacement'))

        break
    case 'PROMOTIONAL EQUIPMENT':
        WebUI.click(findTestObject('POA/Timeline/Create Program/button_BTL_PromotionalEquipment'))

        break
    case 'PRODUCT SAMPLE':
        WebUI.click(findTestObject('POA/Timeline/Create Program/button_BTL_ProductSample'))

        break
    case 'KERJASAMA':
        WebUI.click(findTestObject('POA/Timeline/Create Program/button_BTL_Kerjasama'))

        break
    case 'SEMINAR & EVENT':
        WebUI.click(findTestObject('POA/Timeline/Create Program/a_COANext'))

        WebUI.click(findTestObject('POA/Timeline/Create Program/button_BTL_SeminarEvent'))

        break
    case 'AGENCY FEE':
        WebUI.click(findTestObject('POA/Timeline/Create Program/a_COANext'))

        WebUI.click(findTestObject('POA/Timeline/Create Program/button_BTL_ConsumerOfferFee'))

        break
    case 'SPONSORSHIP':
        WebUI.click(findTestObject('POA/Timeline/Create Program/a_COANext'))

        WebUI.click(findTestObject('POA/Timeline/Create Program/button_BTL_Sponsorship'))

        break
    case 'CONSUMER OFFER FEE':
        WebUI.click(findTestObject('POA/Timeline/Create Program/a_COANext'))

        WebUI.click(findTestObject('POA/Timeline/Create Program/button_BTL_ConsumerOfferFee'))

        break
    default:
        WebUI.click(findTestObject('POA/Timeline/Create Program/button_SelectCOA'))

        break
}

//WebUI.click(findTestObject('POA/Timeline/Create Program/button_FindCOA'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('POA/Timeline/Create Program/button_SelectCOA'))
WebUI.click(findTestObject('POA/Timeline/Create Program/button_FindTipeAccount'), FailureHandling.STOP_ON_FAILURE)

switch (Tipe_Account) {
    case 'NKA - MINI MARKET':
        WebUI.click(findTestObject('POA/Timeline/Create Program/button_AccountType_NKAMinimarket'))

        break
    case 'RKA - MINI MARKET':
        WebUI.click(findTestObject('POA/Timeline/Create Program/button_AccountType_RKAMinimarket'))

        break
    case 'INDEPENDENT - MINI MARKET':
        WebUI.click(findTestObject('POA/Timeline/Create Program/button_AccountType_INDMinimarket'))

        break
    case 'INDEPENDENT - TRADITIONAL':
        WebUI.click(findTestObject('POA/Timeline/Create Program/button_AccountType_INDTraditional'))

        break
    case 'INDEPENDENT - GENERAL INSTITUTION':
        WebUI.click(findTestObject('POA/Timeline/Create Program/button_AccountType_INDGeneralInstitution'))

        break
    case 'INDEPENDENT - HOREKA':
        WebUI.click(findTestObject('POA/Timeline/Create Program/button_AccountType_INDHoreka'))

        break
    case 'INDEPENDENT - MEDICAL/FARMASI':
        WebUI.click(findTestObject('POA/Timeline/Create Program/button_AccountType_INDMedicalFarmasi'))

        break
    case 'INDEPENDENT - OTHERS':
        WebUI.click(findTestObject('POA/Timeline/Create Program/button_AccountType_INDOthers'))

        break
    default:
        WebUI.click(findTestObject('POA/Timeline/Create Program/button_SelectTipeAccount'))

        break
}

not_run: WebUI.click(findTestObject('POA/Timeline/Create Program/button_SelectTipeAccount'))

WebUI.setText(findTestObject('POA/Timeline/Create Program/input_KodeSalur'), Kode_Salur)

WebUI.comment('Add Product')

WebUI.click(findTestObject('POA/Timeline/Create Program/a_Product'))

WebUI.click(findTestObject('POA/Timeline/Create Program/button_AddProduct'))

WebUI.click(findTestObject('POA/Timeline/Create Program/input_Product_DIABETASOL COOKIES'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('POA/Timeline/Create Program/button_Product_Add'))

WebUI.setText(findTestObject('POA/Timeline/Create Program/input_Product_PercentContribute'), '100')

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementPresent(findTestObject('POA/Timeline/Create Program/input_Product_PercentContribute'), 3)

