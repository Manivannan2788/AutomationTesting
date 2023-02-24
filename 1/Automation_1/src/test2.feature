Feature: Create AutomaticPolicy Action

  Background: 
    Given Launch url
    And Login application as a 'admin'

  @HappyPath
  Scenario: Validate the user is able to create a program successfully
    Given Select 'Programs' tab and click on 'Program' button
    When 'Fill and Validate' details in 'General Information Page'
      | FieldName         | Value                   | FieldType        |
      | ProgramName       | test prog12             | Textbox          |
      | Number         | 272920             | Textbox          |
      
