package tpavels.patterns.behavioural.chain;

public class ChainC extends ChainBase {
    
    @Override
    public void handleRequest(Long code) {
        System.out.println("ChainC");
    }
}
