
public class tabung {
    public static double phi=22.0/7;
    public static double r = 0.0, t = 0.0;
    public static double volume;
    public static double hitungVolume(){    
        volume = phi*r*r*t;
        return volume;
    }
    public static void displayVolume(){
        System.out.println("Volume: "+tabung.hitungVolume());
    }
}
