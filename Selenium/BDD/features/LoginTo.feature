Feature:
  As a user, I want to login to website

  @unhappypath
  Scenario Outline: Unable to login with wrong date
    Given User is on login page
    When User write <logid> and <pass>
    Then Unsuccessfull login

    Examples:
    | logid             | pass |
    | wrong_name        | secret_sauce |
    | locked_out_user   | secret_sauce |
    | standard_user     | sauce        |
