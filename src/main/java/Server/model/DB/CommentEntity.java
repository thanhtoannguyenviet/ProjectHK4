package Server.model.DB;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Comment", schema = "dbo", catalog = "ProjectMusicFilm")
public class CommentEntity {
    private long id;
    private String content;
    private Timestamp commentDate;
    private String model;
    private Long entryId;
    private String userNameComment;

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
    @Column(name = "content", nullable = true, length = 500)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "commentDate", nullable = true)
    public Timestamp getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Timestamp commentDate) {
        this.commentDate = commentDate;
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
    @Column(name = "entryId", nullable = true)
    public Long getEntryId() {
        return entryId;
    }

    public void setEntryId(Long entryId) {
        this.entryId = entryId;
    }

    @Basic
    @Column(name = "userNameComment", nullable = true, length = 250)
    public String getUserNameComment() {
        return userNameComment;
    }

    public void setUserNameComment(String userNameComment) {
        this.userNameComment = userNameComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentEntity that = (CommentEntity) o;
        return id == that.id &&
                Objects.equals(content, that.content) &&
                Objects.equals(commentDate, that.commentDate) &&
                Objects.equals(model, that.model) &&
                Objects.equals(entryId, that.entryId) &&
                Objects.equals(userNameComment, that.userNameComment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, commentDate, model, entryId, userNameComment);
    }
}
