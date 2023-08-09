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

WebUI.selectOptionByLabel(findTestObject('POA/Timeline/Create Program/select_Payment Type'), 'TRANSFER', false)

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

WebUI.comment('Add Outlet')

WebUI.click(findTestObject('POA/Timeline/Create Program/a_OutletMedis Activity'))

WebUI.click(findTestObject('POA/Timeline/Create Program/button_AddOutletActivityPlan'))

not_run: WebUI.switchToFrame(findTestObject('POA/Timeline/Create Program/iframe_Detail Outlet'), 3)

WebUI.click(findTestObject('POA/Timeline/Create Program/button_FindOutlet'))

WebUI.setText(findTestObject('POA/Timeline/Create Program/input_Search Outlet'), Search_Outlet)

WebUI.click(findTestObject('POA/Timeline/Create Program/button_Select Outlet'))

WebUI.click(findTestObject('POA/Timeline/Create Program/button_FindPaid To'))

WebUI.setText(findTestObject('POA/Timeline/Create Program/input_Search_PaidTo'), Search_PaidTo)

WebUI.click(findTestObject('POA/Timeline/Create Program/button_SelectPaidTo'))

WebUI.setText(findTestObject('POA/Timeline/Create Program/input_AvgSales'), '5000000')

WebUI.setText(findTestObject('POA/Timeline/Create Program/input_Target Sales'), Target_Sales)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('POA/Timeline/Create Program/button__btnAddActivityPlan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.selectOptionByIndex(findTestObject('POA/Timeline/Create Program/Select Activity Plan'), Activity_Plan, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('POA/Timeline/Create Program/textarea_ActivityPlan_Description'), Activity_Description, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('POA/Timeline/Create Program/input_ActivityPlan_Price'), Activity_Price, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('POA/Timeline/Create Program/input_ActivityPlan_Quantity'), Activity_Quantity, FailureHandling.STOP_ON_FAILURE)

if (Activity_PPH.equalsIgnoreCase('TRUE')) {
    WebUI.click(findTestObject('POA/Timeline/Create Program/input_ActivityPlan_PPH dipotong'))
} else {
    WebUI.click(findTestObject('POA/Timeline/Create Program/input_ActivityPlan_PPH Tidak Dipotong'))
}

WebUI.scrollToElement(findTestObject('POA/Timeline/Create Program/input_ActivityPlan_PPH dipotong'), 3)

WebUI.waitForElementPresent(findTestObject('POA/Timeline/Create Program/select_ActivityPlan_PPN'), 5)

if (Activity_PPN != 'No PPN') {
    WebUI.selectOptionByLabel(findTestObject('POA/Timeline/Create Program/select_ActivityPlan_PPN'), Activity_PPN, false)
}

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('POA/Timeline/Create Program/button_ActivityPlan_Add'))

WebUI.click(findTestObject('POA/Timeline/Create Program/button_Outlet_Add'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

if (Memo != '') {
    WebUI.click(findTestObject('POA/Timeline/Create Program/input_Use Memo'))

    WebUI.waitForElementPresent(findTestObject('POA/Timeline/Create Program/button_Find Memo'), 5)

    WebUI.click(findTestObject('POA/Timeline/Create Program/button_Find Memo'))

    WebUI.setText(findTestObject('POA/Timeline/Create Program/input_Search_Memo'), Memo)

    WebUI.delay(3)

    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('POA/Timeline/Create Program/button_select_Memo'))

    WebUI.delay(3)

    WebUI.takeFullPageScreenshot()
}

if ((COA == 'FLOOR DISPLAY/PROMOTIONALS PLACE RENT') || (COA == 'PROMOTIONAL EQUIPMENT')) {
    WebUI.click(findTestObject('POA/Timeline/Create Program/a_MUDA'))

    WebUI.click(findTestObject('POA/Timeline/Create Program/input_MUDA_SetMUDA'))

    WebUI.selectOptionByLabel(findTestObject('POA/Timeline/Create Program/Select MUDA_Display'), MUDA_Display, false)

    WebUI.selectOptionByLabel(findTestObject('POA/Timeline/Create Program/Select MUDA_Update'), MUDA_Update, false)

    WebUI.uploadFile(findTestObject('POA/Timeline/Create Program/input_file_MUDA_Left'), MUDA_Left, FailureHandling.STOP_ON_FAILURE)

    WebUI.uploadFile(findTestObject('POA/Timeline/Create Program/input_file_MUDA_Front'), MUDA_Front, FailureHandling.STOP_ON_FAILURE)

    WebUI.uploadFile(findTestObject('POA/Timeline/Create Program/input_file_MUDA_Right'), MUDA_Right, FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(3)

    WebUI.takeFullPageScreenshot()
}

if ((((COA == 'NBB/DATA') || (COA == 'KERJASAMA')) || (COA == 'SEMINAR & EVENT')) || (COA == 'SPONSORSHIP')) {
    WebUI.click(findTestObject('POA/Timeline/Create Program/a_Target Data'))

    WebUI.click(findTestObject('POA/Timeline/Create Program/button_btnAddTargetData'))

    WebUI.selectOptionByLabel(findTestObject('POA/Timeline/Create Program/Select Target Data'), TargetData_ReviewId, false)

    WebUI.setText(findTestObject('POA/Timeline/Create Program/input_DecReviewTarget'), TargetData_DecReviewTarget)

    WebUI.delay(3)

    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('POA/Timeline/Create Program/button_Add_TargetData'))
}

WebUI.click(findTestObject('POA/Timeline/Create Program/button_Save'))

WebUI.waitForElementPresent(findTestObject('POA/Timeline/Create Program/button_Submit'), 3)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('POA/Timeline/Create Program/button_Submit'))

try {
    WebUI.verifyAlertPresent(3)
}
catch (Exception e) {
    WebUI.click(findTestObject('POA/Timeline/Create Program/button_Submit'))
} 

WebUI.waitForAlert(5)

WebUI.acceptAlert(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('POA/Timeline/Create Program/a_Approval'))

WebUI.click(findTestObject('POA/Timeline/Approval/Maximize_Approval'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.verifyElementPresent(findTestObject('POA/Timeline/Approval/Maximize_Approval'), 3)

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath('//*[@id="dtListApproval"]/tbody'))

List<WebElement> table_row = Table.findElements(By.tagName('tr'))

//count table row
int rows_count = table_row.size()

String excelFilePath = 'D:\\Kalbe Nutritionals\\POA\\Test Data.xlsx'

String NoProgram = WebUI.getAttribute(findTestObject('POA/Timeline/Create Program/input_No. Program'), 'value')

not_run: GlobalVariable.No_Program = NoProgram

FileInputStream inputStream = new FileInputStream(new File(excelFilePath))

XSSFWorkbook workbook1 = new XSSFWorkbook(inputStream)

XSSFSheet sheet = workbook1.getSheet('Approval')

//loop for write each approver
for (int i = 1; i < rows_count; i++) {
    String cellApprover = table_row.get(i).getText()

    XSSFRow row = sheet.createRow(GlobalVariable.Row_Approver)

    XSSFCell cell1 = row.createCell(0)

    cell1.setCellValue(cellApprover)

    XSSFCell cell2 = row.createCell(2)

    cell2.setCellValue(NoProgram)

    inputStream.close()

    FileOutputStream outputStream = new FileOutputStream('D:\\Kalbe Nutritionals\\POA\\Test Data.xlsx')

    workbook1.write(outputStream)

    GlobalVariable.Row_Approver = (GlobalVariable.Row_Approver + 1)
}

//write no program to Sheet 'BHO Check Program' for Ready to Pay
if (COA == 'SPG/MAN POWER') {
    XSSFSheet sheet2 = workbook1.getSheet('Man Power')

    XSSFRow row1 = sheet2.createRow(GlobalVariable.MPRow_Program)

    XSSFCell mpcell1 = row1.createCell(6)

    mpcell1.setCellValue(NoProgram)

    //add row for Man Power
    GlobalVariable.MPRow_Program = (GlobalVariable.MPRow_Program + 1 //add row for BHO Check Program
    )
} else {
    XSSFSheet sheet2 = workbook1.getSheet('BHO Check Program')

    XSSFRow row1 = sheet2.createRow(GlobalVariable.BHORow_Program)

    XSSFCell bhocell1 = row1.createCell(0)

    bhocell1.setCellValue(NoProgram)

    GlobalVariable.BHORow_Program = (GlobalVariable.BHORow_Program + 1)
}

FileOutputStream outputStream2 = new FileOutputStream('D:\\Kalbe Nutritionals\\POA\\Test Data.xlsx')

workbook1.write(outputStream2)

workbook1.close()

