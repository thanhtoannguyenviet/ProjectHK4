package Server.model.DTO;

import Server.model.DB.AlbumEntity;
import Server.model.DB.ImageEntity;
import Server.model.DB.SingerEntity;

import java.util.List;

public class AlbumDTO {
    private AlbumEntity albumEntity;
    private List<SongDTO> songDTOList;
    private ImageEntity imageEntity;
    private SingerEntity singerEntity;
    public  AlbumDTO(){}
    public AlbumDTO(AlbumEntity albumEntity, List<SongDTO> songDTOList, ImageEntity imageEntity, SingerEntity singerEntity) {
        this.albumEntity = albumEntity;
        this.songDTOList = songDTOList;
        this.imageEntity = imageEntity;
        this.singerEntity = singerEntity;
    }

    public AlbumEntity getAlbumEntity() {
        return albumEntity;
    }

    public void setAlbumEntity(AlbumEntity albumEntity) {
        this.albumEntity = albumEntity;
    }

    public List<SongDTO> getSongDTOList() {
        return songDTOList;
    }

    public void setSongDTOList(List<SongDTO> songDTOList) {
        this.songDTOList = songDTOList;
    }

    public ImageEntity getImageEntity() {
        return imageEntity;
    }

    public void setImageEntity(ImageEntity imageEntity) {
        this.imageEntity = imageEntity;
    }

    public SingerEntity getSingerEntity() {
        return singerEntity;
    }

    public void setSingerEntity(SingerEntity singerEntity) {
        this.singerEntity = singerEntity;
    }
}
