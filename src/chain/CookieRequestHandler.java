package chain;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author ss
 * @date 2018/8/13 13:58
 */
public class CookieRequestHandler extends RequestHandler{

    public CookieRequestHandler(RequestHandler chain) {
        super(chain);
    }

    @Override
    protected void handlerRequest(Request request) {
        beforeHandler();
        if (request.getMarked()) return;
        if (request.getRequestType() == Request.RequestType.COOKIE) request.mark();
        super.handlerRequest(request);
        afterHandler();
    }
}
