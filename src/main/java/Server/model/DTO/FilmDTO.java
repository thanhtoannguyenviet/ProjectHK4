package Server.model.DTO;

import Server.model.DB.*;

import java.util.List;

public class FilmDTO {
    private FilmEntity filmEntity;
    private DirectorEntity directorEntity;
    private List<ActorEntity> actorEntityList;
    private List<ImageEntity> imageEntity;
    private List<UploadEntity> uploadEntityList;
    private List<CategoryFilmEntity> categoryFilmEntityList;
    private SeriFilmEntity seriCategoryFilmEntity;
    private List<CommentEntity> commentEntityList;

}
