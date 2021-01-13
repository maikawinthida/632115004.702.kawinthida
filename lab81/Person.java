package lab81;
public class Person{
    String name;
    int age;
    String gender;
    public Person(){

    }
    public Person(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void introduce(){
        System.out.println("my name is "+name);
        System.out.println(age+" years old");
        System.out.println("gender is "+gender);
        
    }
}