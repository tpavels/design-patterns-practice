package tpavels.patterns.behavioural.command;

public class StopAction implements Action {
    @Override
    public void execute() {
        System.out.println("Stop action");
    }
}
