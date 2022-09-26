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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dev.mpartial.io/login')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/input_Sign In with your mpartial account_fo_65c41e'), 
    'first@qa.team')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/input_Email_form-control'), 
    'uk6rFx5F4deV0a4UADG6fQ==')

WebUI.click(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/img'))

WebUI.click(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/h3_mpartialScope'))

WebUI.click(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/button_Continue with Xactimate'))

WebUI.click(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/input__form-control is_required_true changed_false'))

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/input__form-control is_required_true changed_false'), 
    'Automation Testing')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/input__form-control is_required_true changed_true'), 
    'https://my.matterport.com/show/?m=qJQhVRdyc')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/input__form-control is_required_true changed_true_1'), 
    'https://my.matterport.com/show/?m=qJQhVRdycuv')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/select_Select Debris DisposalHaul DebrisDumpsterNA'), 
    'Dumpster', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/select_Select Cause of LossWaterFireOther -_90babd'), 
    'N/A', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/select_Select ScopeMitigationRepairBoth'), 
    'Both', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/select_Select CategoryCat 1Cat 2Cat 3NA'), 
    'N/A', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/select_Select Residential or CommercialResi_be48cc'), 
    'Commercial', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/select_Select Duration of the Project1 Day2_562a45'), 
    '9 Weeks', true)

WebUI.click(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/div_Select'))

WebUI.click(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/span_Select All'))

WebUI.click(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/div_Email For Delivery of Results Project N_681d46'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/select_Select Duration of Demolition1 Day2 _59e5d0'), 
    '13 Weeks', true)

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/input_Informs the applied price list_form-c_d6a537'), 
    '1234')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/input_The address will be automatically pop_4ff0ec'), 
    'town')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/select_Select Add Overhead  ProfitYesNoMiti_ffaf93'), 
    'No', true)

WebUI.click(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/label_No'))

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_q'), 'q')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_qw'), 'qw')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_qwe'), 'qwe')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_qwer'), 'qwer')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_qwert'), 'qwert')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_qwerty'), 'qwerty')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_a'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_as'), 'as')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_asd'), 'asd')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_asdf'), 'asdf')

WebUI.click(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/div_Please describe if the countertops are _319f69'))

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_y'), 'y')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_yu'), 'yu')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_yui'), 'yui')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_yuio'), 'yuio')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_yuiop'), 'yuiop')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_yuiop_1'), 'yuiop[')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_yuiopp'), 'yuiop[p')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_z'), 'z')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_zx'), 'zx')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_zxc'), 'zxc')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_zxcv'), 'zxcv')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_zxcvb'), 'zxcvb')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_zxcvbn'), 'zxcvbn')

WebUI.setText(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/textarea_zxcvbnm'), 'zxcvbnm')

WebUI.click(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/div_Additional InformationProject Details P_1fd68c'))

WebUI.click(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/label_Ive read and accept the mpartial Term_3331b0'))

WebUI.click(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/span'))

WebUI.click(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/input__tealGreen-checkbox'))

WebUI.click(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/span_Proceed to Checkout'))

WebUI.click(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/span_Checkout'))

WebUI.click(findTestObject('Object Repository/Page_Extract maximum value from Matterport,_4ea039/button_My Orders'))

WebUI.closeBrowser()

