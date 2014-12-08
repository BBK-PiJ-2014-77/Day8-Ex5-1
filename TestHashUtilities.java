import java.util.Scanner;

/**
 * Created by ubcg49ac on 08/12/2014.
 */
public class TestHashUtilities {

    public static void main (String[] args){
        System.out.println("Give me a string and I will calculate its hash code");
        Scanner line = new Scanner(System.in);
        String str = line.nextLine();
        int hash = str.hashCode();
        int smallHash = HashUtilities.shortHash(hash);
        System.out.println("0 < " + smallHash + " < 1000");

    }

}
