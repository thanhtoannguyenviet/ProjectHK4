package Server.model.DB;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Album_CategoryMusic", schema = "dbo", catalog = "ProjectMusicFilm")
public class AlbumCategoryMusicEntity {
    private long id;
    private Long albumId;
    private Long catagoryId;

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
    @Column(name = "albumId", nullable = true)
    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    @Basic
    @Column(name = "catagoryId", nullable = true)
    public Long getCatagoryId() {
        return catagoryId;
    }

    public void setCatagoryId(Long catagoryId) {
        this.catagoryId = catagoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumCategoryMusicEntity that = (AlbumCategoryMusicEntity) o;
        return id == that.id &&
                Objects.equals(albumId, that.albumId) &&
                Objects.equals(catagoryId, that.catagoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, albumId, catagoryId);
    }
}
