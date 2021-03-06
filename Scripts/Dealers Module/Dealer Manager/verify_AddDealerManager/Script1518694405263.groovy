import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Dealers Module/Common/step_DealerDetails'), [('delay') : '5', ('dealer_AccountNumber') : 'K0877'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dealers Module/Dealer List/link_ManageManagers'))

WebUI.click(findTestObject('Dealers Module/Dealer Managers/link_AddDealerManager'))

WebUI.setText(findTestObject('Dealers Module/Dealer Managers/input_DealerManagerSurname'), surname)

WebUI.setText(findTestObject('Dealers Module/Dealer Managers/input_DealerManagerOtherNames'), other_Names)

WebUI.setText(findTestObject('Dealers Module/Dealer Managers/input_DealerManagerIDNumber'), id_Number)

WebUI.click(findTestObject('Dealers Module/Dealer Managers/dropdown_IDNumberType'))

WebUI.delay(delay)

WebUI.click(findTestObject('Dealers Module/Dealer Managers/option_IDType', [('identification') : identification]))

WebUI.setText(findTestObject('Dealers Module/Dealer Managers/input_PhoneNumber'), phone_Number)

WebUI.setText(findTestObject('Dealers Module/Dealer Managers/input_AlternatePhoneNumber'), alternate_PhoneNumber)

WebUI.setText(findTestObject('Dealers Module/Dealer Managers/input_DealerManagerEmail'), email)

WebUI.click(findTestObject('Dealers Module/Dealer Managers/dropdown_Gender'))

WebUI.delay(delay)

WebUI.click(findTestObject('Dealers Module/Dealer Managers/option_Gender', [('gender') : gender]))

WebUI.click(findTestObject('Dealers Module/Dealer Managers/dropdown_Language'))

WebUI.delay(delay)

WebUI.click(findTestObject('Dealers Module/Dealer Managers/option_Language', [('language') : language]))

WebUI.setText(findTestObject('Dealers Module/Dealer Managers/input_DealerManagerCitizenship'), citizenship)

WebUI.click(findTestObject('Dealers Module/Dealer Managers/button_SaveAddDealerManager'))

WebUI.delay(delay)

WebUI.getText(findTestObject('Dealers Module/Dealer Managers/message_AddDealerManagerSuccess', [('surname') : surname]))

WebUI.verifyElementPresent(findTestObject('Dealers Module/Dealer Managers/message_AddDealerManagerSuccess', [('surname') : surname]), 
    0)

WebUI.delay(delay)

WebUI.click(findTestObject('Dealers Module/Dealer Managers/link_BackToList'))

WebUI.delay(delay)

WebUI.getText(findTestObject('Dealers Module/Dealer Managers/label_DealerManagerAdded', [('surname') : surname]))

WebUI.verifyElementPresent(findTestObject('Dealers Module/Dealer Managers/label_DealerManagerAdded', [('surname') : surname]), 
    0)

WebUI.closeBrowser()

