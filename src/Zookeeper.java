public class Zookeeper {
    private String name;

    public Zookeeper(String name){
        this.name = name;
    }

    public void feed(Animal[] animals, String food){
        System.out.println(this.name + " the zookeeper is feeding " + food + " to " + animals.length + " of " + Animal.animalPopulation + " animals.");
        for(int i = 0; i < animals.length; i++){
            animals[i].eat(food);
        }
    }
}
