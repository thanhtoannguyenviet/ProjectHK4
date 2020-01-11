package Server.model.DTO;

import Server.model.DB.ImageEntity;
import Server.model.DB.RoleEntity;
import Server.model.DB.UserEntity;

public class UserDTO {
    private UserEntity userEntity;
    private RoleEntity roleEntity;
    private ImageEntity imageEntity;

    public UserDTO(UserEntity userEntity, RoleEntity roleEntity, ImageEntity imageEntity) {
        this.userEntity = userEntity;
        this.roleEntity = roleEntity;
        this.imageEntity = imageEntity;
    }
    public UserDTO(){
    }
    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public RoleEntity getRoleEntity() {
        return roleEntity;
    }

    public void setRoleEntity(RoleEntity roleEntity) {
        this.roleEntity = roleEntity;
    }

    public ImageEntity getImageEntity() {
        return imageEntity;
    }

    public void setImageEntity(ImageEntity imageEntity) {
        this.imageEntity = imageEntity;
    }
}
