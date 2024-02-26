package popcorn;

public class PopcornOrder {
    private String variety;
    private int numOrdered;

    public PopcornOrder(String variety, int numOrdered){
        this.variety = variety;
        this.numOrdered = numOrdered;
    }

    public String getVariety() {
        return variety;
    }

    public int getNumOrdered() {
        return numOrdered;
    }
}
