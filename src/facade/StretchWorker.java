package facade;

/**
 * @author ss
 * @date 2018/8/13 16:41
 */
public class StretchWorker extends WakeupWorker {

    @Override
    protected void stretch() {
        System.out.println("stretch in StretchWorker");
    }
}
