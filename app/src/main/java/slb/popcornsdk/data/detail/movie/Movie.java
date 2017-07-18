
package slb.popcornsdk.data.detail.movie;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import slb.popcornsdk.data.detail.ADetail;
import slb.popcornsdk.data.detail.Images;
import slb.popcornsdk.data.detail.Rating;

public class Movie extends ADetail{

    @SerializedName("released")
    @Expose
    private Integer released;
    @SerializedName("trailer")
    @Expose
    private String trailer;
    @SerializedName("certification")
    @Expose
    private String certification;
    @SerializedName("torrents")
    @Expose
    private Torrents torrents;


    public Integer getReleased() {
        return released;
    }

    public void setReleased(Integer released) {
        this.released = released;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public Torrents getTorrents() {
        return torrents;
    }

    public void setTorrents(Torrents torrents) {
        this.torrents = torrents;
    }

}
