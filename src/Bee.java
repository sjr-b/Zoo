public class Bee extends Animal {

    public Bee(String name){
        super(name, "pollen");
    }

    public void sleep(){
        System.out.println(this.name + " never sleeps");
    }

    public void  eat(String food){
        if (food == favoriteFood){
            System.out.println(this.name + " ");
            System.out.println("YUM!!! " + this.name + " wants more pollen");
            sleep();
        } else {
            System.out.println("YUCK!! " + this.name + " will not eat " + food);
        }
    }

}
