package Server.model.DTO;

import Server.model.DB.*;

import java.util.List;

public class SongDTO {
    private SongEntity songEntity;
    private AuthorEntity authorEntity;
    private ImageEntity imageEntity;
    private List<SingerEntity> singerEntityList;
    private List<UploadEntity> uploadEntityList;
    private List<CategorySongEntity> categorySongEntityList;
    private List<CommentEntity> commentEntityList;

}
