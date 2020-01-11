package Server.model.DTO;

import Server.model.DB.SingerEntity;

import java.util.List;

public class SingerDTO {
    private SingerEntity singerEntity;
    private List<SongDTO> songDTOList;
    public SingerDTO(){}
    public SingerDTO(SingerEntity singerEntity, List<SongDTO> songDTOList) {
        this.singerEntity = singerEntity;
        this.songDTOList = songDTOList;
    }

    public SingerEntity getSingerEntity() {
        return singerEntity;
    }

    public void setSingerEntity(SingerEntity singerEntity) {
        this.singerEntity = singerEntity;
    }

    public List<SongDTO> getSongDTOList() {
        return songDTOList;
    }

    public void setSongDTOList(List<SongDTO> songDTOList) {
        this.songDTOList = songDTOList;
    }
}
