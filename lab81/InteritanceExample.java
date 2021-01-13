package lab81;

public class InteritanceExample {
    //kawinthida kruythong 632115004
    public static void main(String[] args) {
        Artist art = new Artist("Ball",20,"Male");
        art.genre="hip hop";
        art.introduce();
        art.playMusic();
        Artist en = new Artist("Kim Seok Woo", 24, "Male");
        en.genre="computer";
        en.introduce();
        en.computer();
        Artist doc = new Artist("Lee Dong Wook", 39, "Male");
        doc.genre="emergency";
        doc.introduce();
        doc.emergency();
        Artist law = new Artist("Lee Jong Suk", 31, "Male");
        law.genre="judge";
        law.introduce();
        law.judge();
        Artist nus = new Artist("Moon Ga Yong", 24, "Female");
        nus.genre="pediatric";
        nus.introduce();
        nus.pediatric();
        Artist phar = new Artist("Kim Seon Ho", 24, "Male");
        phar.genre="industry";
        phar.introduce();
        phar.industry();
        Artist ac = new Artist("Lee Jae Wook", 22, "Male");
        ac.genre="finance";
        ac.introduce();
        ac.finance();
    }
}
