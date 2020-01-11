package Server.model.DB;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Album", schema = "dbo", catalog = "ProjectMusicFilm")
public class AlbumEntity {
    private long id;
    private String albumName;
    private String listSongId;
    private Timestamp dateReleased;
    private Integer index;
    private Integer range;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "albumName", nullable = true, length = 250)
    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    @Basic
    @Column(name = "listSongId", nullable = true, length = -1)
    public String getListSongId() {
        return listSongId;
    }

    public void setListSongId(String listSongId) {
        this.listSongId = listSongId;
    }

    @Basic
    @Column(name = "dateReleased", nullable = true)
    public Timestamp getDateReleased() {
        return dateReleased;
    }

    public void setDateReleased(Timestamp dateReleased) {
        this.dateReleased = dateReleased;
    }

    @Basic
    @Column(name = "index", nullable = true)
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Basic
    @Column(name = "range", nullable = true)
    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumEntity that = (AlbumEntity) o;
        return id == that.id &&
                Objects.equals(albumName, that.albumName) &&
                Objects.equals(listSongId, that.listSongId) &&
                Objects.equals(dateReleased, that.dateReleased) &&
                Objects.equals(index, that.index) &&
                Objects.equals(range, that.range);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, albumName, listSongId, dateReleased, index, range);
    }
}
