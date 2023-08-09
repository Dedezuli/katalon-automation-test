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
WebUI.click(findTestObject('Ready to Pay/button_Submit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

String excelFilePath = 'D:\\Kalbe Nutritionals\\POA\\Test Data.xlsx'

String RDTPNo = WebUI.getAttribute(findTestObject('Ready to Pay/input_READY TO PAY NO'), 'value')

String FilenameRDTP = WebUI.getAttribute(findTestObject('Ready to Pay/input_FILE NAME'), 'value')

String Periode = WebUI.getAttribute(findTestObject('Ready to Pay/input_PERIODE'), 'value')

String TotalTransfer = WebUI.getAttribute(findTestObject('Ready to Pay/input_Total Transfer'), 'value')

//GlobalVariable.RDTP_No = RDTPNo

FileInputStream inputStream = new FileInputStream(new File(excelFilePath))

XSSFWorkbook workbook1 = new XSSFWorkbook(inputStream)

XSSFSheet sheet1 = workbook1.getSheet('Data Ready to Pay')

//for (int i = 1; i < 4; i++) {
XSSFRow row = sheet1.getRow(1)

XSSFCell cell1 = row.createCell(0)

XSSFCell cell2 = row.createCell(1)

XSSFCell cell3 = row.createCell(3)

XSSFCell cell4 = row.createCell(4)

cell1.setCellValue(RDTPNo)

cell2.setCellValue(Periode)

cell3.setCellValue(FilenameRDTP)

cell4.setCellValue(TotalTransfer)

inputStream.close()

FileOutputStream outputStream = new FileOutputStream('D:\\Kalbe Nutritionals\\POA\\Test Data.xlsx')

workbook1.write(outputStream)

//}
workbook1.close()

WebUI.closeBrowser()

