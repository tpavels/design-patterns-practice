package tpavels.patterns.behavioural.chain;

public class ChainA extends ChainBase {

    @Override
    public void handleRequest(Long code) {
        if (code > 400 && code <= 500  && chainBase != null) {
            chainBase.handleRequest(code);
        } else {
            System.out.println("ChainA");
        }
    }
}
