package in.swapnilsingh.chainofresponsibility;

public abstract class Handler {

    protected Handler sucessor;

    public void setSucessor(Handler sucessor) {
        this.sucessor = sucessor;
    }

    public abstract void handleRequest(Request request);

}
