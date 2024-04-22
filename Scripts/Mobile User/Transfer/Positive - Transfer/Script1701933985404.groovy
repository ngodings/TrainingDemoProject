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

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button - Mulai Sekarang'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Aplikasi/android.widget.EditText'), '08123456789', 0)

Mobile.setText(findTestObject('Object Repository/Aplikasi/android.widget.EditText (1)'), 'qweqwe123', 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button - Masuk'), 0)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('Object Repository/Aplikasi/android.widget.TextView - Transfer'), 'Transfer')

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button'), 0)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('Object Repository/Aplikasi/android.widget.Button - Ke Sesama BATPay'), 'Ke Sesama BATPay')

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button - Ke Sesama BATPay'), 0)

Mobile.setText(findTestObject('Object Repository/Aplikasi/android.widget.EditText (2)'), '082082082082', 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button - Lanjut'), 0)

Mobile.delay(2)

Mobile.verifyElementText(findTestObject('Object Repository/Aplikasi/android.widget.TextView - 082082082082'), '082082082082')

Mobile.setText(findTestObject('Object Repository/Aplikasi/android.widget.EditText (3)'), '10000', 0)

Mobile.setText(findTestObject('Object Repository/Aplikasi/android.widget.EditText (4)'), 'uang jajan 1', 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button - Konfirmasi'), 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.TextView - 2'), 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.TextView - 2'), 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.TextView - 3'), 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.TextView - 3'), 0)

Mobile.delay(5)

Mobile.closeApplication()


