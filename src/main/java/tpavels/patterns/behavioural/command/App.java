package tpavels.patterns.behavioural.command;

public class App {

    public static void main(String[] args) {
        ServerCommand startCommand = new ServerCommand(new StartAction());
        ServerCommand stopCommand = new ServerCommand(new StopAction());

        startCommand.execute();
        stopCommand.execute();
    }
}
