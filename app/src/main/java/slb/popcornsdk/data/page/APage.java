package slb.popcornsdk.data.page;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by snrla on 02/07/2017.
 */

public abstract class APage {
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("imdb_id")
    @Expose
    private String imdbId;
    @SerializedName("tvdb_id")
    @Expose
    private String tvdbId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("images")
    @Expose
    private Images images;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getTvdbId() {
        return tvdbId;
    }

    public void setTvdbId(String tvdbId) {
        this.tvdbId = tvdbId;
    }

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

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

}
