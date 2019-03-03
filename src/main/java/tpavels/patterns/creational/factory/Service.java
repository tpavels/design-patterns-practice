package tpavels.patterns.creational.factory;

public class Service {

    private ReaderService reader;
    private WriterService writer;

    Service(Factory factory) {
        reader = factory.createReaderService();
        writer = factory.createWriteService();
    }

    public ReaderService getReader() {
        return reader;
    }

    public WriterService getWriter() {
        return writer;
    }
}
