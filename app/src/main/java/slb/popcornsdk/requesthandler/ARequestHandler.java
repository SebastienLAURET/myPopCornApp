package slb.popcornsdk.requesthandler;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 * Created by lauret_s on 29/06/2017.
 */

public abstract class ARequestHandler {
    public String makeRequest(String request) {
        try {
            URL url = new URL(request);
            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.setRequestMethod("GET");
            int statusCode = urlConnection.getResponseCode();
            if (statusCode ==  200) {
                InputStream it = new BufferedInputStream(urlConnection.getInputStream());
                InputStreamReader read = new InputStreamReader(it);
                BufferedReader buff = new BufferedReader(read);
                StringBuilder dta = new StringBuilder();
                String chunks ;
                while((chunks = buff.readLine()) != null)
                {
                    dta.append(chunks);
                }
                return dta.toString();
            }
            else
            {
                return "Error";
                            //Handle else
            }
        } catch (MalformedURLException e){
           // System.out(e.getMessage());
        } catch (ProtocolException e) {
            //System.out(e.getMessage());
        } catch (IOException e) {
            //System.out(e.getMessage());
        }
        return "Error";
    }
}
