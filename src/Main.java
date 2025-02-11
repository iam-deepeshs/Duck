public class Main {
    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        RedHeadDuck rd = new RedHeadDuck();
        RubberDuck rb = new RubberDuck();
        System.out.println("_______________________");
        rb.display();
        rb.performQuack();
        rb.performSwim();
        System.out.println("_______________________");
        System.out.println("_______________________");
        rd.display();
        rd.performQuack();
        rd.performSwim();
        System.out.println("_______________________");
        System.out.println("_______________________");
        md.display();
        md.performQuack();
        md.performSwim();
        System.out.println("_______________________");
    }


}
