package eagle.send;

import eagle.core.TraceContainer;
import java.util.List;

/**
 * @author: harry.chen
 * @since: 14-6-23 下午3:27
 */
public class ToServer extends TraceContainer {

    private static final int traceNoPer = 100;

    // start thread to send traces to server
    static class Send extends Thread {
        @Override
        public void run() {
            List list = getTraces(traceNoPer);
            // list to json, call http module
        }
    }

    static {
        new Send().start();
    }
}
