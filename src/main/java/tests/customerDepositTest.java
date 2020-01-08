package tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.TestRunner;

public class customerDepositTest {

    customerDepositTest customerDepTest;

//    @Given("^Login succesfully &"){
//        public void Loginsuccesfully(String website) throws InterruptedException {
//            Thread.sleep(3000);
//            TestRunner.driver.get(website);
//            TestRunner.driver.manage().window().maximize();
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    @When("^I click Dep button$")
    public void clickDepTopBtn() throws InterruptedException {
        Thread.sleep(3000);
        customerDepTest.clickDepTopBtn();
    }

    @When("^I type Amount as (.*)$")
    public void inputAmountDep(String numberDep) throws InterruptedException {
        Thread.sleep(3000);
        customerDepTest.inputAmountDep(numberDep);
    }

    @When("^I click DepositBottom button$")
    public void clickDepBottomBtn() throws InterruptedException {
        Thread.sleep(3000);
        customerDepTest.clickDepBottomBtn();
    }


}
