package chain;

/**
 * @author ss
 * @date 2018/8/13 14:09
 */
public class Main {

    public static void main(String[] args) {
        Request request = new Request(Request.RequestType.AJAX, false);
        RequestHandler requestHandler = new CookieRequestHandler(new SessionRequestHandler(new AjaxRequestHandler(new CookieRequestHandler(null))));
        requestHandler.handlerRequest(request);
//        request = new Request(Request.RequestType.SESSION, false);
//        requestHandler.handlerRequest(request);
    }
}
