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

WebUI.click(findTestObject('Cart Page/img_Checkout_custom-logo'))

WebUI.click(findTestObject('Object Repository/Cart Page/a_pink drop shoulder oversized t shirt'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Cart Page/select_Choose an optionPink'), 'pink', true)

WebUI.selectOptionByIndex(findTestObject('Cart Page/select_Choose an option363738'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Cart Page/i_QTY_icon_plus'))

WebUI.delay(2)

WebUI.click(findTestObject('Cart Page/button_Add to cart'))

WebUI.verifyTextPresent('2 × “pink drop shoulder oversized t shirt” have been added to your cart.', false)

WebUI.delay(3)

