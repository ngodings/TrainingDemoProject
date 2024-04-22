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

def name = 'lals'
def phone = '0895340933102'
def pass = 'qweqwe123'
def email = 'lala@yopmail.com'


Mobile.startApplication(GlobalVariable.PathAPK, true)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button - Mulai Sekarang'), 0)


Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button - Daftar'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Aplikasi/android.widget.TextView - Daftar'), 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.EditText (9)'), 0)

Mobile.setText(findTestObject('Object Repository/Aplikasi/android.widget.EditText (10)'), name, 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.EditText (11)'), 0)

Mobile.setText(findTestObject('Object Repository/Aplikasi/android.widget.EditText (12)'), phone, 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button - Kirim OTP'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.EditText (13)'), 0)

Mobile.setText(findTestObject('Object Repository/Aplikasi/android.widget.EditText (14)'), email, 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button - Kirim OTP (1)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.EditText (15)'), 0)

Mobile.setText(findTestObject('Object Repository/Aplikasi/android.widget.EditText (16)'), pass, 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.EditText (17)'), 0)

Mobile.setText(findTestObject('Object Repository/Aplikasi/android.widget.EditText (18)'), pass, 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button - Lanjut (1)'), 0)