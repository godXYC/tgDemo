package cn.cygia.tg.repository;


import cn.cygia.tg.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserOperationRepository extends JpaRepository<UserEntity,Integer>{
    UserEntity findByNickName(String username);
    UserEntity findByNickNameAndPassword(String username,String password);

}
