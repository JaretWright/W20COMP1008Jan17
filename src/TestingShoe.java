public class TestingShoe {
    public static void main(String[] args)
    {
        Shoe validShoe = new Shoe(79.99, "Vans", "hiking", 7);
        Shoe halfSize = new Shoe(79.99, "Vans", "hiking", 7.5);
        Shoe invalid = new Shoe(79.99, "Vans", "hiking", 7.3);


        System.out.println(validShoe);
        System.out.println(halfSize);
    }
}
