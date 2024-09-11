   advantages of maven projects
1	it gives folder structure
2	it gives continuous integration with frameworks 
3	supports 2 types of softwares or plugins: 1. eclipse pluglin and 2. commandline plugin
4	supports jenkins and github

regression testing:
process of testing the unchanged areas after modification of a feature to check if it is impacted or not
it is repetitive process so company switches to automation testing to reduce time and effort
automation testing: process of testing sw with help of tools ex: selenium, qtp:quick test professional

when company switches to automation testing: 
1. when company starts regression testing
2. when time should be saved
3. when you have to run same(repititive) tasks again and again

test automation:


adv of automation testing: 
		it works faster
		it improves the quality of sw
		it reduces time
disadv:
		the initial investment is high(to purchase tool)
		requires skilled person who knows programming
				
automation tools: SELENIUM,QTP

qtp: old
	supports all appllication
	not free like selenium
	
selenium:
	test automation tools
	used to test web app and mobile app
	
adv of selenium:
	open source
	free to download
	supports multiple OS
	supports multiple prog lang
	support multiple browsers
	we can enhance this tool according to user requirement
	
disadv of selenium:
	we cant automate standalone app 
	we cant automate otp/captcha/barcode/networl erroe/audio/video
	we are not going to get immediate support because it is free
	
QUICK TEST PROFESSIONAL

diff between qtp and selenium: 
	qtp is licensed version
	selenium supports multiple os but qtp only supports windows
	selenium supports multiple programming lang but qtp supports only vbscript
	selenium support only web app and mobile app but qtp support all app
	
what is the work of automation engineer
	to convert test cases to test scripts
	
TESTSCRIPTS: 	it is a code or a program which is written against manual test cases
	note: one sprint= 3 to 4 weeks
	
selenium web driver architecture
1. searchContext
2. takeScreenshot
3. JavaScriptExecutor
4. WebDriver

1. searchContext:
	is an interface
	which is used to search elements in the web page
	
	2 abstract methods:
	1. findElement()	:to search single element
						:return type: web element
	
	2. findElements() 	:to search multiple elements
						:return type: List<web elements>
						:we will use for each loop here
							
two important steps in selenium
	1. to search the targeted element(to identify the web element in the web page)
	2. perform actions on the targeted element	

2. takeScreenshot:
it is an interface
	abstract method:
	getScreenshotAs()
		we can take screenshot in 2 ways
		return type:void
		1.webpage screenshot
		2.webelement screenshot
	WHY we take screenshots?
		>	to get better analysis of testscript failure
		>	it acts as a proof in your defect report
		
3. JavaScriptExecutor
	methods:
		1.ExecuteScript()
		2.ExecuteAsyncScript()
			
	>it is an interface, used to perform scrolling operation horizontally or vertically.
	>wh;-+en selenium methods are not working that time we are using javascriptExecutor methods
	
4. WebDriver
	>it is core interface
	>is also called as Browser Controlling
	>used to control the browsers which we are launching
	
	methods:
	1. get
	2. getTitle
	3. getCurrenturl
	4. getPageSource
	5. close
	6. quit
	7. manage
	8. navigate
	9. switchto
	10. getWindowHandle
	11. getWindowHandles
	
procedure to add tools to java projects
>go to selenium.dev>downloads>download the the tool
>paste the tool to jar folder
> right click on the project and click build path to add reference library

or
>go to mvnrepository
>search selenium
>click on selenium java
>click on version to download

procedure to download edgeDriver:
>chk if edge browser is there in system
>check the version
>how to download edgeDriver.exe
	>selenium.dev>platforms supported by selenium
	>click on browser> click on edge documentation
	>click on version to download


27 jan 2024
===========

remotewebdriver
>WebDriver is used to control the system
>RemoteWebDriver is used control one system from another system


QUESTIONS
=========
types of inheritance in selenium? 
types of java concepts reqd in selenium?
where are you going to use inheritance concepts in selenium? 


HTML
====
1.paired tags
2.unpaired tags

what is a tag name?
how to identify tagname? 
the first word or the first letter which is 
written inside the angular bracket is a tagname.

attribute?
provides extra info about tag or elements.
attributes are combination of property/key and values.
in selenium attribute/property is called as AttributeName and the values are known as AtrributeValue.

LOCATOR/SELECTOR
===========
https://letcode.in/test
>create account
>click on signup
>enter nameenter email
>enter pwd
>click on chk box
>clk on signup

LOCATOR: it is a search criteria which is used to search the web element in the web page.
types of locator? 
8 types:
all locators are static methods.
we have to select the locator according to the priority 

TYPES OF LOCATORS/SELECTORS
================
1.id (best locator for findElement())
2.name (best locator to findElement())
	>best locator to findElement() method because it will give you the unique values.
3.class (best locator for findElements() )
	>best locator for findElements() method because it will give you the duplicate values (less).
	TO FIND DUPLICATES CLASSNAME IN SOURCE CODE
	---------------------------------
	1. view source code
	2. ctrl+f
		TO COPY FULL TAG FROM SOURCE CODE
		---------------------------------
		2.1. rght clk on tag in src code
		2.2. copy->copy element and paste it somewhere
	3. paste the following data in search text field:
		tagname[atrributename='attributeValue']
		example: 
		a[class='mobile']
		it searches all the anchor tags with classname as "mobile" in the source code
4.tagname (best locator for findElements())
	>best locator for findElements() method because it will give you the duplicate values(more).
	TO FIND DUPLICATE tags IN SOURCE CODE
	---------------------------------
	1. view source code
	2. ctrl+f
	3. paste the following data in search text field:
		//tagname 
		example : //div
		it searches all the div tags in the source code
	3 WAYS TO INSPECT ELEMENT
	------------------
	1. ctrl+shft+i
	2. ctrl+shift+c then click on element
	3. clk on option ->developer tools
	4. f12
	5. right clk-inspect
5.linktext (best locator to find elements if the element is a link) best for anchor tag
6.partiallinktext (best locator to find elements if the element is a link)best for anchor tag
	difference between linktext and partial linktext
	>	in linktext we compulsory need to pass the complete text
	> 	in partiallinktext we can pass partial text 
7.css (best locator to find elements if the element is expression)
	in selenium we rae using css as a locator
	when we use css element?
	>	when the web element is not having id, name, class or link then we go for css selector/locator
	how to find css properties?
	> 	syntax:
				1. ctrl+f
				2. tagname[attributeName='attributeValue']
					if we get more than one result then search the second attributeName and AttributeValue
					repeat this untill we get 1 of 1 results
				3. once you get 1 of 1 result then copy the text in find text field of inspect to the source code :
						example:
						c.findElement(By.cssSelector("input[placeholder='Search for products and more...']")).sendKeys("shoes");
8.XPath (best locator to find elements if the element is expression)

linktext: text which is present in between the open and closing anchor tags is known as linktext
===========
29/01/2024
===========

30/01/2024
==========
waits are used to slow down execution of the automation scripts
waits: 5 types
	1. Thread.sleep(2000)//2000 is in miliseconds
	to avoid noSuchElement exception
	
when you want to perform more than 1 action then you should store the web element in the variable.
if you want press any button from the keyboard then use the following command line
sendKeys(Key.ENTER);// here ENTER is enum

31/01/24
========
XPath
=======
xpath is also called a s xml-path(extensible markup language)
it provides the path of the element or address of webelement
xpath is also used to exchange the data between the client and the server
there are 2 main types of xpath
1. absolute xpath
2. relative xpath(7 types)
	2.1. xpath by attribute
	2.2. xpath by text
	2.3. xpath by contains
	2.4. xpath by groupIndex
	2.5. independent and dependent xpath
	2.6. xpath by axis
	2.7. co-relative xpath
drawbacks of xpath:
>when the webelement is not having attribute or webelement is having only text
>backward traversing not possible
>when we have duplicate
RELATIVE XPath
>xpath from any child of the document is called relative xpath
=================================
IMPORTANT KEYWORDS FOR XPATH
===============================
.	current project
/	immediate child
//	any child
Index value starts from 1
==================
Selenium		(parent)
jre				(immediate child)
src				(immediate child)
ref library		(immediate child)
drivers 		(immediate child)
	chromedriver.exe		(any child)
	geckodriver.exe			(any child)
	msedgedriver.exe		(any child)
jar				(immediate child)
	selenium-server-4.16.1.jar	(any child)
	
	RELATIVE XPATH
>relative xpath is represented by double slash //
>writing the xpath from any child of the document(html structure)
	ABSOLUTE XPATH
>absolute xpath is represented by single slash /
>
Q.	why we have to go for xpath locator?
>when the element is having only the text then we will go xpath
>when the elements are having duplicates
>when the element is dynamic that time we have to go for xpath

XPATH BY ATTRIBUTE
==================
here we are going to identify the element based on the attribute
syntax:			//tagname[@attributeName='attributeValue']
we rae goint to use AND, OR, NOT when we are working with findelements()

example //img[@type='text' and @value='B']
DISADV OF XPATH BY ATTRIBUTE
============================
when element is having only text
when element is having duplicate

XPATH BY TEXT
================
exception : invalid selector
so we are going with xpath by text
>we have to enter the complete text value
>text value is case sensitive
>linktext & normal text
for anchor tag linktext we can use 1.linktext,2.partialLinkText,3.xpath by text
syntax:
//tagname[text()='textvalue']
DISADVANTAGE/drawbacks OF XPATH BY TEXT
>we cant enter the partial text value=we can over come this by xpath by contains
>if the text is having lengthy spaces 
>when non breakable space present in the text
>when you are having partial text value which is completely dynamic that time we cant use xpath by text
>
1/2/2024
========
dropdown can be targeted with the help of select---
exceptions in selenium: 
	1. nosuchelement
	2. invalidSelectorException
	
NO SUCH ELEMENT EXCEPTION:
	>when internet is slow 
	>if the sorcecode is invalid
	solution:
	>for slow internet use Thread.sleep()
	>before copy pasting the source code from web page plz confirm that ther are 1 of 1 results.
note:class selector doesnot allow multiple class names.
INVALID LOCATOR EXCEPTION	
	>when we use multiple class name with class selector
	solution: always use css selector for multiple class names and space
XPATH BY ATTRIBUTE:
=====================
	>search the element on the webpage on the base of attribute
syntax:
//tagname[@attributeName='attributeValue']
	>to remove duplicate use xpath by attribute along with xpath by groupIndex.
	> we cannot use logical operators with cssselector.
DRAWBACKS OF XPATH BY ATTRIBUTE
>duplicates cannot be removed=xpath by groupIndex
>when element is having only text then xpath by attribute will not work=so we use xpath by text

=========================
XPATH BY CONTAINS
=================
>when we have partial attribute value or partial text value
syntax:
for text:
//tagname[contains(text(),'partial text value')]
when we use xpath by contains text?
>when text is very lengthy

for attribute:
//tagname[contains(@AttributrName,'partial attribute value')]
2/2/2024
=========
when we are going to use xpath by contains with attribute? 
>when the attribute value is very lengthy.

drawback of xpath by contains
==============================
when the element is completely dynamic that time xpath by contains will not support but when it is partially dynamic it will support

XPATH BY GROUPINDEX
====================
when?
>when the element is having duplicates that time we hacve to use xpath by groupIndex

>identify the webelement on the basis of index value and index value starts from 1.

xpath by attribute:
//tagname[contains(@AttributrName,'partial attribute value')]

syntax for xpath by group index:
(xpath by attribute syntax)[index]
or
(//tagname[contains(@AttributrName,'partial attribute value')])[index]

INDEPENDENT AND DEPENDENT XPATH
==================================
independent means fixed element
dependent means dynamic element
identifyting the dynamic web element(ex=mobile price) on the basis of fixed element(ex=mobile name) is called  

when webelement is completely dynamic that time we are going to use independent and dependent xpath
STEPS
1>identify the fixed element and dynamic element
2>write the xpath for fixed element 
3>update the xpath by backward traversing(/..)
	why we do backward traversing? to find common parent for fixed and dynamic element
4>update the xpath for dynamic element
		example
		flipkart>search mobiles>(//div[@class='_4rR01T'])[1]/../..(//div[@class='_30jeq3 _1_WHN1'])[1]

1>mobile name, mobile price
2>(//img[@class='_2r_T1I'])[2]
3>(//img[@class='_2r_T1I'])[2]/../../../../../..
4>(//img[@class='_2r_T1I'])[2]/../../../../../..//div[@class='_30jeq3']


03/02/2024
ask interview 4 point
Absalute x path  
 1)write the xpath from root of the document(html structure)
 */ -->immediate child
 very langthy because we write very immadte
 It consume more time 
 use early 
 
 write a program
 
 <!DOCTYPE html>
<html>
<head>
	
	<title>Absalute Path</title>
</head>
<body>
	<div>
		<input type="text" value="A">
		<input type="text" value="B">
	</div>
<div>
		<input type="text" value="c">
		<input type="text" value="D">
	</div>
</body>
</html>

Check for the syntax and check the A,B,C,D

A====html/body/div[1]/input[1]

B====html/body/div[1]/input[2]

C=====html/body/div[2]/input[1]

AB======html/body/div[1]/input

CD======html/body/div[2]/input

AC=======html/body/div/input[1]

BD=======html/body/div/input[2]

ABCD=====html/body/div/input

AD=======html/body/div[1]/input[1]|html/body/div[2]/input[2]

BC=======html/body/div[1]/input[2]|html/body/div[2]/input[1]

It's process about the check the syntax is properlly working or not the website It's very langthy.

Absolute:

html/body/div[1]/div/div[1]/div/dev/div/div/div[1]/div/div[1]/div/d iv[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[1]/div/div/div/div /img   ----> It's all about the process of the absalute pathe is very slow

Xpath by attribute & group index:

(//img[@class='_2puwtw_3a3qyb'])[1]

Core relative xpath://a[1]/div/div/div/div/img

//img----77

//div/img---48

//div/div/img--18

//div/div/div/img---18

//div/div/div/div/img--17


Task about  Absalute path
1. Launch pantaloon bag
2. 
 
 RELATIVE XPath 

 write the xpath from any child of the documenet (html structure)
 *// --> any child
  very short because we write very less time
   It consume less time 
   
   



24/02/24

SwitchTo():
Transfer the control from onre tab to another tab, one window ti another  window, one frame to another frame.

Frame:
It also called embedded webpage. one webpage inside another webpage or one html inside another tml.
*Develpoer are using <iframe></iframe>  to design frames on the webpage.
Syntax - //iframe   -->Search source code



<html>
<head>
</head>
<body>
  <html>
  <head>
  </head>
  <body>
  </html>
</body>
</html>

How to check frame is present in the webpage?
Go to webpage--- right click ---inspect--- press control F---//iframe


//1. check Targeted webelement(YouTube) is pesent inside the frame:
*IF you Right click---- view framesource & Relode frame
*The Ancester will be having <iframe></iframe>
*NosuchElementException  if targeted webelement is present inside frame--(3Point)
    1.Internet slow
    2.elemet and loactor is wrong
    3.Iframe outside


//2. Transfer the driver control to the frame:
*Driver.switchto().frame(int index)
*Driver.switchto().frame(id or name)
*Driver.switchto().frame(WebElememt targeted)

//3. Identify the targeted WebEleemnt by using Findelemt() or findelements() and  perform the action.

Slider Asignement
same flipkart price slipder (any product)
https://jqueryui.com/slider/


26/02/2024
Avance Selenium
1. Maven
2. DDT(Data driven Testing)


Maven: (Build Management tool)-version controlling tool
  * Build Development phase
  * Build Management phase
  * Build Deployment pahse


Why?
When multiple test engineer working with same framework if any one test engineer do any modififcation  in the framework  it effect entire team to avoid this we are using Maven.

How many  types of plugins(s/w) in Maven?
*Eclipse Plugin
*Command Line plugin(using software)
     Command- mvn clean
              mvn validate
              mvn compile
              mvn test
              

What are the Advantagesof Maven:
(Developer are Tester -- > also use in MavenProject)
(* It maven repositoriy also called global Repositiery and cluod based Repositiery.)
* Easily we can adding a tool  & Updating the tool is  easier.
*It's provide folder structure.
*It give  continues integration with the framework.
*It support Jenkins (CI/CD).
* The <dependency>  will downlod  the file from global repository.
(https://mavenrepository.com) to local repository (.m2)((.m2) is a folder)
*Maven Support Command line


Support to create Maven Project :
1)Go to File ---- New---click on project ----click on Maven(folder)---click on Maven  project---- 
click on next----select a checkbox(create a simple project)---click on next ----enter groupIDIcompany name)& artiactied(project name)---click on finish


What is DDT?
*Reading a Data  from extranal resource & run test script is called DDT.

Why DDT?
According to automation Testing we should  harcode (fixed) the data in the testscript because if the data is change in (TDS-(TIME CONSUMMING PROCESS)  POINT IN MAINTAIN.

What are the  Exranal Resourses?
1. Excel
2.Property file
3.Data base


Advantages of DDT?
*Mantaince of test Data is easyier.
*Mondififcation of test Data is easyier.
*running in test script in different credentials is easy.
*rerunning same test script multiple times with different data is easy.





11/03/2024
Action clas:
drag & drop()
drap&dropBy()
movetoelement()
click()
click(WT)
Contextclick() 
Contextclick(WT) 
DoubleClick()
DoubleClick(WT)
Click&hold()
Click&hold(WT)
moveByoffset()
Release()
Release(WT)
Perform()
sendkeys()
sendkeys(WT)
movetoelement(WT,Intxoffset,intyoffset)
build()-Build a  target Element 
keyup()--- Release the button in keyboard
keydown()-- press the button in keyboard

Findelements():
* This is abstract method in search context interface.
*List<WebElement>
*To search more then one Webelement in the web Page we  are using Findelements()
*Best loactor for class and TagName for findelements()  method, Because it give more duplicates.
*TagName give more duplicate compare to class.
*We are having multiple Webelements so we are using for-each loop(compelsari in findelements consepts).


How to write xpath multiple elements:(Steps)
*Inspect any one WebElement.
*perform backword Traversing until we get source code of all Webelement one bellow another.
*find the similarity
































































  
 
 
 
