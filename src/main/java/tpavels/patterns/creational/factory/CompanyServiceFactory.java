package tpavels.patterns.creational.factory;

public class CompanyServiceFactory implements Factory {

    @Override
    public ReaderService createReaderService() {
        return () -> "reading data as company service...";
    }

    @Override
    public WriterService createWriteService() {
        return s -> System.out.println("writing data as company service:" + s);
    }
}
