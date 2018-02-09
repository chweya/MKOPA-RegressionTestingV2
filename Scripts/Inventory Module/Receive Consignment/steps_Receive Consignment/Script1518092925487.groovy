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

WebUI.mouseOver(findTestObject('Page Header and Menu/Inventory/link_Inventory'))

WebUI.delay(2)

WebUI.click(findTestObject('Page Header and Menu/Inventory/link_WarehouseOperations'))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/WareHouses/link_Operations', [('code') : code]))

WebUI.click(findTestObject('Inventory Module/WareHouse Operations/link_Receive Consignment', [('receiptId') : receiptId]))

WebUI.setText(findTestObject('Inventory Module/Receive Consignment/input_Consignment Number'), consignmentNo)

WebUI.setText(findTestObject('Inventory Module/Receive Consignment/input_Receipt Date'), receiptDate)

WebUI.setText(findTestObject('Inventory Module/Receive Consignment/input_Receipt Carton Count'), receiptCartonUnit)

