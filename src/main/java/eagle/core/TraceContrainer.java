package eagle.core;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author: harry.chen
 * @since: 14-6-23 下午3:06
 */
public class TraceContrainer {

    private static BlockingQueue<Trace> traces;
    private static final int mapSize = 10000;

    static {
        traces = new ArrayBlockingQueue<Trace>(mapSize);
    }

    // 如果BlockingQueue可以容纳,则返回true,否则返回false
    public static void putTrace(Trace trace) {
        traces.offer(trace);
    }

    // 若BlockingQueue为空,阻断进入等待状态直到Blocking有新的对象被加入为止
    public static Trace getTrace() {
        Trace trace = null;
        try {
            trace = traces.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return trace;
    }

    public static List<Trace> getTraces(int number) {
        List<Trace> list = new ArrayList<Trace>();
        for (int i = number; i > 0; i--) {
            list.add(getTrace());
        }
        return list;
    }

}
