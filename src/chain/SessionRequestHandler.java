package chain;

/**
 * @author ss
 * @date 2018/8/13 13:58
 */
public class SessionRequestHandler extends RequestHandler{

    public SessionRequestHandler(RequestHandler chain) {
        super(chain);
    }
    @Override
    protected void handlerRequest(Request request) {
        if (request.getMarked()) return;
        beforeHandler();
        if (request.getRequestType() == Request.RequestType.SESSION) request.mark();
        super.handlerRequest(request);
        afterHandler();
    }
}
