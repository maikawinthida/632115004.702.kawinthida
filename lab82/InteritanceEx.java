package lab82;

public class InteritanceEx {
    //kawinthida kruythong 632115004
    public static void main(String[] args) {
        Animal dog = new Animal("","","","","Long","Small","Box Box!!","Dog","Lucky", "Poodle", "brown",2);
        dog.introduce();
        dog.run();
        dog.bark();
        dog.ShortHair();
        Animal fish = new Animal("","","Sea","Fast","","Small","Sea","Fish","nemo", "Clown fish", "Orange",1);
        fish.introduce();
        fish.IsSwimToSea();
        fish.SwimFast();
        Animal bird = new Animal("Thailand","can","","","","Small","","Parrot","pepo", "Parrot", "Green",1);
        bird.introduce();
        bird.Speak();
        bird.CheckCountry();
        bird.CanFly();
    }
}