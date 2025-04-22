package StepDefinition;

import BDDSample.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;


public class WithdrawCashSteps {

    private ATM atm;
    private Account account;
    private double previousBalance;

    @Given("I have a balance of ${int} in my account")
    public void i_have_a_balance_of_$_in_my_account(int balance) {
        account = new Account(balance);
        atm = new ATM(account);
        System.out.println("Account Balance is :"+account.getBalance());
    }

    @When("I request to withdraw ${double}")
    public void i_request(double amount) {
        previousBalance = account.getBalance();
        System.out.println("Request to withdraw : "+amount);

        // Withdraw amount from account
        atm.withdraw(amount);
        System.out.println("After Withdrawal of "+amount+" balance is "+account.getBalance());
    }

    @Then("${int} should be dispensed")
    public void should_be_dispensed(int amount) {
        Assert.assertEquals(previousBalance,account.getBalance()+amount,"Account balance mismatch");
        System.out.println("TEST PASSED");
    }
}
