package mezlogo.template_cli.cli;

import mezlogo.template_cli.cli.commands.GreetCommand;
import picocli.CommandLine;

@CommandLine.Command(
        name = "mycliapp",
        subcommands = {CommandLine.HelpCommand.class, GreetCommand.class},
        mixinStandardHelpOptions = true
)
public class MainCommand {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new MainCommand()).execute(args);
        System.exit(exitCode);
    }
}
