
package slb.popcornsdk.data.detail.showdetail;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import slb.popcornsdk.data.detail.ADetail;

public class ShowDetail extends ADetail {

    @SerializedName("tvdb_id")
    @Expose
    private String tvdbId;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("network")
    @Expose
    private String network;
    @SerializedName("air_day")
    @Expose
    private String airDay;
    @SerializedName("air_time")
    @Expose
    private String airTime;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("num_seasons")
    @Expose
    private Integer numSeasons;
/*    @SerializedName("last_updated")
    @Expose
    private Integer lastUpdated;
    @SerializedName("__v")
    @Expose
    private Integer v;
*/    @SerializedName("episodes")
    @Expose
    private List<Episode> episodes = null;




    public String getTvdbId() {
        return tvdbId;
    }

    public void setTvdbId(String tvdbId) {
        this.tvdbId = tvdbId;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getAirDay() {
        return airDay;
    }

    public void setAirDay(String airDay) {
        this.airDay = airDay;
    }

    public String getAirTime() {
        return airTime;
    }

    public void setAirTime(String airTime) {
        this.airTime = airTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getNumSeasons() {
        return numSeasons;
    }

    public void setNumSeasons(Integer numSeasons) {
        this.numSeasons = numSeasons;
    }

/*    public Integer getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Integer lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }
*/
    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }



}
