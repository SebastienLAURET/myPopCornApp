package slb.popcornsdk.Network.requesthandler;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import slb.popcornsdk.Network.AsyncGETRequest;
import slb.popcornsdk.data.page.APage;
import slb.popcornsdk.Network.requestbuilder.ARequestBuilder;

/**
 * Created by lauret_s on 29/06/2017.
 */

public abstract/* abstract */class ARequestHandle {
    private String makeRequest(String urlRequest) {
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

    public ArrayList<String> getNamePages(ARequestBuilder request) {
        String tmpJson = makeRequest(request.getNamePages());
        Type listType = new TypeToken<ArrayList<String>>(){}.getType();
        ArrayList<String> result = new Gson().fromJson(tmpJson, listType);
        return result;
    }
    public ArrayList<APage> getPage(ARequestBuilder request, String idPage, Type type) {
        String tmpJson = makeRequest(request.getPage(idPage));
        ArrayList<APage> res = new Gson().fromJson(tmpJson, type);
        return res;
    }
  /*  public APage getDetail(ARequestBuilder request, String idImdb, Type type) {
        String tmpJson = makeRequest(request.getDetails(idImdb));
        APage res = new Gson().fromJson(tmpJson, type);
        return res;
    }*/

    public abstract ArrayList<String> getNamePages();
}
