package facade;


import com.sun.istack.internal.NotNull;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ss
 * @date 2018/8/13 16:39
 */
public class WakeupFacade {

    private List<WakeupWorker> workers = new ArrayList<>();

    public WakeupFacade() {
        workers.add(new YawnWorker());
        workers.add(new StretchWorker());
        workers.add(new SleepAgainWorker());
    }

//    public WakeupFacade(@NotNull List<WakeupWorker> workers) {
//        WakeupWorker[] workerArray =  (WakeupWorker[])Array.newInstance(WakeupWorker.class, workers.size());
//        workerArray = workers.toArray(workerArray);
//        WakeupWorker[] newArray = Arrays.copyOf(workerArray, workers.size(), WakeupWorker[].class);
//        this.workers = Arrays.asList(newArray);
//    }

    public void startNewDay() {
        action(WakeupWorker.WakeupWorkerType.WAKEUP, WakeupWorker.WakeupWorkerType.STRETCH);
    }

    public void startLazyDay() {
        action(WakeupWorker.WakeupWorkerType.WAKEUP, WakeupWorker.WakeupWorkerType.SLEEP);
    }

    private void action(WakeupWorker.WakeupWorkerType... types) {
        for (WakeupWorker w: workers) {
            w.action(types);
        }
    }

//    public static void main(String[] args) {
//        YawnWorker worker = new YawnWorker();
//        WakeupFacade wakeupFacade = new WakeupFacade(Arrays.asList(worker));
//        worker.setWorkerTime(30);
//    }
}
