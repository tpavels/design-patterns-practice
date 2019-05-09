package tpavels.patterns.behavioural.command;

public abstract class Command {

    protected Action action;

    public Command(Action action) {
        this.action = action;
    }

    public abstract void execute();
}
