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

WebUI.navigateToUrl('https://sb-bisnis.batpay.id/')

WebUI.setText(findTestObject('Object Repository/Page_BATPay Merchant/inputemail (1)'), 'josh@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_BATPay Merchant/inputpassword (1)'), '4B7T+B3ZhhTd/OeH0YxTLw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_BATPay Merchant/inputpassword (1)'), Keys.chord(Keys.ENTER))

WebUI.click( findTestObject('Object Repository/Page_BATPay Merchant/Button Daftar Usaha'))
//WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/span_Daftar'))

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/input_radio-group-25'))

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/button_Mulai pendaftaran'))

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/input_radio-group-31'))

//WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/input_radio-group-31_1'))
//
//WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/input_radio-group-31'))

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/button_Lanjut (1)'))

WebUI.setText(findTestObject('Object Repository/Page_BATPay Merchant/textareapemilik_owner_name'), 'Pentest')

WebUI.setText(findTestObject('Object Repository/Page_BATPay Merchant/textareapemilik_jabatan'), 'Manager')

WebUI.setText(findTestObject('Object Repository/Page_BATPay Merchant/inputpemilik_kontak'), '083274623236')

WebUI.setText(findTestObject('Object Repository/Page_BATPay Merchant/inputpemilik_nik'), '1234567890123450')

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/input_pemilik_gender'))

//WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/input_pemilik_gender_1'))

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/div_v-field__input'))

WebUI.click( findTestObject('Object Repository/Page_BATPay Merchant/div_Warga Negara Indonesia (WNI) (1)'))

WebUI.uploadFile(findTestObject('Object Repository/Page_BATPay Merchant/input_NPWP Perusahaan_bisnis_npwp_file') , 'C:\\\\Users\\\\Public\\\\Pictures\\\\download.jpeg')

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/span_Lanjut'))

WebUI.setText(findTestObject('Object Repository/Page_BATPay Merchant/textareabisnis_nama_perusahaan'), 'Pentest')

WebUI.setText(findTestObject('Object Repository/Page_BATPay Merchant/inputbisnis_npwp'), '1234567890123456')

//WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/input_bisnis_jenis_usaha'))

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/input_bisnis_jenis_usaha_1'))

WebUI.setText(findTestObject('Object Repository/Page_BATPay Merchant/textareabisnis_nama_usaha'), 'Merchant Versi Baru')

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/bentuk badan usaha field'))

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/div_Perseroan Terbatas (PT)'))

WebUI.setText(findTestObject('Object Repository/Page_BATPay Merchant/inputbisnis_kategori_usaha'), 'toko')

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/span_Toko Komputer dan Perangkat Lunak (Com_8ffb6c'))

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/div_v-field__input_1'))

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/div_Mikro (Omzet  Rp300 juta per tahun)'))

WebUI.setText(findTestObject('Object Repository/Page_BATPay Merchant/inputbisnis_province_id'), 'jawa')

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/div_Jawa Tengah'))

WebUI.setText(findTestObject('Object Repository/Page_BATPay Merchant/inputbisnis_city_id'), 'NamaKota1')

WebUI.click( findTestObject('Object Repository/Page_BATPay Merchant/div_Kebumen'))

WebUI.setText(findTestObject('Object Repository/Page_BATPay Merchant/inputbisnis_district_id'), 'kebumen')

WebUI.click( findTestObject('Object Repository/Page_BATPay Merchant/div_Kebumen (1)'))

WebUI.setText(findTestObject('Object Repository/Page_BATPay Merchant/inputbisnis_village_id'), 'bandung')

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/div_Bandung'))

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/inputbisnis_postal_code'))

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/div_54317'))

WebUI.setText(findTestObject('Object Repository/Page_BATPay Merchant/textareabisnis_alamat_usaha'), 'kebumen, bandung')

WebUI.setText(findTestObject('Object Repository/Page_BATPay Merchant/inputbisnis_merchant_email'), 'pentest_02@yopmail.com')

WebUI.setText(findTestObject('Object Repository/Page_BATPay Merchant/inputbisnis_kontak'), '087327632652')

//WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/input_bisnis_akta_pendirian_isupload'))

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/input_bisnis_akta_pendirian_isupload_1'))

//WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/input_bisnis_akta_perubahan_isupload'))

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/input_bisnis_akta_perubahan_isupload_1'))

//WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/input_bisnis_nib_siup_isupload'))

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/input_bisnis_nib_siup_isupload_1'))

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/button_Lanjut_1'))

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/inputinput-123'))

WebUI.setText(findTestObject('Object Repository/Page_BATPay Merchant/inputinput-123'), 'BCA')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/div_BANK BCA'))

WebUI.setText(findTestObject('Object Repository/Page_BATPay Merchant/textareabisnis_account_name'), 'Pentes')

WebUI.setText(findTestObject('Object Repository/Page_BATPay Merchant/inputbisnis_account_number'), '1234567890')

WebUI.setText(findTestObject('Object Repository/Page_BATPay Merchant/inputbisnis_account_branch'), 'jakarta')

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/button_Kirim'))

WebUI.click(findTestObject('Object Repository/Page_BATPay Merchant/button_Konfirmasi'))

//WebUI.verifyTextPresent("Sudah terkirim", false)

WebUI.delay(1)

WebUI.closeBrowser()


