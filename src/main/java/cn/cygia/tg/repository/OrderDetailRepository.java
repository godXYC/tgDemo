package cn.cygia.tg.repository;

import cn.cygia.tg.entity.OrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity,Integer>{

    List<OrderDetailEntity> findAllByConSn(String sn);
}
