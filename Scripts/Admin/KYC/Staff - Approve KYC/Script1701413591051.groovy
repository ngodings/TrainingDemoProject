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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.BatpanelUrl)

WebUI.click(findTestObject('Object Repository/Page_Masuk  admin/input_email'))

WebUI.setText(findTestObject('Object Repository/Page_Masuk  admin/input_email'), 'lala_op@batpay.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Masuk  admin/input_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_Masuk  admin/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Dasbor  admin/a_1                        Pelanggan'))

WebUI.click(findTestObject('Object Repository/Page_Dasbor  admin/span_Request Upgrade Pelanggan (KYC)'))

WebUI.click(findTestObject('Object Repository/Page_Request Upgrade Pelanggan (KYC)  admin/a_Lihat'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Lihat Request Upgrade Pelanggan (KYC)  admin/select_-- Pilih Salah Satu --              _1a664b'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Page_Lihat Request Upgrade Pelanggan (KYC)  admin/button_Setuju'))

WebUI.click(findTestObject('Object Repository/Page_Lihat Request Upgrade Pelanggan (KYC)  admin/button_Setuju_1'))

WebUI.click(findTestObject('Object Repository/Page_Lihat Request Upgrade Pelanggan (KYC)  admin/button_OK'))

WebUI.closeBrowser()

