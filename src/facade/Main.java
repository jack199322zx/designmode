package facade;

/**
 * @author ss
 * @date 2018/8/13 17:30
 */
public class Main {

    public static void main(String[] args) {
        WakeupFacade wakeupFacade = new WakeupFacade();
        wakeupFacade.startNewDay();
        wakeupFacade.startLazyDay();
    }
}
