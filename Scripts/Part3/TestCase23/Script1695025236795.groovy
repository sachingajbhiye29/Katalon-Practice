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

WebUI.navigateToUrl('https://spotify.design/')

WebUI.click(findTestObject('Object Repository/Page_Home  Spotify Design/span_Listen'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Stories  Spotify Design/p_Playlists, podcasts, and other audio good_0e44eb'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Stories  Spotify Design/p_Playlists, podcasts, and other audio good_0e44eb'), 
    'Playlists, podcasts, and other audio goodness from our team.')

WebUI.click(findTestObject('Object Repository/Page_Stories  Spotify Design/span_Folk'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Stories  Spotify Design/a_Zoned 43'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Stories  Spotify Design/a_Zoned 43'), 0)

WebUI.click(findTestObject('Object Repository/Page_Stories  Spotify Design/a_Zoned 43'))

WebUI.closeBrowser()

