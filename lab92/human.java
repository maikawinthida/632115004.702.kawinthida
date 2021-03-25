public class human {
    public void hit(animal animal) {
        System.out.println(animal.roar());   
    }
    public static void main(String[] args) {
        animal dog = new dog();
        animal cat = new cat();
        human human = new human();
        animal fish = new fish();
        System.out.println("The first calling hit(dog)");
        human.hit(dog);


        System.out.println("The second calling hit(cat)");
        human.hit(cat);

        System.out.println("The third calling hit(fish)");
        human.hit(fish);
    }
}
