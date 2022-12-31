@tag

Feature: Title of your feature
  I want to use this template for my feature file

Background:
Given 	Launch HCM Url Application 


  @tagDemo
  Scenario Outline: Title of your scenario outline
  	Given Launch HCM Application 
  	When Login with <userID> and <passWord>
   

    Examples: 
      | userID  |  passWord 	|
      | Admin 	|  admin123		| 
     
