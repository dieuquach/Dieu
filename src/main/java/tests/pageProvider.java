package tests;

import org.openqa.selenium.support.PageFactory;
import pages.customerDepositPage;
import pages.customerLoginPage;
import pages.opentWebsitePage;
import runner.TestRunner;

public class pageProvider {
    private static customerLoginPage customerLoginPage;
    private static customerDepositPage customerDepositPage;
    private static opentWebsitePage opentWebsitePage;


    public static customerLoginPage GetcustomerLoginPage() {
        if (customerLoginPage == null) {
            customerLoginPage = PageFactory.initElements(TestRunner.driver, customerLoginPage.class);
        }
        return customerLoginPage;
    }

    public static customerDepositPage GetcustomerDepositPage() {
        if (customerDepositPage == null) {
            customerDepositPage = PageFactory.initElements(TestRunner.driver, customerDepositPage.class);
        }
        return customerDepositPage;
    }

    public static opentWebsitePage GetopentWebsitePage() {
        if (opentWebsitePage == null) {
            opentWebsitePage = PageFactory.initElements(TestRunner.driver, opentWebsitePage.class);
        }
        return opentWebsitePage;
    }
}
