@tag
Feature: Title of your feature
  I want to use this template for my feature file

###########################################################################################################
# This is similar to DataProvider in the TestNG.
# We can run the same test case with multiple Test Sets 
# We need to use the Scenario Outline for this along with Examples
# Also, we have DataTable where in we can push data direclty .. Please refer DataTables
###########################################################################################################



  @Paramerization
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <password> in step

    Examples: 
      | name  		| value | password  |
      | UserName1 |     5 | Password1	|
      | UserName2 |     7 | Password2 |
