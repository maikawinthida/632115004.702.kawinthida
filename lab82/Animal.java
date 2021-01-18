package lab82;
public class Animal extends Intro {
    String size;
    String hair;
    String run;
    String bark;
    String water;
    String speed;
    String country;
    String fly;

    public Animal(String country,String fly,String water,String speed,String hair, String size, String bark, String type, String name, String species, String color,int age) {
        this.name=name;
        this.species=species;
        this.color=color;
        this.hair=hair;
        this.size=size;
        this.bark=bark;
        this.type=type;   
        this.age=age;   
        this.water=water;
        this.speed=speed;
        this.country=country;
        this.fly=fly;
    }
	public void run(){
        System.out.println("My "+type+" "+name+" is run to the jungle");
    }
    public void bark(){
        System.out.println(size+" bark "+bark);
    }
    public void ShortHair(){
        System.out.println(hair+" Hair: True");
    }

    public  void Fish(String country,String fly,String hair,String bark,String speed, String size, String water, String type, String name, String species, String color,int age) {
        this.name=name;
        this.species=species;
        this.color=color;
        this.speed=speed;
        this.size=size;
        this.water=water;
        this.type=type;   
        this.age=age;   
        this.country=country;
        this.fly=fly;
        this.bark=bark;
        this.hair=hair;
    }
    public void IsSwimToSea(){
        System.out.println("My "+size+" "+type+" "+name+" is swim to the "+water);
    }
    public void SwimFast(){
        System.out.println("Swim speed: "+speed);
    }
    public void bird (String water,String speed,String hair,String bark,String country, String size, String fly, String type, String name, String species, String color,int age) {
        this.name=name;
        this.species=species;
        this.color=color;
        this.country=country;
        this.size=size;
        this.fly=fly;
        this.type=type;   
        this.age=age;  
        this.water=water;
        this.speed=speed; 
        this.bark=bark;
        this.hair=hair;
    }
    public void Speak(){
        System.out.println("My "+size+" "+type+" "+name+" is said 'SAWASDEE'");
    }
    public void CheckCountry(){
        System.out.println(name+" is stay in "+country);
    }
    public void CanFly(){
        System.out.println(name+" Is "+fly+" fly");
    }
}