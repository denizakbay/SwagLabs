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

WebUI.callTestCase(findTestCase('Test_SwagLabs/Test_CheckoutOverview'), [('Username') : Username, ('Password') : Password
        , ('FirstName') : FirstName, ('LastName') : LastName, ('PostalCode') : PostalCode], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyImagePresent(findTestObject('Test3_OR/Page_Swag Labs/Page_CheckoutComplete/img_CheckoutComplete'), FailureHandling.OPTIONAL)

TestObject myElement = findTestObject('Test3_OR/Page_Swag Labs/Page_CheckoutComplete/complete_Thankyouforyourorder')

WebUI.verifyElementText(myElement, 'Thank you for your order!', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Test3_OR/Page_Swag Labs/Page_CheckoutComplete/btn_BackHome'))

WebUI.closeBrowser()

