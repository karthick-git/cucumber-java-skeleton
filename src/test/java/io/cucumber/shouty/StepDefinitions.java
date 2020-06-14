package io.cucumber.shouty;

import io.cucumber.classes.Belly;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    Person sean = new Person("Sean");
    // Write code here that turns the phrase above into concrete actions
    Person lucy = new Person("Lucy");
    public static String messageFromSean;

    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @Given("{person} is located {int} metres from Sean")
    public void lucy_is_located_metres_from_Sean(Person Lucy,int distance) {
        lucy.moveToDistance(distance);
        System.out.println("distance = " + distance);
    }

    @When("Sean shouts {string}")
    public void sean_shouts(String message) {
        // Write code here that turns the phrase above into concrete actions
        sean.shout(message);
        messageFromSean = message;
        System.out.println("message = " + message);
    }

    @Then("Lucy hears Sean\'s message")
    public void lucy_hears_Sean_s_message() {
        // Write code here that turns the phrase above into concrete actions

        assertEquals(asList(messageFromSean),lucy.getMessageHeard());
    }

}
