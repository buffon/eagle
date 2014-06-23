package eagle;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
//        Map<String, String> map = new HashMap<String, String>(2);
//
//        map.put("1","1");
//        map.put("2","2");
//        map.put("3","3");
//
//        System.out.println(map.size());

        BlockingQueue queue = new ArrayBlockingQueue(1);

        queue.put("1");
        queue.put("2");
        queue.put("3");

       // queue.
    }
}
