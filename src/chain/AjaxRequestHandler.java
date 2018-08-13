package chain;

/**
 * @author ss
 * @date 2018/8/13 13:58
 */
public class AjaxRequestHandler extends RequestHandler{

    public AjaxRequestHandler(RequestHandler chain) {
        super(chain);
    }

    @Override
    protected void handlerRequest(Request request) {
        beforeHandler();
        if (request.getMarked()) return;
        if (request.getRequestType() == Request.RequestType.AJAX) request.mark();
        super.handlerRequest(request);
        afterHandler();
    }
}
