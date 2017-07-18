
package slb.popcornsdk.data.detail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rating {

    @SerializedName("hated")
    @Expose
    private Integer hated;
    @SerializedName("loved")
    @Expose
    private Integer loved;
    @SerializedName("votes")
    @Expose
    private Integer votes;
    @SerializedName("watching")
    @Expose
    private Integer watching;
    @SerializedName("percentage")
    @Expose
    private Integer percentage;

    public Integer getHated() {
        return hated;
    }

    public void setHated(Integer hated) {
        this.hated = hated;
    }

    public Integer getLoved() {
        return loved;
    }

    public void setLoved(Integer loved) {
        this.loved = loved;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    public Integer getWatching() {
        return watching;
    }

    public void setWatching(Integer watching) {
        this.watching = watching;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

}
