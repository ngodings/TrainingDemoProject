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

import java.text.SimpleDateFormat
import java.util.Calendar

def namaUsaha = "Aptikaa2023"

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.BatpanelUrl)

WebUI.setText(findTestObject('Object Repository/Page_Masuk  admin/input_email'), 'operation@batpay.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Masuk  admin/input_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_Masuk  admin/button_Masuk'))

WebUI.click( findTestObject('Object Repository/Page_Dasbor  admin/a_95                        Usaha'))

WebUI.click(findTestObject('Object Repository/Page_Dasbor  admin/a_95                        Permintaan') )

WebUI.sendKeys(findTestObject('Object Repository/Page_Permintaan Buka Usaha  admin/input_Set ulang_form-control') , namaUsaha)

WebUI.delay(1)

// Get current time
def currentTime = Calendar.getInstance()

// Set the desired execution time (e.g., 10:30 AM)
currentTime.set(Calendar.HOUR_OF_DAY, 15)
currentTime.set(Calendar.MINUTE, 06)
currentTime.set(Calendar.SECOND, 0)
currentTime.set(Calendar.MILLISECOND, 0)

// Calculate the delay in milliseconds
def delay = (currentTime.timeInMillis - System.currentTimeMillis())

// Print a message with the scheduled execution time
def sdf = new SimpleDateFormat("yyyyMMdd-HH:mm:ss.SSS")
println "Scheduled to run at: ${sdf.format(currentTime.time)}"

println "Current Time: ${currentTime.time}"

println "System Time: ${System.currentTimeMillis()}"

println "delay: $delay"

//  Delay the execution
Thread.sleep(delay)

WebUI.click(findTestObject('Object Repository/Page_Permintaan Buka Usaha  admin/a_Lihat') )

println "Scheduled to run at: ${sdf.format(currentTime.time)}"

WebUI.delay(2)

