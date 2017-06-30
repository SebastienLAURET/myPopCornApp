
package slb.popcornsdk.data.show;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class _0 {

    @SerializedName("provider")
    @Expose
    private String provider;
    @SerializedName("peers")
    @Expose
    private Integer peers;
    @SerializedName("seeds")
    @Expose
    private Integer seeds;
    @SerializedName("url")
    @Expose
    private String url;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Integer getPeers() {
        return peers;
    }

    public void setPeers(Integer peers) {
        this.peers = peers;
    }

    public Integer getSeeds() {
        return seeds;
    }

    public void setSeeds(Integer seeds) {
        this.seeds = seeds;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
