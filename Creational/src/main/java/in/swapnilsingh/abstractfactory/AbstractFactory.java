package in.swapnilsingh.abstractfactory;

public class AbstractFactory {

    public static void main(String[] args) {

        CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard card = creditCardFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card.getClass());

        CreditCardFactory creditCardFactory1 = CreditCardFactory.getCreditCardFactory(500);
        CreditCard card1 = creditCardFactory1.getCreditCard(CardType.GOLD);
        System.out.println(card1.getClass());

    }

}
