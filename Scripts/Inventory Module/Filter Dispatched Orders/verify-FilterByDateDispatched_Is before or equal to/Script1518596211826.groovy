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

WebUI.callTestCase(findTestCase('Common/UserLogin'), [('Email') : 'Kennedy.Mwangi@m-kopa.com', ('Password') : 'Ken0726//'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page Header and Menu/Inventory/link_Inventory'))

WebUI.delay(delay)

WebUI.mouseOver(findTestObject('Page Header and Menu/Inventory/link_Operations'))

WebUI.delay(delay)

WebUI.click(findTestObject('Page Header and Menu/Inventory/link_DispatchedOrders'))

WebUI.verifyElementPresent(findTestObject('Inventory Module/Dispatched Orders/grid_DispatchedOrdersHeader'), 0)

WebUI.click(findTestObject('Inventory Module/Dispatched Orders/dropdown_DateDispatched'))

WebUI.delay(delay)

WebUI.click(findTestObject('Inventory Module/Dispatched Orders/dropdown_FirstSelect'))

WebUI.delay(delay)

WebUI.click(findTestObject('Inventory Module/Dispatched Orders/select_FilterOperator', [('option_Operator') : option_Operator]))

WebUI.setText(findTestObject('Inventory Module/Dispatched Orders/input_DateDispatchedFirst'), date_DispatchedFirst)

WebUI.click(findTestObject('Inventory Module/Dispatched Orders/button_Filter'))

WebUI.verifyElementVisible(findTestObject('Inventory Module/Dispatched Orders/label_DateDispatched', [('filter_Results') : filter_Results]), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(delay)

WebUI.closeBrowser()

