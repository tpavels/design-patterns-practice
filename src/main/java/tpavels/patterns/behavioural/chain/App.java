package tpavels.patterns.behavioural.chain;

public class App {

    public static void main(String[] args) {
        ChainA chainA = new ChainA();
        ChainB chainB = new ChainB();
        ChainC chainC = new ChainC();

        chainA.setChainBase(chainB);
        chainB.setChainBase(chainC);

        chainA.handleRequest(450L);
    }
}
