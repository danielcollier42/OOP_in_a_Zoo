public class Runner {
    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        Bear pooh = new Bear("Pooh");
        Unicorn rarity = new Unicorn("Rarity");
        Giraffe gemma  = new Giraffe("Gemma");
        Bee stinger = new Bee("Stinger");

        Animal[] animals = {tigger, pooh, rarity, gemma, stinger};

        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feed(animals,"almonds");
    }
}