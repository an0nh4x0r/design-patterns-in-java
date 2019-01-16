package in.swapnilsingh.proxy;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

public class TwitterServiceImpl implements TwitterService{

    private static final String TWITTER_CONSUMER_KEY = "orpYx56mPjIvbq0Xzz35ciN0a";
    private static final String TWITTER_SECRET_KEY = "lcXkwdd3v3Mypf6HxDa4WY7ngLocy4hl52c37uMQwRdG6zxeGR";
    private static final String TWITTER_ACCESS_TOKEN = "2879142439-wdi4dNG2aVD7WxJ98ZeeC0wIQ0bW8iHnV7ZGAYO";
    private static final String TWITTER_ACCESS_SECRET_TOKEN = "nPec5pOObgrkGxjCkxpo83DLsFNJpb0zrDUJIVvLH2CQz";


    @Override
    public String getTimeline(String screenName) {

        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();

        configurationBuilder.setDebugEnabled(true)
                .setOAuthConsumerKey(TWITTER_CONSUMER_KEY)
                .setOAuthConsumerSecret(TWITTER_SECRET_KEY)
                .setOAuthAccessToken(TWITTER_ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(TWITTER_ACCESS_SECRET_TOKEN);

        TwitterFactory twitterFactory = new TwitterFactory(configurationBuilder.build());
        Twitter twitter = twitterFactory.getInstance();

        StringBuilder stringBuilder = new StringBuilder();

        try {
            Query query = new Query(screenName);
            QueryResult result;

            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();

                for (Status tweet : tweets) {
                    stringBuilder.append("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                    stringBuilder.append("\n");
                }
            } while ((query = result.nextQuery()) != null);

        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets " + te.getMessage());
        }

        return stringBuilder.toString();
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        System.out.println(message);
    }
}
