package in.swapnilsingh.template;

public class TemplateDemo {

    public static void main(String[] args) {
        System.out.println("Web Order: ");

        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();
    }

}
