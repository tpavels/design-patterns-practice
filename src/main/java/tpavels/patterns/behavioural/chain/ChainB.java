package tpavels.patterns.behavioural.chain;

public class ChainB extends ChainBase {
    
    @Override
    public void handleRequest(Long code) {
        if (code == 450 && chainBase != null) {
            chainBase.handleRequest(code);
        } else {
            System.out.println("ChainB");
        }
    }
}
