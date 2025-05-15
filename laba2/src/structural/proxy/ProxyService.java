package structural.proxy;

class RealService implements Service {
    public void request() {
        System.out.println("Processing request in RealService");
    }
}

public class ProxyService implements Service {
    private RealService realService;

    public void request() {
        if (realService == null) {
            realService = new RealService();
        }
        System.out.println("Proxy handling request");
        realService.request();
    }
}
