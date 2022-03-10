package mezlogo.sample_ci.cli;

import mezlogo.sample_ci.api.GreetService;

public class Main {
    public static void main(String[] args) {
        System.out.println(new GreetService().greet("Bob"));
    }
}
