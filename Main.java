package popcorn;

public class Main {
    public static void main(String[] awgs){
        MasterList popcorn2023 = new MasterList();
        String[] varieties2023 = {"Jalapeno Cheese", "Butter Microwave", "Butter Microwave",
        "Caramel with Sea Salt", "Caramel with Sea Salt", "Kettle Corn"};
        int[] num2023 = {1, 3, 2, 2, 5, 4};

        for(int i = 0; i < num2023.length; i++){
            PopcornOrder newOrder = new PopcornOrder(varieties2023[i], num2023[i]);
            popcorn2023.addOrder(newOrder);
        }

        System.out.println(popcorn2023.toString());
        System.out.println(popcorn2023.getTotalOrders());
        System.out.println(popcorn2023.removeVariety("Butter Microwave"));
        System.out.println(popcorn2023.removeVariety("Sea Salt Splash"));
        System.out.println(popcorn2023.removeVariety("Kettle Corn"));
        System.out.println(popcorn2023.toString());

        MasterList popcorn2024 = new MasterList();
        System.out.println(popcorn2024.getTotalOrders());
        String[] varieties2024 = {"Butter Microwave", "Sea Salt Splash", "Kettle Corn"};
        for (String variety : varieties2024) {
            System.out.println(popcorn2024.removeVariety(variety));
        }
        System.out.println(popcorn2024.toString());

    }
}
