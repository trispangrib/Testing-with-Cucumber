#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Test for StokUnlimitied (stockunlimited.com)
# @LoginStockUnlimited
#  Scenario: Test login with Valid Credentials
#  Given open chrome and start application
#  When I can enter valid emailaddress and valid password
#  Then I can login succesfully to StockUnlimited
 
 #@ChangePassword
 #Scenario: Test change password
 # Given I login to StockUnlimited
 # When I can enter to security
 # Then I can change the password
  
 #@SearchingWorkbook
 # Scenario: Test Search Box 
 #  Given I can login to StockUnlimited
 #  When I can enter the search box
 #  Then I can find the workbook
   
 #@SearchingArianaMusic(Audio)
 # Scenario: Test SearchBox with ariana music as a value
 #  Given I can login to StockUnlimited
 #  When I can enter the search box
 #  Then I can find ariana music
 
 # @SearchingSansSerif(Fonts)
 # Scenario: Test SearchBox with sans serif as a value
 #  Given I can login to StockUnlimited
 #  When I can enter the search box
 #  Then I can find sans serif
   
   
 # @PressButton(FindOutMore)
 # Scenario: Test Button 
 #  Given I can enter email and password
 #  When I can login to stockUnlimited
 #  Then I can press the button
   
 # @PressButton(NewImages)
 # Scenario: Test Button 
 #  Given I can enter email and password
 #  When I can login to stockUnlimited
 #  Then I can press the button
   
 # @PressButton(SeePlans&Pricing)
 # Scenario: Test Button 
 #  Given I can enter email and password
 #  When I can login to stockUnlimited
 #  Then I can press the button
   
 # @PressButton(MyAccount)
 # Scenario: Test Button 
 #  Given I can enter email and password
 #  When I can login to stockUnlimited
 #  Then I can press the button
   
   
  @PressButton(Favorites)
  Scenario: Test Button 
   Given I can enter email and password
   When I can login to stockUnlimited
   Then I can press the button
 