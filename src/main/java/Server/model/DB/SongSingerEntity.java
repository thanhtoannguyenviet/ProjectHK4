package Server.model.DB;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Song_Singer", schema = "dbo", catalog = "ProjectMusicFilm")
public class SongSingerEntity {
    private long id;
    private Long idSong;
    private Long idSinger;

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
    @Column(name = "idSong", nullable = true)
    public Long getIdSong() {
        return idSong;
    }

    public void setIdSong(Long idSong) {
        this.idSong = idSong;
    }

    @Basic
    @Column(name = "idSinger", nullable = true)
    public Long getIdSinger() {
        return idSinger;
    }

    public void setIdSinger(Long idSinger) {
        this.idSinger = idSinger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SongSingerEntity that = (SongSingerEntity) o;
        return id == that.id &&
                Objects.equals(idSong, that.idSong) &&
                Objects.equals(idSinger, that.idSinger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idSong, idSinger);
    }
}
