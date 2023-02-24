Feature: smart light App test

@Test0
 Scenario: validate Homepage Test
  Given user opens browser
  Then user enters username and password
  Then user validate homepage title
  Then Validate logged in user

  
@Test1
 Scenario: Verify IL Mode of opertion
  Given user login dashboard
  Then user moves to Device trends page
  Then user validate page title
  Then user clicks on mode of operation in Query configuration command
  