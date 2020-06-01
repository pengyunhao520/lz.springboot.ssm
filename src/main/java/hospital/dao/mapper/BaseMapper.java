package hospital.dao.mapper;

import java.io.Serializable;
import java.util.List;

import hospital.domain.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//@Repository
//@Mapper
public interface BaseMapper<T> {
		//删除
		int deleteByPrimaryKey(Serializable id);
		//添加
	    int insert(T record);
	    //查一个
	    T selectByPrimaryKey(Serializable id);
	    //查所有
	    List<T> selectAll();
	    //修改
	    int updateByPrimaryKey(T t);
}
