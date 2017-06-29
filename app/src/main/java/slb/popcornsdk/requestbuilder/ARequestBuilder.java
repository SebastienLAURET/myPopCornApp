package slb.popcornsdk.requestbuilder;

/**
 * Created by lauret_s on 29/06/2017.
 */

public abstract class ARequestBuilder {
    protected String _host = "https://tv-v2.api-fetch.website";
    protected String _path;

    public ARequestBuilder(String path) {
        _path = path;
    }

    public String getNamePages() {
        return _host + _path;
    }
    public String getPage(String idPage) {
        return _host + idPage;
    }
    public String getDetails(String idImdb) {
        return _host + _path + idImdb;
    }
}
