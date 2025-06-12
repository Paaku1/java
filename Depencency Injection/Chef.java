public class Chef {
    private Food food;;
    public Chef(Food food){
        this.food = food;
    }
    public static void main(String[] args) {
        Chef pizza = new Chef(new Pizza());
        pizza.setName("pizza");
        System.out.println(pizza.getName());

    }
}
