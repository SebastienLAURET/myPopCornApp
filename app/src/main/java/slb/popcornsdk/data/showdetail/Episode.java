
package slb.popcornsdk.data.showdetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Episode {

    @SerializedName("torrents")
    @Expose
    private Torrents torrents;
    @SerializedName("watched")
    @Expose
    private Watched watched;
    @SerializedName("first_aired")
    @Expose
    private Integer firstAired;
    @SerializedName("date_based")
    @Expose
    private Boolean dateBased;
    @SerializedName("overview")
    @Expose
    private String overview;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("episode")
    @Expose
    private Integer episode;
    @SerializedName("season")
    @Expose
    private Integer season;
    @SerializedName("tvdb_id")
    @Expose
    private Integer tvdbId;

    public Torrents getTorrents() {
        return torrents;
    }

    public void setTorrents(Torrents torrents) {
        this.torrents = torrents;
    }

    public Watched getWatched() {
        return watched;
    }

    public void setWatched(Watched watched) {
        this.watched = watched;
    }

    public Integer getFirstAired() {
        return firstAired;
    }

    public void setFirstAired(Integer firstAired) {
        this.firstAired = firstAired;
    }

    public Boolean getDateBased() {
        return dateBased;
    }

    public void setDateBased(Boolean dateBased) {
        this.dateBased = dateBased;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getEpisode() {
        return episode;
    }

    public void setEpisode(Integer episode) {
        this.episode = episode;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Integer getTvdbId() {
        return tvdbId;
    }

    public void setTvdbId(Integer tvdbId) {
        this.tvdbId = tvdbId;
    }

}
