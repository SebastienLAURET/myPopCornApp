
package slb.popcornsdk.data.showdetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images {

    @SerializedName("poster")
    @Expose
    private String poster;
    @SerializedName("fanart")
    @Expose
    private String fanart;
    @SerializedName("banner")
    @Expose
    private String banner;

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getFanart() {
        return fanart;
    }

    public void setFanart(String fanart) {
        this.fanart = fanart;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

}
