package Server.model.DB;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Film", schema = "dbo", catalog = "ProjectMusicFilm")
public class FilmEntity {
    private long id;
    private String filmName;
    private String country;
    private Long directorId;
    private Integer yearReleased;
    private String uploadSource;
    private String img;
    private Boolean active;
    private Timestamp createDate;
    private Integer length;
    private String info;
    private Long actorId;
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
    @Column(name = "filmName", nullable = true, length = 250)
    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    @Basic
    @Column(name = "country", nullable = true, length = 250)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "directorId", nullable = true)
    public Long getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Long directorId) {
        this.directorId = directorId;
    }

    @Basic
    @Column(name = "yearReleased", nullable = true)
    public Integer getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(Integer yearReleased) {
        this.yearReleased = yearReleased;
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
    @Column(name = "active", nullable = true)
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
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
    @Column(name = "length", nullable = true)
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Basic
    @Column(name = "info", nullable = true, length = -1)
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Basic
    @Column(name = "actorId", nullable = true)
    public Long getActorId() {
        return actorId;
    }

    public void setActorId(Long actorId) {
        this.actorId = actorId;
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
        FilmEntity that = (FilmEntity) o;
        return id == that.id &&
                Objects.equals(filmName, that.filmName) &&
                Objects.equals(country, that.country) &&
                Objects.equals(directorId, that.directorId) &&
                Objects.equals(yearReleased, that.yearReleased) &&
                Objects.equals(uploadSource, that.uploadSource) &&
                Objects.equals(img, that.img) &&
                Objects.equals(active, that.active) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(length, that.length) &&
                Objects.equals(info, that.info) &&
                Objects.equals(actorId, that.actorId) &&
                Objects.equals(index, that.index) &&
                Objects.equals(range, that.range);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, filmName, country, directorId, yearReleased, uploadSource, img, active, createDate, length, info, actorId, index, range);
    }
}
