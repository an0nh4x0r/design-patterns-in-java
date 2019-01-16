package in.swapnilsingh.proxy;

public class TwitterDemo {

    public static void main(String[] args) {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());
        System.out.println(service.getTimeline("an0nh4x0r"));

        service.postToTimeline("an0nh4x0r", "This is passing through ... which shouldn't be passing");
    }

}
