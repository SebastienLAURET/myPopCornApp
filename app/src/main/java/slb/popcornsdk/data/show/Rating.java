
package slb.popcornsdk.data.show;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rating {

    @SerializedName("percentage")
    @Expose
    private Integer percentage;
    @SerializedName("watching")
    @Expose
    private Integer watching;
    @SerializedName("votes")
    @Expose
    private Integer votes;
    @SerializedName("loved")
    @Expose
    private Integer loved;
    @SerializedName("hated")
    @Expose
    private Integer hated;

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public Integer getWatching() {
        return watching;
    }

    public void setWatching(Integer watching) {
        this.watching = watching;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    public Integer getLoved() {
        return loved;
    }

    public void setLoved(Integer loved) {
        this.loved = loved;
    }

    public Integer getHated() {
        return hated;
    }

    public void setHated(Integer hated) {
        this.hated = hated;
    }

}
