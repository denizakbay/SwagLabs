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

// open browser
WebUI.openBrowser('https://www.saucedemo.com')

// maximize window
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Test3_OR/Page_Swag Labs/Page_Login/txt_UserName'), 'standard_user', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Test3_OR/Page_Swag Labs/Page_Login/txt_Password'), 'secret_sauce')

WebUI.click(findTestObject('Test3_OR/Page_Swag Labs/Page_Login/btn_login'))

WebUI.verifyElementText(findTestObject('Test3_OR/Page_Swag Labs/Page_HomeProducts/title_swaglabs'), 'Swag Labs', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Test3_OR/Page_Swag Labs/Page_HomeProducts/btn_ProductSortContainer'))

WebUI.click(findTestObject('Object Repository/Test3_OR/Page_Swag Labs/Page_HomeProducts/select_Name(Z to A)'))

WebUI.click(findTestObject('Object Repository/Test3_OR/Page_Swag Labs/Page_HomeProducts/btn_AddToCart'))

WebUI.click(findTestObject('Object Repository/Test3_OR/Page_Swag Labs/Page_HomeProducts/shoppingCart'))

WebUI.verifyElementText(findTestObject('Test3_OR/Page_Swag Labs/Page_YourCart/inventory_item_price'), '$15.99', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Test3_OR/Page_Swag Labs/Page_YourCart/btn_Checkout'))

WebUI.setText(findTestObject('Object Repository/Test3_OR/Page_Swag Labs/Page_CheckoutInformation/txt_Checkout Your Information_firstName'), 
    'Deniz')

WebUI.setText(findTestObject('Object Repository/Test3_OR/Page_Swag Labs/Page_CheckoutInformation/txt_Checkout Your Information_lastName'), 
    'Akbay')

WebUI.setText(findTestObject('Object Repository/Test3_OR/Page_Swag Labs/Page_CheckoutInformation/txt_Checkout Your Information_postalCode'), 
    '0034')

WebUI.click(findTestObject('Object Repository/Test3_OR/Page_Swag Labs/Page_CheckoutInformation/btn_Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/Test3_OR/Page_Swag Labs/Page_CheckoutOverview/title_CheckoutOverview'), 
    'Checkout: Overview', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Test3_OR/Page_Swag Labs/Page_CheckoutOverview/button_Finish'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyImagePresent(findTestObject('Test3_OR/Page_Swag Labs/Page_CheckoutComplete/img_CheckoutComplete'), FailureHandling.OPTIONAL)

TestObject myElement = findTestObject('Test3_OR/Page_Swag Labs/Page_CheckoutComplete/complete_Thankyouforyourorder')

WebUI.verifyElementText(myElement, 'Thank you for your order!', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Test3_OR/Page_Swag Labs/Page_CheckoutComplete/btn_BackHome'))

WebUI.closeBrowser()

