package tpavels.patterns.creational.factory;

public interface Factory {

    ReaderService createReaderService();
    WriterService createWriteService();
}
