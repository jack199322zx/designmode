package facade;

/**
 * @author ss
 * @date 2018/8/13 17:02
 */
public class SleepAgainWorker extends WakeupWorker {

    @Override
    protected void sleep() {
        System.out.println("sleep in SleepAgainWorker");
    }
}
