package Server.model.DB;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Seri_CategoryFilm", schema = "dbo", catalog = "ProjectMusicFilm")
public class SeriCategoryFilmEntity {
    private long id;
    private Long categoryId;
    private Long seriId;

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
    @Column(name = "categoryId", nullable = true)
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "seriId", nullable = true)
    public Long getSeriId() {
        return seriId;
    }

    public void setSeriId(Long seriId) {
        this.seriId = seriId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeriCategoryFilmEntity that = (SeriCategoryFilmEntity) o;
        return id == that.id &&
                Objects.equals(categoryId, that.categoryId) &&
                Objects.equals(seriId, that.seriId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoryId, seriId);
    }
}
