package cn.itcast.dao;

import cn.itcast.domain.Items;

@Requestory
public interface ItemsDao {
@Select("select * from items where id = #{id}")
public Items findById(Integer id);
}
