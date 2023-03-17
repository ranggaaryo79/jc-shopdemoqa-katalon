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

WebUI.click(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/a_Checkout'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/main_Have a coupon Click here to enter your_c6f6e5'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input__billing_first_name'), 'test')

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input__billing_last_name'), 'nama')

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_company'), 
    'jcc')

WebUI.click(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/span_Indonesia'))

WebUI.click(findTestObject('Checkout/Page_Checkout  ToolsQA Demo Site/span_Indonesia'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input__billing_address_1'), 'jalan lama')

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_address_2'), 
    'perpu')

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input__billing_city'), 'JKT')

WebUI.click(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/span_Select an option'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/span_Daerah Istimewa Aceh'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input__billing_postcode'), '1211')

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input__billing_phone'), '2020202')

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input__billing_email'), 'tester@gmail.com')

WebUI.scrollToPosition(250, 0)

WebUI.click(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input_privacy policy_terms'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/button_Place order'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 150)

WebUI.verifyElementText(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/p_Thank you. Your order has been received'), 
    'Thank you. Your order has been received.')

WebUI.delay(3)

WebUI.closeBrowser()

