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

def phone = '086086086086'
def pass = 'qweqwe123'

Mobile.startApplication(GlobalVariable.PathAPK, true)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button - Mulai Sekarang'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Aplikasi/android.widget.EditText'), phone, 0)

Mobile.setText(findTestObject('Object Repository/Aplikasi/android.widget.EditText (1)'), pass, 0)

Mobile.tap(findTestObject('Object Repository/Aplikasi/android.widget.Button - Masuk'), 0)

Mobile.delay(1)

Mobile.checkElement( findTestObject('Object Repository/Aplikasi/android.widget.TextView - Penutupan akun sedang diproses oleh Tim BATPay selama 2x24 jam pada hari kerja. Mohon tunggu konfirmasi melalui email terdaftar'), false)