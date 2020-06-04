package hospital.dao.mapper;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T> {

	/**
	 * 删除
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(Serializable id);

	/**
	 * 添加
	 * @param record
	 * @return
	 */
	int insert(T record);

	/**
	 * 差一个
	 * @param id
	 * @return
	 */
	T selectByPrimaryKey(Serializable id);

	/**
	 * 查所有
	 * @return
	 */
	List<T> selectAll();

	/**
	 * 修改
	 * @param t
	 * @return
	 */
	int updateByPrimaryKey(T t);
}
