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

Mobile.startApplication('C:\\Users\\RMA\\Downloads\\batpay-version-2.3.35-debug(sb).apk', true)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button - Mulai Sekarang (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button - Daftar'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Aplikasi/android.widget.TextView - Daftar'), 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.EditText (9)'), 0)

Mobile.setText(findTestObject('Object Repository/Aplikasi/android.widget.EditText (10)'), 'lala', 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.EditText (11)'), 0)

Mobile.setText(findTestObject('Object Repository/Aplikasi/android.widget.EditText (12)'), '087779668268', 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.EditText (13)'), 0)

Mobile.setText(findTestObject('Object Repository/Aplikasi/android.widget.EditText (14)'), 'lala@yopmail.com', 0)

Mobile.scrollToText('Lanjut')

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.EditText (15)'), 0)

Mobile.setText(findTestObject('Object Repository/Aplikasi/android.widget.EditText (16)'), 'qweqwe123', 0)

Mobile.scrollToText('Lanjut')

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.EditText (17)'), 0)

Mobile.setText(findTestObject('Object Repository/Aplikasi/android.widget.EditText (18)'), 'qweqwe123', 0)

Mobile.scrollToText('Handphone')

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button - Kirim OTP'), 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button - Kirim OTP (1)'), 0)

Mobile.scrollToText('Lanjut')

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button - Lanjut (1)'), 0)

Mobile.closeApplication()

