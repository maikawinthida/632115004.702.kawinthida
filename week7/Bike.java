package week7;

public class Bike {
    String type;
    int currentspeed;
    int NormalspeedUp;
    int NormalBreak;
    int mountainSpeedup;
    int mountainBreak=15;
    int NormalspeedUpII;
    int mountainSpeedupII=20;
	public  Bike(String type,int currentspeed,int NormalspeedUp,int NormalBreak) {
        this.type=type;
        this.currentspeed=currentspeed;
        this.NormalspeedUpII=currentspeed+NormalspeedUp;
        this.NormalBreak=NormalspeedUpII-NormalBreak;
    }
    public void normal(){
        System.out.println("Type of bicycle is "+type+" Bicycle");
        System.out.println("The Current speed> "+currentspeed+" km/hr.");
        System.out.println("The speed up is> "+NormalspeedUpII+" km/hr.");
        System.out.println("Then break,The speed is> "+NormalBreak+" km/hr.");
        System.out.println("-------------------------------------------");
    }
    public void MountainBike(String type,int currentspeed,int MountainSpeedup,int MountainBreak) {
        this.type=type;
        this.currentspeed=currentspeed;
        this.mountainSpeedupII = currentspeed * MountainSpeedup;
        this.mountainBreak = mountainSpeedupII- MountainBreak;
    }
    public void mountain(){
        System.out.println("Type of bicycle is "+type+" Bicycle");
        System.out.println("The Current speed> "+currentspeed+" km/hr.");
        System.out.println("The speed up is> "+mountainSpeedupII+" km/hr.");
        System.out.println("Then break,The speed is> "+mountainBreak+" km/hr.");
    }
}