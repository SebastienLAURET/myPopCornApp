package slb.popcornsdk.requesthandler;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import slb.popcornsdk.requestbuilder.ARequestBuilder;

/**
 * Created by lauret_s on 29/06/2017.
 */

public/* abstract */class ARequestHandle {
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

    public ArrayList<String> getNamePagesBase(ARequestBuilder request) {
        String tmpJson = makeRequest(request.getNamePages());
        Type listType = new TypeToken<ArrayList<String>>(){}.getType();
        ArrayList<String> result = new Gson().fromJson(tmpJson, listType);
        return result;
    }
    public String getPageBase(ARequestBuilder request, String idPage) {
        String tmpJson = makeRequest(request.getPage(idPage));
        return tmpJson;
    }
    public String getDetailBase(ARequestBuilder request, String idImdb) {
        String tmpJson = makeRequest(request.getDetails(idImdb));
        return tmpJson;
    }
}
