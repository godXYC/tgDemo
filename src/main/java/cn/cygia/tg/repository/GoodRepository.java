package cn.cygia.tg.repository;

import cn.cygia.tg.entity.GoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodRepository extends JpaRepository<GoodEntity,Integer>{

    GoodEntity findByGoodNumber(String goodsNumber);

}
