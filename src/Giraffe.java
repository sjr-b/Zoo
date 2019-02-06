public class Giraffe extends Animal {

    public Giraffe(String name){
        super(name, "leaves");
    }

    public void  eat(String food){
        System.out.println(this.name + " eats " + food);
        if (food == favoriteFood){
            System.out.println("YUM!!! " + this.name + " wants more leaves");
            sleep();
        } else {
            System.out.println("YUCK!! " + this.name + " will not eat " + food);
        }
    }

}
