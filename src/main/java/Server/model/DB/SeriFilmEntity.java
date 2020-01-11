package Server.model.DB;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SeriFilm", schema = "dbo", catalog = "ProjectMusicFilm")
public class SeriFilmEntity {
    private long id;
    private String listFilm;
    private String ext;
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
    @Column(name = "listFilm", nullable = true, length = -1)
    public String getListFilm() {
        return listFilm;
    }

    public void setListFilm(String listFilm) {
        this.listFilm = listFilm;
    }

    @Basic
    @Column(name = "ext", nullable = true, length = -1)
    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
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
        SeriFilmEntity that = (SeriFilmEntity) o;
        return id == that.id &&
                Objects.equals(listFilm, that.listFilm) &&
                Objects.equals(ext, that.ext) &&
                Objects.equals(index, that.index) &&
                Objects.equals(range, that.range);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, listFilm, ext, index, range);
    }
}
