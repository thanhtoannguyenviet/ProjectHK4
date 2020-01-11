package Server.model.DB;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Song", schema = "dbo", catalog = "ProjectMusicFilm")
public class SongEntity {
    private long id;
    private String songName;
    private long authorId;
    private Timestamp createDate;
    private String modifiedUser;
    private Timestamp modifiedDate;
    private Boolean active;
    private String uploadSource;
    private String img;
    private Long albumId;

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
    @Column(name = "songName", nullable = false, length = 250)
    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    @Basic
    @Column(name = "authorId", nullable = false)
    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    @Basic
    @Column(name = "createDate", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "modifiedUser", nullable = true, length = 250)
    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    @Basic
    @Column(name = "modifiedDate", nullable = true)
    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Basic
    @Column(name = "active", nullable = true)
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Basic
    @Column(name = "uploadSource", nullable = true, length = -1)
    public String getUploadSource() {
        return uploadSource;
    }

    public void setUploadSource(String uploadSource) {
        this.uploadSource = uploadSource;
    }

    @Basic
    @Column(name = "img", nullable = true, length = -1)
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Basic
    @Column(name = "albumId", nullable = true)
    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SongEntity that = (SongEntity) o;
        return id == that.id &&
                authorId == that.authorId &&
                Objects.equals(songName, that.songName) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(modifiedUser, that.modifiedUser) &&
                Objects.equals(modifiedDate, that.modifiedDate) &&
                Objects.equals(active, that.active) &&
                Objects.equals(uploadSource, that.uploadSource) &&
                Objects.equals(img, that.img) &&
                Objects.equals(albumId, that.albumId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, songName, authorId, createDate, modifiedUser, modifiedDate, active, uploadSource, img, albumId);
    }
}
