package app;

/**
 * Created by Alexey on 09/24/2017.
 */
public class HomeTask04 {

    public int getMax(int a, int b){
        if(a > b){
            return a;
        }
        return b;
    }


    public float getMax(float a, float b){
        if(a > b){
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        HomeTask04 homeTask04 = new HomeTask04();
        System.out.println(homeTask04.getMax(8, 9));
        System.out.println(homeTask04.getMax(8.1f, 7.1f));
    }

}
