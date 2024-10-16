Feature: Demo signup functionality

  #@single
  #Scenario: Verify the signup with valid data
  #Given User is navigated to the signup page
  #When user enter the name and email
  #| name    | email                   |
  #| namrata | ns.nmrtasingh@gmail.com |
  #And click on signup Button
  #Then user navigate to the information page
  #
  #@multiple
  Scenario Outline: Verify the signup with multiple set of data
    Given user navigate to the signup page
    When user input the <fullname> and <emailid>
    And Click on the signup button
    Then user should navigate to the information page with valid data

    Examples: 
      | fullname | emailid                 |
      | nimmi    | ns.nmrtasingh@gmail.com |
      | xyz      | nimmi@gmail.com         |
      | shubham  | shubham@gmail.com       |
