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

def phone = '087779668268'

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.BatpanelUrl)

WebUI.click(findTestObject('Object Repository/Page_Masuk  admin/input_email'))

WebUI.setText(findTestObject('Object Repository/Page_Masuk  admin/input_email'), 'lala_op@batpay.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Masuk  admin/input_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_Masuk  admin/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Dasbor  admin/a_1                        Pelanggan'))

WebUI.click(findTestObject('Object Repository/Page_Dasbor  admin/span_Pelanggan Aktif'))

WebUI.click( findTestObject('Object Repository/Page_Pelanggan Aktif  admin/a_Telepon'))

WebUI.setText( findTestObject('Object Repository/Page_Pelanggan Aktif  admin/input_Filter_text-filter-phone'), phone)

WebUI.sendKeys( findTestObject('Object Repository/Page_Pelanggan Aktif  admin/input_Filter_text-filter-phone'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Pelanggan Aktif  admin/a_Lihat'))

WebUI.delay(1)

WebUI.verifyTextPresent(phone, false)

WebUI.click( findTestObject('Object Repository/Page_Lihat Pelanggan Aktif  batpanel/a_Request Reset Pertanyaan Keamanan'))

WebUI.click( findTestObject('Object Repository/Page_Lihat Pelanggan Aktif  batpanel/Konfirmasi Reset Pertanyaan'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Manajemen Saldo  admin/img_img-avatar'))

WebUI.click(findTestObject('Object Repository/Page_Manajemen Saldo  admin/a_Keluar'))

WebUI.setText(findTestObject('Object Repository/Page_Masuk  admin/input_email'), 'lala_ho@batpay.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Masuk  admin/input_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_Masuk  admin/button_Masuk'))

WebUI.click( findTestObject('Object Repository/Page_Dasbor  batpanel/a_1                        Reset Pertanyaan Keamanan') )

WebUI.click( findTestObject('Object Repository/Page_Dasbor  admin/Permintaan Reset Akun') )

WebUI.click( findTestObject('Object Repository/Page_Permintaan Reset Pertanyaan Keamanan  batpanel/a_Telepon'))

WebUI.setText(findTestObject('Object Repository/Page_Permintaan Reset Pertanyaan Keamanan  batpanel/input_Filter_text-filter-phone'), phone)

WebUI.sendKeys( findTestObject('Object Repository/Page_Pelanggan Aktif  admin/input_Filter_text-filter-phone'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Permintaan Reset Pertanyaan Keamanan  batpanel/a_Lihat') )

WebUI.verifyTextPresent(phone, false)

WebUI.click( findTestObject('Object Repository/Page_Lihat Permintaan Reset Pertanyaan Keamanan  batpanel/button_Setuju') )

WebUI.click( findTestObject('Object Repository/Page_Lihat Permintaan Reset Pertanyaan Keamanan  batpanel/Confirm Approve') )

WebUI.delay(1)

WebUI.verifyTextPresent('Sukses', false)

WebUI.closeBrowser()
