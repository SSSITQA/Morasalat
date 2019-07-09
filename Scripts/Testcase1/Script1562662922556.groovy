import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://a-yesserapp03/YESSER.MCS.UI.MOB.2.1/User/Login/Login?returnUrl=%2FYESSER.MCS.UI.MOB.2.1%2FUser%2F')

WebUI.setText(findTestObject('Object Repository/Page_/input_ _UserName'), 'nasserkh')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_ _Password'), 'heMxIzEAyQpycx257HePHg==')

WebUI.click(findTestObject('Object Repository/Page_/button_'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_DashboardHome/i_  _la la-power-off'))

WebUI.closeBrowser()

