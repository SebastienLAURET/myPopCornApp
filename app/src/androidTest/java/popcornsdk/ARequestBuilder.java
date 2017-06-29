package popcornsdk;

/**
 * Created by lauret_s on 29/06/2017.
 */

public abstract class ARequestBuilder {
    protected String _host = "https://tv-v2.api-fetch.website";
    protected String _path;

    public String getNamePages() {
        return _host + _path;
    }
    public String
}
