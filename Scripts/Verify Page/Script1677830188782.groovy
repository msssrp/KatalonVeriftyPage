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

WebUI.navigateToUrl('https://www.cloudnative-skill.com/register')

WebUI.verifyTextPresent('Register', false)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Modern Software Development Toolchains', false)

WebUI.setText(findTestObject('Page_Modern Software Development Toolchains/input__birthday'), '13/07/2543')

WebUI.sendKeys(findTestObject('Page_Modern Software Development Toolchains/input__birthday'), Keys.chord(Keys.ENTER))

result_age = WebUI.getAttribute(findTestObject('Page_Modern Software Development Toolchains/input__age'), 'value')

WebUI.verifyMatch(result_age, '23', false)

result_branch_default = WebUI.getAttribute(findTestObject('Page_Modern Software Development Toolchains/input__dep_branch'), 
    'placeholder')

WebUI.verifyMatch(result_branch_default, 'เช่น สำนักงานใหญ่', false)

WebUI.verifyElementNotChecked(findTestObject('Page_Modern Software Development Toolchains/input__language'), 10)

WebUI.click(findTestObject('Page_Modern Software Development Toolchains/input__tax_receipt'))

WebUI.verifyElementClickable(findTestObject('Page_Modern Software Development Toolchains/input__tax_receipt'))

WebUI.closeBrowser()

