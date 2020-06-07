Feature:
  As a user, I want to contact with company using contact form

  @happypath
  Scenario: Properly complate form 
    Given User is on contact page
    When User complete form with correct data
    Then Mail has been sent
    And User see communicate
