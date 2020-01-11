package Server.model.DB;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Rating", schema = "dbo", catalog = "ProjectMusicFilm")
public class RatingEntity {
    private long id;
    private String model;
    private Integer point;
    private Integer voteLike;
    private Integer voteDislike;
    private Long entryId;

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
    @Column(name = "model", nullable = true, length = 250)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "point", nullable = true)
    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    @Basic
    @Column(name = "voteLike", nullable = true)
    public Integer getVoteLike() {
        return voteLike;
    }

    public void setVoteLike(Integer voteLike) {
        this.voteLike = voteLike;
    }

    @Basic
    @Column(name = "voteDislike", nullable = true)
    public Integer getVoteDislike() {
        return voteDislike;
    }

    public void setVoteDislike(Integer voteDislike) {
        this.voteDislike = voteDislike;
    }

    @Basic
    @Column(name = "entryId", nullable = true)
    public Long getEntryId() {
        return entryId;
    }

    public void setEntryId(Long entryId) {
        this.entryId = entryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RatingEntity that = (RatingEntity) o;
        return id == that.id &&
                Objects.equals(model, that.model) &&
                Objects.equals(point, that.point) &&
                Objects.equals(voteLike, that.voteLike) &&
                Objects.equals(voteDislike, that.voteDislike) &&
                Objects.equals(entryId, that.entryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, point, voteLike, voteDislike, entryId);
    }
}
