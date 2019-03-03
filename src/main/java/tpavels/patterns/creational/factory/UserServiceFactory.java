package tpavels.patterns.creational.factory;

public class UserServiceFactory implements Factory {

    @Override
    public ReaderService createReaderService() {
        return () -> "reading data as user service...";
    }

    @Override
    public WriterService createWriteService() {
        return s -> System.out.println("writing data as user service: " + s);
    }
}
