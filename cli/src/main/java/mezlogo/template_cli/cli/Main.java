package mezlogo.template_cli.cli;

import mezlogo.template_cli.api.GreetService;

public class Main {
    public static void main(String[] args) {
        System.out.println(new GreetService().greet("Bob"));
    }
}
