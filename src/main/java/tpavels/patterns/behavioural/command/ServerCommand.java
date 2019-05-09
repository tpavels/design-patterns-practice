package tpavels.patterns.behavioural.command;

public class ServerCommand extends Command {

    public ServerCommand(Action action) {
        super(action);
    }

    @Override
    public void execute() {
        action.execute();
    }
}
