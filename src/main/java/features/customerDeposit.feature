Feature: Customer login

  Scenario Outline: Customer deposit done
    Given Login succesfully
    When I click Dep button
    When I type Amount as <numberDep>
    When I click DepositBottom button
    Then I verify Deposit Successful

    Examples:
    |numberDep|
    |2000|