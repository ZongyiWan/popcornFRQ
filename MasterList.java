package popcorn;
import java.util.ArrayList;
import java.util.Set;

public class MasterList {
    private ArrayList<PopcornOrder> orders;
    public MasterList(){
        orders = new ArrayList<PopcornOrder>();
    }

    public void addOrder(PopcornOrder order){
        orders.add(order);
    }

    public int getTotalOrders(){
        int output = 0;
        if(orders.size()>0){
            for(PopcornOrder order : orders)
                output += order.getNumOrdered();
        }
        return output;
    }

    public int removeVariety(String variety){
        int removed = 0;
        if(orders.size()>0){
            for(int i = orders.size() - 1; i >= 0; i--){
                if(orders.get(i).getVariety().equals(variety)){
                    removed += orders.remove(i).getNumOrdered();
                }
            }
        }
        return removed;
    }

    public String toString(){
        String output = "";
        if(orders.size()>0){
            for(PopcornOrder order : orders){
                output += order.getVariety() + ":" + String.valueOf(order.getNumOrdered()) + "\n";
            }
        }
        else{
            output = "There are no orders yet";
        }
        return output;
    }
}
