package mezlogo.template_cli.cli;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import picocli.CommandLine;

public class MainCommandTest {
    @Test
    public void bob_should_return_error() {
        int exitCode = new CommandLine(new MainCommand()).execute("greet", "Bob");
        Assertions.assertEquals(-1, exitCode);
    }

    @Test
    public void empty_name_should_return_error() {
        int exitCode = new CommandLine(new MainCommand()).execute("greet");
        Assertions.assertEquals(-1, exitCode);
    }

    @Test
    public void bill_should_return_ok() {
        int exitCode = new CommandLine(new MainCommand()).execute("greet", "Bill");
        Assertions.assertEquals(0, exitCode);
    }
}
