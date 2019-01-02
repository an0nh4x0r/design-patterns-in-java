package in.swapnilsingh.builder;

// Problem with this bean is that it is really not immutable after building
// an object we can go and change value of fields using setters i.e. not immutable.

public class LunchOrderBean {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderBean() {

    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public void setCondiments(String condiments) {
        this.condiments = condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
