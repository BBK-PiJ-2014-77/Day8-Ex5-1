import java.util.IntSummaryStatistics;

/**
 * Created by ubcg49ac on 08/12/2014.
 */
public class HashUtilities {

    static int shortHash(int hash){
        int ShHa = Math.abs(hash%1000);
        return ShHa;
    }
}
