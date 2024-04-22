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

def noReference = '323-XRM-329'

def phone = '087779668268'

def saldo = '1000000'

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.BatpanelUrl)

WebUI.setText(findTestObject('Object Repository/Page_Masuk  admin/input_email'), 'finance@batpay.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Masuk  admin/input_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_Masuk  admin/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Dasbor  admin/span_Manajemen Saldo'))

WebUI.click(findTestObject('Object Repository/Page_Manajemen Saldo  admin/a_Atur Saldo'))

WebUI.click( findTestObject('Object Repository/Page_Tambah Manajemen Saldo  admin/div_Top Up') )

WebUI.sendKeys( findTestObject('Object Repository/Page_Tambah Manajemen Saldo  admin/input_No. Referensi  No. Tiket_referenceNumber'), noReference)

WebUI.click(findTestObject('Object Repository/Page_Tambah Manajemen Saldo  admin/span_Masukkan no handphone pelanggan'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/Page_Tambah Manajemen Saldo  admin/input_select2-search__field'), phone)

WebUI.delay(3)

WebUI.click( findTestObject('Object Repository/Page_Tambah Manajemen Saldo  admin/li_lala') )

WebUI.sendKeys( findTestObject('Object Repository/Page_Tambah Manajemen Saldo  admin/input_Rp_amount') , saldo)

WebUI.uploadFile(findTestObject('Object Repository/Page_Tambah Manajemen Saldo  admin/input_urlTransfer'), 'C:\\\\Users\\\\Public\\\\Pictures\\\\download.jpeg')

WebUI.click(findTestObject('Object Repository/Page_Tambah Manajemen Saldo  admin/button_Lanjut'))

WebUI.click(findTestObject('Object Repository/Page_Tambah Manajemen Saldo  admin/button_Ya'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Manajemen Saldo  admin/img_img-avatar'))

WebUI.click(findTestObject('Object Repository/Page_Manajemen Saldo  admin/a_Keluar'))

WebUI.setText(findTestObject('Object Repository/Page_Masuk  admin/input_email'), 'headfinance@batpay.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Masuk  admin/input_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_Masuk  admin/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Dasbor  admin/span_Manajemen Saldo'))

WebUI.setText(findTestObject('Object Repository/Page_Manajemen Saldo  admin/input_form-control'), noReference)

WebUI.sendKeys(findTestObject('Object Repository/Page_Manajemen Saldo  admin/input_form-control'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Manajemen Saldo  admin/td_1'))

WebUI.click(findTestObject('Object Repository/Page_Manajemen Saldo  admin/button_btn btn-sm btn-success mr-2'))

WebUI.click(findTestObject('Object Repository/Page_Manajemen Saldo  admin/button_Konfirmasi (1)'))

WebUI.delay(2)

WebUI.closeBrowser()

