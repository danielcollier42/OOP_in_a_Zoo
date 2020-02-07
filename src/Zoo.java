public class Zoo {

    String favoriteFood = "bacon";

    public static void main(String[] args){
        Zoo z = new Zoo();

    }

    public void sleep(String name){
        System.out.println(name + " sleeps for 8 hours");
    }
    public void eat(String name, String food){
        System.out.println(name + " eats " + food);
        if(food == favoriteFood){
            System.out.println("YUM!!! " + name + " wants more " + food);
        } else {
            sleep(name);
        }
    }
}
