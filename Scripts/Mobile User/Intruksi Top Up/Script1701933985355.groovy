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

Mobile.startApplication('C:\\Users\\RMA\\Downloads\\batpay-version-1.0.0-debug.apk', true)

//Mobile.tap(findTestObject('Object Repository/Aplikasi/android.webkit.WebView'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button - Mulai Sekarang'), 0)

Mobile.setText(findTestObject('Object Repository/Aplikasi/android.widget.EditText (5)'), '08123456789', 0)

Mobile.setText(findTestObject('Object Repository/Aplikasi/android.widget.EditText (6)'), 'qweqwe123', 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button - Masuk (1)'), 0)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('Object Repository/Aplikasi/android.widget.TextView - Top Up'), 'Top Up')

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button (1)'), 0)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('Object Repository/Aplikasi/android.widget.TextView - Petunjuk Top Up'), 'Petunjuk Top Up')

Mobile.closeApplication()

