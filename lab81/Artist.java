package lab81;
public class Artist extends Person {
    String genre;
    public Artist(String name,int age,String gender){
        this.age=age;
        this.name=name;
        this.gender=gender;
    }
    public void playMusic(){
        System.out.println(name+" is playing "+genre+" music.");
        System.out.println("--------------------------------");
    }
    public void Engineer(String name, int age, String gender) {
        this.age=age;
        this.name=name;
        this.gender=gender;
    }
    public void computer(){
        System.out.println(name+" is "+genre+" engineer.");
        System.out.println("--------------------------------");
    }
    public void Doctor(String name, int age, String gender) {
        this.age=age;
        this.name=name;
        this.gender=gender;
    }
    public void emergency(){
        System.out.println(name+" is  "+genre+" doctor.");
        System.out.println("--------------------------------");
    }
    public void Lawyer(String name, int age, String gender) {
        this.age=age;
        this.name=name;
        this.gender=gender;
    }
    public void judge(){
        System.out.println(name+" is  "+genre+" lawyer.");
        System.out.println("--------------------------------");
    }
    public void Nurse(String name, int age, String gender) {
        this.age=age;
        this.name=name;
        this.gender=gender;
    }
    public void pediatric(){
        System.out.println(name+" is "+genre+" nurse.");
        System.out.println("--------------------------------");
    }
    public void Pharmacy(String name, int age, String gender) {
        this.age=age;
        this.name=name;
        this.gender=gender;
    }
    public void industry(){
        System.out.println(name+" is "+genre+" pharmacy.");
        System.out.println("--------------------------------");
    }
    public  void Accountant(String name, int age, String gender) {
        this.age=age;
        this.name=name;
        this.gender=gender;
    }
    public void finance(){
        System.out.println(name+" is "+genre+" accountant.");
        System.out.println("--------------------------------");
    }
   }