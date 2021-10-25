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

findTestObject('{Object ID}')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.kalibrr.com/login')

WebUI.setText(findTestObject('Object Repository/Page_Log-in  Kalibrr Where Jobs Find You/input_Email_email'), 'gitasiahaan25@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log-in  Kalibrr Where Jobs Find You/input_Password_password'), 
    'eKZn2mJnSp1qGGOD5mKMUQ==')

WebUI.click(findTestObject('Object Repository/Page_Log-in  Kalibrr Where Jobs Find You/button_Sign InSign In'))

WebUI.click(findTestObject('Object Repository/Page_Kalibrr Where Jobs Find You/span_Applications'))

WebUI.click(findTestObject('Object Repository/Page_Kalibrr Where Jobs Find You/span_Profile'))

WebUI.closeBrowser()

findTestObject('{Object ID}')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.kalibrr.com/login')

WebUI.setText(findTestObject('Object Repository/Page_Log-in  Kalibrr Where Jobs Find You/input_Email_email'), 'gitasiahaan25@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log-in  Kalibrr Where Jobs Find You/input_Password_password'), 
    'eKZn2mJnSp1qGGOD5mKMUQ==')

WebUI.click(findTestObject('Object Repository/Page_Log-in  Kalibrr Where Jobs Find You/button_Sign InSign In'))

WebUI.click(findTestObject('Object Repository/Page_Kalibrr Where Jobs Find You/span_Applications'))

WebUI.click(findTestObject('Object Repository/Page_Kalibrr Where Jobs Find You/span_Profile'))

WebUI.closeBrowser()

