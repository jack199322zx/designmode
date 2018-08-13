package facade;

/**
 * @author ss
 * @date 2018/8/13 16:40
 */
public abstract class WakeupWorker {

    private void switchWork(WakeupWorkerType type) {
        switch (type) {
            case SLEEP:
                sleep();
                break;
            case WAKEUP:
                wakeup();
                break;
            case STRETCH:
                stretch();
        }
    }

    public void action(WakeupWorkerType... types) {
        for (WakeupWorkerType workerType: types) {
            switchWork(workerType);
        }
    }

    protected void sleep() {
        System.out.println("sleep in WakeupWorker");
    }

    protected void stretch() {
        System.out.println("stretch in WakeupWorker");
    }

    protected void wakeup() {
        System.out.println("wakeup in WakeupWorker");
    }

    public enum WakeupWorkerType {
        SLEEP, STRETCH, WAKEUP
    }

}
