 public class Time {
    public static void main(String[] args) {
        Time1 t1 = new Time1(2.0,3.0);
        Time1 t2 = new Time1();
        System.out.println();

        t2.add(t1.h,t2.h,t1.m,t2.m);
    
    }
    
 }
 class Time1 {

    double h,m;
    Time1(){

        h=00;
        m=00;
    }
    Time1(double hr,double min){

        h=hr;
        m=min;


    }
    void add(double t1h, double t2h,double t1m,double t2m){

        double hours = t1h+t2h;
        double minutes = t1m+t2m;

        while (minutes>60) {
            hours=hours++;
            minutes=minutes-60;
            
        }
        System.out.println(hours);
        System.out.println(minutes);

    }
    
}
 