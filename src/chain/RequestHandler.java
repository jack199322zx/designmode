package chain;

/**
 * @author ss
 * @date 2018/8/13 13:54
 */
public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    protected void beforeHandler() {
        System.out.println("beforeHandler in " + this.getClass().getName());
    }

    protected void afterHandler() {
        System.out.println("afterHandler in " + this.getClass().getName());
    }

    protected void handlerRequest(Request request) {
        if (next != null)
            next.handlerRequest(request);
    }

}
