
package slb.popcornsdk.data.detail.movie;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import slb.popcornsdk.data.detail.ADetail;

public class Movie extends ADetail{


    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("synopsis")
    @Expose
    private String synopsis;
    @SerializedName("runtime")
    @Expose
    private String runtime;
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
    @SerializedName("genres")
    @Expose
    private List<String> genres = null;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("rating")
    @Expose
    private Rating rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

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

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

}
