public class Animal {

    String name;
    String favoriteFood;

    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    public void sleep(){
        System.out.println(this.name + " sleeps for 8 hours");
    }

    public void  eat(String food){
        System.out.println(this.name + " eats " + food);
        if (food == favoriteFood){
            System.out.println("YUM!!! " + this.name + " wants more " + food);
        } else {
            sleep();
        }
    }

}
