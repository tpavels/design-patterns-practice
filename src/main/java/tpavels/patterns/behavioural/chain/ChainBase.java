package tpavels.patterns.behavioural.chain;

public abstract class ChainBase {

    protected ChainBase chainBase;

    public abstract void handleRequest(Long code);

    public void setChainBase(ChainBase chainBase) {
        this.chainBase = chainBase;
    }
}
