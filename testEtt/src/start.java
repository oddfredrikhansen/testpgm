import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by fredrik on 2016-05-30.
 */
public class start {
    static void m(int[] z, int[] w) {
        //    (a)
        z[0] = 17;
        //    (b)
        z=w;
        //    (c)

        //m(x, y); // (e)
        //System.out.println("d y:"+y[0]+" x:"+x[0]);

    }
    public static List<Integer> getNeighbours(){
        List<Integer> ll = new ArrayList<Integer>();
        return ll;
    }
    public static void main(String[] args){
        int[] z={1,1,1};
        int[] w = {1,1,1};

        int[] x = new int [] {1,2,3};
        int[] y = new int [] {4,5,6,7}; // (d)

        m(z,w);
        System.out.println("d y:"+y[0]+" x:"+x[0]);
        List<Integer> l = new ArrayList<Integer>();
        l = getNeighbours();

        String s1="w";
        String s2="w";
        if(s1 == s2){log("= "+s1+" "+s2);}

        if(s1.equals(s2)){
            log("e "+s1+" "+s2);
        }
    }
    public static void log(String str){System.out.println(" "+str); }
}
