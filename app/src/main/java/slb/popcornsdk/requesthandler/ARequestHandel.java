package slb.popcornsdk.requesthandler;

import java.util.concurrent.ExecutionException;

/**
 * Created by lauret_s on 29/06/2017.
 */

public abstract class ARequestHandel {
    public String makeRequest(String urlRequest) {
        AsyncGETRequest requestGET = new AsyncGETRequest();
        requestGET.execute(urlRequest);
        String result = null;
        try {
                result = requestGET.get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void getNumberPage() {
        
    }
}
