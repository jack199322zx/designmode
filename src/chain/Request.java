package chain;

/**
 * @author ss
 * @date 2018/8/13 13:46
 */
public class Request {

    private RequestType requestType;
    private boolean handled;

    public Request(final RequestType requestType,final boolean handled) {
        this.requestType = requestType;
        this.handled = handled;
    }

    public boolean getMarked() {
        return handled;
    }

    public void mark() {
        this.handled = true;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public enum RequestType {
        COOKIE, SESSION, AJAX
    }
}
