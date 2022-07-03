package demo.cloud.provider.dao;

import demo.cloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptDao {

    @Select("select * from t_dept")
    List<Dept> findAll();
}
