package io.cucumber.shouty;

import java.util.ArrayList;
import java.util.List;

public class Person {


    public Person(String name) {
    }

    public void moveToDistance(int distance) {
    }

    public void shout(String message) {
    }

    public List<String> getMessageHeard() {
        List<String> messageList = new ArrayList<>();
        messageList.add(StepDefinitions.messageFromSean);
        return messageList;
    }
}
