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

row = 7

xlsData = findTestData('oishiData')

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

WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/01_S4.png')

WebUI.click(findTestObject('btnOnlyNext'))

if (xlsData.getValue('brand', row).equalsIgnoreCase('NI') && xlsData.getValue('channel', row).equalsIgnoreCase('DI')) {
    WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

    'SN คุณรับประทานอาหารรูปแบบบุฟเฟต์หรือไม่   Buffet  / A lar carte'
    WebUI.click(findTestObject('buffet', [('buff') : xlsData.getValue('SN', row)]))

    WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/02_SN.png')

    WebUI.click(findTestObject('btnNext'))
}

if (xlsData.getValue('channel', row).equalsIgnoreCase('DI')) {
    WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

    'S3_01 ความสะอาดภายในร้าน'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_01', row)]))

    'S3_02 โต๊ะ/เก้าอี้อยู่ในสภาพที่เหมาะสมกับการใช้งาน'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('S3_02', row)]))

    'S3_03 ความสะอาดของอุปกรณ์และภาชนะ'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '3', ('vote') : xlsData.getValue('S3_03', row)]))
	
    WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/03_S3_01-03.png')

    WebUI.click(findTestObject('btnNext'))
}

if (xlsData.getValue('channel', row).equalsIgnoreCase('TA')) {
    WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

    'S3_01 ความสะอาดภายในร้าน'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_01', row)]))

    WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/04_S3_01.png')

    WebUI.click(findTestObject('btnNext'))
}

if (xlsData.getValue('channel', row).equalsIgnoreCase('DL')) {
    WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

    'S3_05 พนักงานให้ข้อมูลได้อย่างถูกต้องและชัดเจน'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_05', row)]))

    'S3_06 พนักงานมีความใส่ใจในบริการ'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('S3_06', row)]))

    WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/05_S3_05-06.png')

    WebUI.click(findTestObject('btnNext'))
} else {
    WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

    'S3_04 พนักงานจัดคิวและที่นั่งได้อย่างมีประสิทธิภาพ'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_04', row)]))

    'S3_05 พนักงานให้ข้อมูลได้อย่างถูกต้องและชัดเจน'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('S3_05', row)]))

    'S3_06 พนักงานมีความใส่ใจในบริการ'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '3', ('vote') : xlsData.getValue('S3_06', row)]))
	
    WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/06_S3_04-06.png')

    WebUI.click(findTestObject('btnNext'))
}

if (xlsData.getValue('channel', row).equalsIgnoreCase('DL')) {
    WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

    'S3_07 พนักงานมารยาทดี'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_07', row)]))

    'S3_08 พนักงานให้บริการอย่างถูกต้องรวดเร็ว'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('S3_08', row)]))

    WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/07_S3_07-08.png')

    WebUI.click(findTestObject('btnNext'))
} else {
    WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

    'S3_07 พนักงานมารยาทดี'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_07', row)]))

    'S3_08 พนักงานแต่งกายสะอาดเรียบร้อย'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('S3_08', row)]))

    'S3_09 พนักงานให้บริการอย่างถูกต้องรวดเร็ว'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '3', ('vote') : xlsData.getValue('S3_09', row)]))

    WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/08_S3_07-09.png')

    WebUI.click(findTestObject('btnNext'))
}

WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

'S3_10 รสชาติของอาหาร'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_10', row)]))

'S3_11 ความสวยงามในการนำเสนออาหาร'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('S3_11', row)]))

'S3_12 ความสดใหม่ของอาหาร'
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '3', ('vote') : xlsData.getValue('S3_12', row)]))

WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/09_S3_10-12.png')

WebUI.click(findTestObject('btnNext'))

if (((((xlsData.getValue('channel', row).equalsIgnoreCase('DI') && xlsData.getValue('brand', row).equalsIgnoreCase('SB')) || 
(xlsData.getValue('channel', row).equalsIgnoreCase('DI') && xlsData.getValue('brand', row).equalsIgnoreCase('BF'))) || (xlsData.getValue(
    'channel', row).equalsIgnoreCase('DI') && xlsData.getValue('brand', row).equalsIgnoreCase('OG'))) || (xlsData.getValue(
    'channel', row).equalsIgnoreCase('DI') && xlsData.getValue('brand', row).equalsIgnoreCase('OE'))) || ((xlsData.getValue(
    'channel', row).equalsIgnoreCase('DI') && xlsData.getValue('brand', row).equalsIgnoreCase('NI')) && xlsData.getValue(
    'SN', row).equalsIgnoreCase('1'))) {
    WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

    'S3_13 ความสะอาดและถูกสุขอนามัยของอาหาร'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_13', row)]))

    'S3_14 ความหลากหลายของเมนูอาหาร'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('S3_14', row)]))

    WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/10_S3_13-14.png')

    WebUI.click(findTestObject('btnNext'))
}

if (((((xlsData.getValue('brand', row).equalsIgnoreCase('BF') && xlsData.getValue('channel', row).equalsIgnoreCase('DL')) || 
xlsData.getValue('brand', row).equalsIgnoreCase('RM')) || xlsData.getValue('brand', row).equalsIgnoreCase('KK')) || (xlsData.getValue(
    'brand', row).equalsIgnoreCase('NI') && xlsData.getValue('channel', row).equalsIgnoreCase('TA'))) || ((xlsData.getValue(
    'brand', row).equalsIgnoreCase('NI') && xlsData.getValue('channel', row).equalsIgnoreCase('DI')) && xlsData.getValue(
    'SN', row).equalsIgnoreCase('2'))) {
    WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

    'S3_13 ความสะอาดและถูกสุขอนามัยของอาหาร'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_13', row)]))

    'S3_14 ความหลากหลายของเมนูอาหาร'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('S3_14', row)]))

    'S3_15 ปริมาณอาหารต่อ 1 จาน'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '3', ('vote') : xlsData.getValue('S3_15', row)]))
	
    WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/11_S3_13-15.png')

    WebUI.scrollToElement(findTestObject('btnNext'), 1)

    WebUI.click(findTestObject('btnNext'))
}

if (xlsData.getValue('channel', row).equalsIgnoreCase('DL')) {
    WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

    'S3_16 ความคุ้มค่าของอาหารต่อราคา'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_16', row)]))

    WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/12_S3_16.png')

    WebUI.click(findTestObject('btnNext'))
} else {
    WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

    'S3_16 ความคุ้มค่าของอาหารต่อราคา'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_16', row)]))

    'S3_17 ความถูกต้องครบถ้วนของอาหารที่สั่ง'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('S3_17', row)]))

    WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/13_S3_16-17.png')

    WebUI.click(findTestObject('btnNext'))
}

if (xlsData.getValue('channel', row).equalsIgnoreCase('DL')) {
    WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

    'S3_18 ความสะดวกของระบบการสั่งอาหาร'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S3_18', row)]))

    'S3_19 ความรวดเร็วในการจัดส่งอาหาร'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('S3_19', row)]))

    'S3_20 ความถูกต้องครบถ้วนของอาหารที่ส่ง'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '3', ('vote') : xlsData.getValue('S3_20', row)]))
	
    WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/14_S3_18-20.png')

    WebUI.click(findTestObject('btnNext'))
}

WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

'S4_1 กรุณาให้คำแนะนำเพิ่มเติมเพื่อเป็นประโยชน์ในการพัฒนาบริการ '
WebUI.setText(findTestObject('textArea'), xlsData.getValue('S4_1', row))

WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/15_S4_1.png')

WebUI.click(findTestObject('btnNext'))

'S5 โอกาสที่คุณจะกลับมาใช้บริการแบรนด์นี้อีก มากน้อย แค่ไหน '
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('S5', row)]))

'S6 โอกาสที่คุณจะแนะนำให้ผู้อื่นมาใช้บริการแบรนด์นี้ มากน้อย แค่ไหน '
WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('S6', row)]))

WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/16_S5-S6.png')

WebUI.click(findTestObject('btnNext'))

WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

//take Screenshot
if (xlsData.getValue('Promotion', row).equalsIgnoreCase("Yes")) {
	
	if (xlsData.getValue('Promotions', row).equalsIgnoreCase("2")) {
		
		'P1 เคยเห็นสินค้าหรือ/โปรโมชั่นนี้หรือไม่'
		WebUI.click(findTestObject('buffet', [('buff') : xlsData.getValue('P1', row)]))
		
		WebUI.delay(2)
		
		WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/17.2_P1-P2_TC_'+ (row) +'.png')
	
		'P2 คุณทราบถึงสินค้า/โปรโมชั่นนี้จากช่องทางใด'
		CustomKeywords.'com.fb180.Utilities.MyUtilities.myCheckbox'(findTestObject('checkboxes'), xlsData.getValue('P2', row))
	
		'อื่นๆ P2'
		if (xlsData.getValue('P2', row).reverse().take(2).reverse() == 'ON') {
			WebUI.setText(findTestObject('textArea'), xlsData.getValue('OtherTP2', row))
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
		
		WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/18.2_P3_TC_'+ (row) +'.png')
	
		WebUI.click(findTestObject('btnNext'))
	
		WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)
	
		'P5 คุณมีความพึงพอใจต่อสินค้า/โปรโมชั่นนี้ มากน้อย แค่ไหน'
		if (xlsData.getValue('P3', row).equalsIgnoreCase("1")){
		WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('P5', row)]))
		 
			if (Integer.valueOf(xlsData.getValue('P5', row)) < 3){
				'P5.1 ขอความคิดเห็นเพื่อนำไปปรับปรุงในอนาคต'
				WebUI.setText(findTestObject('Object Repository/textArea'), xlsData.getValue('P5.1', row))
			}
		
		WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/19.2_P5.png')
	
		WebUI.click(findTestObject('btnNext'))
		}
	
		WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)
	
		'P6 คุณอยากให้มีสินค้า/โปรโมชั่นนี้ให้บริการซ้ำอีก มากน้อย แค่ไหน'
		WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('P6', row)]))
	
		'P7 คุณอยากจะแนะนำสินค้า/โปรโมชั่นนี้ให้ผู้อื่น มากน้อย แค่ไหน'
		WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('P7', row)]))
		
		WebUI.scrollToElement(findTestObject('btnNext'), 1)
		
		WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/20.2_P6.png')
	
		WebUI.click(findTestObject('btnNext'))
		
	}
	
    'P1 เคยเห็นสินค้าหรือ/โปรโมชั่นนี้หรือไม่'
    WebUI.click(findTestObject('buffet', [('buff') : xlsData.getValue('P1', row)]))
	
	WebUI.delay(2)
	
	WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/17.1_P1-P2_TC_'+ (row) +'.png')

    'P2 คุณทราบถึงสินค้า/โปรโมชั่นนี้จากช่องทางใด'
    CustomKeywords.'com.fb180.Utilities.MyUtilities.myCheckbox'(findTestObject('checkboxes'), xlsData.getValue('P2', row))

    'อื่นๆ P2'
    if (xlsData.getValue('P2', row).reverse().take(2).reverse() == 'ON') {
        WebUI.setText(findTestObject('textArea'), xlsData.getValue('OtherTP2', row))
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
	
	WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/18.1_P3_TC_'+ (row) +'.png')

    WebUI.click(findTestObject('btnNext'))

    WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

    'P5 คุณมีความพึงพอใจต่อสินค้า/โปรโมชั่นนี้ มากน้อย แค่ไหน'
	if (xlsData.getValue('P3', row).equalsIgnoreCase("1")){
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('P5', row)]))
	 
		if (Integer.valueOf(xlsData.getValue('P5', row)) < 3){
			'P5.1 ขอความคิดเห็นเพื่อนำไปปรับปรุงในอนาคต'
			WebUI.setText(findTestObject('Object Repository/textArea'), xlsData.getValue('P5.1', row))
		}
	
	WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/19.1_P5.png')

    WebUI.click(findTestObject('btnNext'))
	}

    WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)


    'P6 คุณอยากให้มีสินค้า/โปรโมชั่นนี้ให้บริการซ้ำอีก มากน้อย แค่ไหน'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '1', ('vote') : xlsData.getValue('P6', row)]))

    'P7 คุณอยากจะแนะนำสินค้า/โปรโมชั่นนี้ให้ผู้อื่น มากน้อย แค่ไหน'
    WebUI.click(findTestObject('VoteSelect', [('rowNo') : '2', ('vote') : xlsData.getValue('P7', row)]))
	
	WebUI.scrollToElement(findTestObject('btnNext'), 1)
	
	WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/20.1_P6.png')

    WebUI.click(findTestObject('btnNext'))
}

WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

'O1 ใช้บริการของแบรนด์นี้กี่ครั้ง (Error message:\tกรุณาใส่ตัวเลข 1-100)'
WebUI.setText(findTestObject('txInput1st'), xlsData.getValue('O1', row))

'O2 รับประทานอาหารนอกบ้านกี่ครั้ง (Error message: กรุณาใส่ตัวเลข 1-100)'
WebUI.setText(findTestObject('txInput2nd'), xlsData.getValue('O2', row))

'O3 ใช้บริการจัดส่งอาหารถึงบ้าน (ดีลิเวอรี่) กี่ครั้ง (Error message: กรุณาใส่ตัวเลข 0-100)'
WebUI.setText(findTestObject('txInput3rd'), xlsData.getValue('O3', row))

WebUI.scrollToElement(findTestObject('btnNext'), 1)

WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/21_O1-O3.png')

WebUI.click(findTestObject('btnNext'))

'O4 ในช่วง 3 เดือนที่ผ่านมาคุณใช้บริการร้านอาหารใดต่อไปนี้บ้าง [ตอบได้มากกว่า 1 ข้อ]'
WebUI.waitForElementVisible(findTestObject('checkboxes'), GlobalVariable.timeout)

WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

WebUI.delay(2)

WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/22_O4_1.png')

CustomKeywords.'com.fb180.Utilities.MyUtilities.myCheckbox'(findTestObject('checkboxes'), xlsData.getValue('O4', row))

WebUI.scrollToElement(findTestObject('btnNext'), 1)

WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/22_O4_2.png')

WebUI.click(findTestObject('btnNext'))

'O5 จากรายชื่อร้านอาหารดังต่อไปนี้ ร้านใดเป็นร้านที่คุณชอบที่สุด [คำตอบเดียว]'
WebUI.waitForElementVisible(findTestObject('radioChoiceService'), GlobalVariable.timeout)

WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

CustomKeywords.'com.fb180.Utilities.MyUtilities.myRadioImg'(findTestObject('radioChoiceService'), xlsData.getValue('O5', 
        row))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/23_O5.png')

WebUI.click(findTestObject('btnNext'))

'Z1 ชื่อ-นามสกุล (required)'
WebUI.setText(findTestObject('txInput1st'), xlsData.getValue('Z1', row))

'Z3 เบอร์โทรศัพท์ (required)'
WebUI.setText(findTestObject('txInput2nd'), xlsData.getValue('Z3', row))

'Z4 Email  หากไม่ระบุอีเมล ต้องบันทึกภาพหน้าจอที่'
WebUI.setText(findTestObject('txInput3rd'), xlsData.getValue('Z4', row))

'Z5 ระบุสถานะของคุณ [คำตอบเดียว]'
WebUI.click(findTestObject('radio_age', [('age') : findTestData('oishiData').getValue('Z5', row)]))

'Z6 คุณมีบุตรหรือไม่ [คำตอบเดียว]'
WebUI.click(findTestObject('radio_children', [('son') : findTestData('oishiData').getValue('Z6', row)]))

WebUI.waitForElementVisible(findTestObject('btnNext'), GlobalVariable.timeout)

WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/24_Z1-Z6.png')

//WebUI.click(findTestObject('btnNext'))
//WebUI.delay(5)
//WebUI.takeScreenshot('Screenshots/OISHI/TC_01_0'+ (row) +'/25_Reward_TC_'+ (row) +'.png')
//WebUI.closeBrowser()