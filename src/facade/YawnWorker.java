package facade;

/**
 * @author ss
 * @date 2018/8/13 16:41
 */
public class YawnWorker extends WakeupWorker {

    private int workerTime = 60;

    public void setWorkerTime(int workerTime) {
        this.workerTime = workerTime;
    }

    public int getWorkerTime() {
        return this.workerTime;
    }

    @Override
    protected void wakeup() {
        System.out.println("wakeup in YawnWorker");
    }
}
