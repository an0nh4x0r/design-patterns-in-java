package in.swapnilsingh.chainofresponsibility;

public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {

        if (request.getRequestType() == RequestType.PURCHASE) {
            if (request.getAmount() < 1500) {
                System.out.println("VPs can approve below 1500");
            } else {
                sucessor.handleRequest(request);
            }
        }

    }
}
