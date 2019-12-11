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

row = 6

xlsData = findTestData('FOAdata')

//for (int row = 1; row <= xlsData.getRowNumbers(); row++) {

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(xlsData.getValue('url', row))

WebUI.waitForPageLoad(GlobalVariable.time)

if (xlsData.getValue('Language', row).equalsIgnoreCase('EN')) {
    WebUI.selectOptionByValue(findTestObject('select_language'), '2', true)
}

'S4 คุณพอใจคุณภาพการให้บริการในวันนี้ มากน้อย แค่ไหน'
WebUI.waitForElementVisible(findTestObject('btnOnlyNext'), GlobalVariable.timeout)

WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S4', row)]))

WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/01_S4.png')

WebUI.click(findTestObject('btnOnlyNext'))

'S3_1 ความสะอาดภายในร้าน'
WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_1', row)]))

WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/02_S3_1.png')

WebUI.click(findTestObject('btnNext'))

if (xlsData.getValue('channel', row).equalsIgnoreCase("DI")){
WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

'S3_2 โต๊ะ/เก้าอี้อยู่ในสภาพที่เหมาะสมกับการใช้งาน'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_2', row)]))

'S3_3 ความสะอาดของอุปกรณ์และภาชนะ'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('S3_3', row)]))

WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/03_S3_2-3.png')

WebUI.click(findTestObject('btnNext'))

}

WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

'S3_4 พนักงานจัดคิวและที่นั่งได้อย่างมีประสิทธิภาพ'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_4', row)]))

'S3_5 พนักงานให้ข้อมูลได้อย่างถูกต้องและชัดเจน'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('S3_5', row)]))

'S3_6 พนักงานมีความใส่ใจในบริการ'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '3', ('vote') : xlsData.getValue('S3_6', row)]))

WebUI.scrollToElement(findTestObject('btnNext'), 1)

WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/04_S3_4-6.png')

WebUI.click(findTestObject('btnNext'))

WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

'S3_7 พนักงานมารยาทดี'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_7', row)]))

'S3_8 พนักงานแต่งกายสะอาดเรียบร้อย'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('S3_8', row)]))

'S3_9 พนักงานให้บริการอย่างถูกต้องรวดเร็ว'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '3', ('vote') : xlsData.getValue('S3_9', row)]))

WebUI.scrollToElement(findTestObject('btnNext'), 1)

WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/05_S3_7-9.png')

WebUI.click(findTestObject('btnNext'))

WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

'S3_10 รสชาติของอาหาร'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_10', row)]))

'S3_11 ความสวยงามในการนำเสนออาหาร'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('S3_11', row)]))

'S3_12 ความสดใหม่ของอาหาร'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '3', ('vote') : xlsData.getValue('S3_12', row)]))

WebUI.scrollToElement(findTestObject('btnNext'), 1)

WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/06_S3_10-12.png')

WebUI.click(findTestObject('btnNext'))

WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

'S3_13 ความสะอาดและถูกสุขอนามัยของอาหาร'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_13', row)]))

'S3_14 ความหลากหลายของเมนูอาหาร'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('S3_14', row)]))

'S3_15 ปริมาณที่ได้รับต่อ 1 เสิร์ฟ'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '3', ('vote') : xlsData.getValue('S3_15', row)]))

WebUI.scrollToElement(findTestObject('btnNext'), 1)

WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/07_S3_13-15.png')

WebUI.click(findTestObject('btnNext'))

WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

'S3_16 ความคุ้มค่าของอาหารต่อราคา'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_16', row)]))

'S3_17 ความถูกต้องครบถ้วนของอาหารที่สั่ง'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('S3_17', row)]))

WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/08_S3_16-17.png')

WebUI.click(findTestObject('btnNext'))

WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

'S4_1 กรุณาให้คำแนะนำเพิ่มเติมเพื่อเป็นประโยชน์ในการพัฒนาบริการ '
WebUI.setText(findTestObject('textArea'), xlsData.getValue('S4_1', row))

WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/09_S4_1.png')

WebUI.click(findTestObject('btnNext'))

WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

'S3_19 โอกาสที่คุณจะกลับมาใช้บริการแบรนด์นี้อีกมากน้อย แค่ไหน'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_19', row)]))

'S3_20 โอกาสที่คุณจะแนะนำให้ผู้อื่นมาใช้บริการแบรนด์นี้มากน้อย แค่ไหน'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('S3_20', row)]))

WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/10_S3_19-20.png')

WebUI.click(findTestObject('btnNext'))

if (xlsData.getValue('Promotion', row).equalsIgnoreCase("Yes")) {
	
	if (xlsData.getValue('Promotions', row).equalsIgnoreCase("2")) {
		
		'P1 เคยเห็นสินค้าหรือ/โปรโมชั่นนี้หรือไม่'
		WebUI.click(findTestObject('buffet', [('buff') : xlsData.getValue('P1', row)]))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/11.2_P1-P2_TC_'+ (row) +'.png')
	
		'P2 คุณทราบถึงสินค้า/โปรโมชั่นนี้จากช่องทางใด'
		CustomKeywords.'com.fb180.Utilities.MyUtilities.myCheckbox'(findTestObject('checkboxes'), xlsData.getValue('P2', row))
	
		'อื่นๆ P2'
		if (xlsData.getValue('P2', row).reverse().take(2).reverse() == 'ON') {
			WebUI.setText(findTestObject('textArea'), xlsData.getValue('P2_1', row))
		}
	
		WebUI.click(findTestObject('btnNext'))
	
		WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)
	
		//take Screenshot
		'P3 คุณเคยได้ใช้สินค้า/โปรโมชั่นนี้หรือไม่'
		
		WebUI.click(findTestObject('buffet', [('buff') : xlsData.getValue('P3', row)]))
		
			if (xlsData.getValue('P3', row).equalsIgnoreCase("2")){
				WebUI.setText(findTestObject('Object Repository/textArea'), xlsData.getValue('P3_1', row))
			}
			
		WebUI.delay(2)
		
		WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/12.2_P3_TC_'+ (row) +'.png')
	
		WebUI.click(findTestObject('btnNext'))
	
		WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)
	
		'P5 คุณมีความพึงพอใจต่อสินค้า/โปรโมชั่นนี้ มากน้อย แค่ไหน'
		if (xlsData.getValue('P3', row).equalsIgnoreCase("1")){
		WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('P5', row)]))
		 
			if (Integer.valueOf(xlsData.getValue('P5', row)) < 3){
				'P5.1 ขอความคิดเห็นเพื่อนำไปปรับปรุงในอนาคต'
				WebUI.setText(findTestObject('Object Repository/textArea'), xlsData.getValue('P5.1', row))
			}
		
		WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/13.2_P5.png')
	
		WebUI.click(findTestObject('btnNext'))
		}
	
		WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)
	
		'P6 คุณอยากให้มีสินค้า/โปรโมชั่นนี้ให้บริการซ้ำอีก มากน้อย แค่ไหน'
		WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('P6', row)]))
	
		'P7 คุณอยากจะแนะนำสินค้า/โปรโมชั่นนี้ให้ผู้อื่น มากน้อย แค่ไหน'
		WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('P7', row)]))
		
		WebUI.scrollToElement(findTestObject('btnNext'), 1)
		
		WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/14.2_P6.png')
	
		WebUI.click(findTestObject('btnNext'))
		
	}
	
	'P1 เคยเห็นสินค้าหรือ/โปรโมชั่นนี้หรือไม่'
	WebUI.click(findTestObject('buffet', [('buff') : xlsData.getValue('P1', row)]))
	
	WebUI.delay(2)
	
	WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/11.1_P1-P2_TC_'+ (row) +'.png')

	'P2 คุณทราบถึงสินค้า/โปรโมชั่นนี้จากช่องทางใด'
	CustomKeywords.'com.fb180.Utilities.MyUtilities.myCheckbox'(findTestObject('checkboxes'), xlsData.getValue('P2', row))

	'อื่นๆ P2'
	if (xlsData.getValue('P2', row).reverse().take(2).reverse() == 'ON') {
		WebUI.setText(findTestObject('textArea'), xlsData.getValue('P2_1', row))
	}

	WebUI.click(findTestObject('btnNext'))

	WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

	//take Screenshot
	'P3 คุณเคยได้ใช้สินค้า/โปรโมชั่นนี้หรือไม่'
	WebUI.click(findTestObject('buffet', [('buff') : xlsData.getValue('P3', row)]))
	
	if (xlsData.getValue('P3', row).equalsIgnoreCase("2")){
		WebUI.setText(findTestObject('Object Repository/textArea'), xlsData.getValue('P3_1', row))
	}
	
	WebUI.delay(2)
	
	WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/12.1_P3_TC_'+ (row) +'.png')

	WebUI.click(findTestObject('btnNext'))

	WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

	'P5 คุณมีความพึงพอใจต่อสินค้า/โปรโมชั่นนี้ มากน้อย แค่ไหน'
	if (xlsData.getValue('P3', row).equalsIgnoreCase("1")){
	WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('P5', row)]))
	 
		if (Integer.valueOf(xlsData.getValue('P5', row)) < 3){
			'P5.1 ขอความคิดเห็นเพื่อนำไปปรับปรุงในอนาคต'
			WebUI.setText(findTestObject('Object Repository/textArea'), xlsData.getValue('P5.1', row))
		}
	
	WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/13.1_P5.png')

	WebUI.click(findTestObject('btnNext'))
	}

	WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)


	'P6 คุณอยากให้มีสินค้า/โปรโมชั่นนี้ให้บริการซ้ำอีก มากน้อย แค่ไหน'
	WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('P6', row)]))

	'P7 คุณอยากจะแนะนำสินค้า/โปรโมชั่นนี้ให้ผู้อื่น มากน้อย แค่ไหน'
	WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('P7', row)]))
	
	WebUI.scrollToElement(findTestObject('btnNext'), 1)
	
	WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/14.1_P6.png')

	WebUI.click(findTestObject('btnNext'))
}
	

WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

'O1 ใช้บริการของแบรนด์นี้กี่ครั้ง'
WebUI.setText(findTestObject('txInput1st'), xlsData.getValue('O1', row))

'O2 รับประทานอาหารนอกบ้านกี่ครั้ง'
WebUI.setText(findTestObject('txInput2nd'), xlsData.getValue('O2', row))

'O3 ใช้บริการจัดส่งอาหารถึงบ้าน (ดีลิเวอรี่) กี่ครั้ง'
WebUI.setText(findTestObject('txInput3rd'), xlsData.getValue('O3', row))

WebUI.scrollToElement(findTestObject('btnNext'), 1)

WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/15_O1-O3.png')

WebUI.click(findTestObject('btnNext'))

WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

'O4 ในช่วง 3 เดือนที่ผ่านมาคุณใช้บริการร้านอาหารใดต่อไปนี้บ้าง [ตอบได้มากกว่า 1 ข้อ]'
WebUI.waitForElementVisible(findTestObject('checkboxes'), GlobalVariable.timeout)

WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/16_O4_1.png')

CustomKeywords.'com.fb180.Utilities.MyUtilities.myCheckbox'(findTestObject('checkboxes'), xlsData.getValue('O4', row))

WebUI.scrollToElement(findTestObject('btnNext'), 1)

WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/17_O4_2.png')

WebUI.click(findTestObject('btnNext'))

'O5 จากรายชื่อร้านอาหารดังต่อไปนี้ ร้านใดเป็นร้านที่คุณชอบที่สุด [คำตอบเดียว]'
WebUI.waitForElementVisible(findTestObject('radioChoiceService'), GlobalVariable.timeout)

WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

CustomKeywords.'com.fb180.Utilities.MyUtilities.myRadioImg'(findTestObject('radioChoiceService'), xlsData.getValue('O5',
		row))

WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/18_O5.png')

WebUI.click(findTestObject('btnNext'))

'Z1 ชื่อ-นามสกุล (required)'
WebUI.setText(findTestObject('txInput1st'), xlsData.getValue('Z1', row))

'Z3 เบอร์โทรศัพท์ (required)'
WebUI.setText(findTestObject('txInput2nd'), xlsData.getValue('Z3', row))

'Z4 Email  หากไม่ระบุอีเมล ต้องบันทึกภาพหน้าจอที่'
WebUI.setText(findTestObject('txInput3rd'), xlsData.getValue('Z4', row))

'Z5 ระบุสถานะของคุณ [คำตอบเดียว]'
WebUI.click(findTestObject('radio_age', [('age') : xlsData.getValue('Z5', row)]))

'Z6 คุณมีบุตรหรือไม่ [คำตอบเดียว]'
WebUI.click(findTestObject('radio_children', [('son') : xlsData.getValue('Z6', row)]))

WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/19_Z1-Z6.png')

//WebUI.click(findTestObject('btnNext'))
//WebUI.delay(4)
//
//WebUI.takeScreenshot('Screenshots/FOA/TC_01_0'+ (row) +'/15_Reward_TC_'+ (row) +'.png')

//WebUI.closeBrowser()















