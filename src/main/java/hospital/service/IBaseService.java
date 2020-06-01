
package hospital.service;


import java.io.Serializable;
import java.util.List;



public interface IBaseService<T> {
	//删除
	int delete(Serializable id);
	//添加
    int add(T record);
    //查一个
    T getOne(Serializable id);
    //查所有
    List<T> getAll();
    //修改
    int update(T t);
	
}
