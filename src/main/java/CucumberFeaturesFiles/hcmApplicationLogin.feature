@tag

Feature: Title of your feature
  I want to use this template for my feature file

Background:
Given 	Launch HCM Url Application 


  @hcm
  Scenario Outline: Title of your scenario outline
  	Given Launch HCM Application 
  	When Login with <userID> and <passWord>
  	Then wait for sometime and close
   

    Examples: 
      | userID  |  passWord 	|
      | Admin 	|  admin123		| 
     

     
###########################################################################################################
																			# SCENARIO OUTLINE #
# If we need to send the data as a parameter then we need to use the key word called scenario outline 
# Scenario Outline is used if we need to send parameters
###########################################################################################################