package com.java.springcloud.dao;

import com.java.springcloud.entity.TOrder;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderMapper {

    @Select("select * from t_order where id = #{id}")
    TOrder findById(Long id);

    @Select("select * from t_order")
    List<TOrder> findAll();
}
