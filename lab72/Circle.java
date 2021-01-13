package lab72;
//kawinthida kruythong 632115004
public class Circle {

    double radcir1 = 2.0;
    double radcir2 = 3.0;
    double radcir3 = 1.0;
    double radcir4 = -1.0;
    double area1=(Math.PI*Math.pow(radcir1, 2));
    double area2=(Math.PI*Math.pow(radcir2, 2));
    double area3=(Math.PI*Math.pow(radcir3, 2));
    double area4=0;
    double cir1=(Math.PI*radcir1*2);
    double cir2=(Math.PI*radcir2*2);
    double cir3=(Math.PI*radcir3*2);
    double cir4=0;

    public void areacir1(double radcir1) {
        System.out.println("Area of cir1 is "+area1);
        System.out.println("Circumferrence of cir1 is "+cir1);
    }

    public void areacir2(double radcir2) {
        System.out.println("Area of cir2 is "+area2);
        System.out.println("Circumferrence of cir2 is "+cir2);
    }
    public void areacir3(double radcir3) {
        System.out.println("Area of cir3 is "+area3);
        System.out.println("Circumferrence of cir3 is "+cir3);
    }
    public void areacir4(double radcir4) {
        System.out.println("Area of cir4 is "+area4);
        System.out.println("Circumferrence of cir4 is "+cir4);
    }
    public  void intersec13(){
        double m1 = 0.0;
        double b1 = 3.0;
        double m2 = 0.0;
        double b2 = 5.0;
        double r1 = 2.0;
        double r2 = 1.0;
        double area = (m1 - m2) * (m1 - m2) * (b1 - b2) * (b1 - b2);
        double line = (r1 + r2) * (r1 + r2);
        if (area <= line) {
            System.out.println("Is circle 1 intersec circle 3: False");

        } else {
            System.out.println("Is circle 1 intersec circle 3: True");
        }

    }

    public  void intersec12() {
        double m1 = 0.0;
        double b1 = 1.0;
        double m2 = 0.0;
        double b2 = 2.0;
        double r1 = 2.0;
        double r2 = 3.0;
        double area = (m1 - m2) * (m1 - m2) * (b1 - b2) * (b1 - b2);
        double line = (r1 + r2) * (r1 + r2);
        if (area <= line) {
            System.out.println("Is circle 1 intersec circle 2: True");

        } else {
            System.out.println("Is circle 1 intersec circle 2: False");
        }
    
    }
}
