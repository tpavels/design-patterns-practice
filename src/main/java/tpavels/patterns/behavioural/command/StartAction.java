package tpavels.patterns.behavioural.command;

public class StartAction implements Action {
    @Override
    public void execute() {
        System.out.println("Start action");
    }
}
