package cn.cygia.tg.repository;


import cn.cygia.tg.entity.UserGradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGradeRepository extends JpaRepository<UserGradeEntity,Integer>{
}
