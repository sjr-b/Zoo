public class Zookeeper {

    String name;

    public Zookeeper (String name){
        this.name = name;
    }

    public void feedAnimals(Animal[] animals, String food){
        System.out.println(this.name + " is feeding " + food + " to " + animals.length + " of " + Animal.population + " animals");
        for (int a = 0; a < animals.length; a++){
            animals[a].eat(food);
        }
    }

}
