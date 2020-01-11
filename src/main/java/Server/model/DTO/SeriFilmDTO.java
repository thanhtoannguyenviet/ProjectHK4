package Server.model.DTO;

import Server.model.DB.SeriFilmEntity;

import java.util.List;

public class SeriFilmDTO {
   private SeriFilmEntity seriFilmEntity;
   private List<FilmDTO> filmDTOList;
    public SeriFilmDTO(){}

    public SeriFilmDTO(SeriFilmEntity seriFilmEntity, List<FilmDTO> filmDTOList) {
        this.seriFilmEntity = seriFilmEntity;
        this.filmDTOList = filmDTOList;
    }

    public SeriFilmEntity getSeriFilmEntity() {
        return seriFilmEntity;
    }

    public void setSeriFilmEntity(SeriFilmEntity seriFilmEntity) {
        this.seriFilmEntity = seriFilmEntity;
    }

    public List<FilmDTO> getFilmDTOList() {
        return filmDTOList;
    }

    public void setFilmDTOList(List<FilmDTO> filmDTOList) {
        this.filmDTOList = filmDTOList;
    }
}
