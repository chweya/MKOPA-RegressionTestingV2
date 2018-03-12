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

WebUI.callTestCase(findTestCase('Inventory Module/Common/List Warehouses Operations'), [('wareHouseCode') : 'SC004'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Inventory Module/WareHouse Operations/link_TransfersOut', [('transfers_out') : transfers_out]))

WebUI.delay(1)

WebUI.click(findTestObject('Inventory Module/Transfers Out/button_NewTransfer'))

WebUI.click(findTestObject('Inventory Module/Transfers Out/dropdown_DeviceType'))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Transfers Out/select_DeviceType', [('select_devicetype') : deviceType]))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Transfers Out/dropdown_WarehouseTo', [('select_warehouseto') : select_warehouseto]))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Transfers Out/select_WarehouseTo', [('select_warehouseto') : warehouseToTransfer]))

WebUI.setText(findTestObject('Inventory Module/Transfers Out/input_ModeOfTransfer', [('input_modeoftransfer') : input_modeoftransfer]), 
    modeOfTransfer)

WebUI.setText(findTestObject('Inventory Module/Transfers Out/input_PlannedQuantity'), plannedQuantity)

WebUI.click(findTestObject('Inventory Module/Transfers Out/button_AddTransfer'))

WebUI.verifyAlertPresent(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('Inventory Module/Transfers Out/click_TopMostOrder'))

WebUI.click(findTestObject('Inventory Module/Transfers Out/dropdown_Packaging'))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Transfers Out/select_Packaging', [('select_packaging') : packaging]))

WebUI.setText(findTestObject('Inventory Module/Transfers Out/input_SerialNumber', [('input_serialnumber') : input_serialnumber]), 
    serialNumber)

WebUI.click(findTestObject('Inventory Module/Transfers Out/button_AddTransferItem'))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Transfers Out/click_TopMostOrder'))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Transfers Out/button_Finish'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Inventory Module/Transfers Out/confirm_StatusIsInTransit'))

WebUI.delay(2)

WebUI.closeBrowser()

