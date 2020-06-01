package hospital.service.serviceimpl;

import java.io.Serializable;
import java.util.List;

import hospital.dao.mapper.BaseMapper;
import hospital.domain.Patient;
import hospital.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/*
 （1）在类上添加这个@Transactional注解，类中的每个方法都使用这个注解的策略进行事务管理
 如果某个方法不想使用类定义的事务管理的策略，需要重新定义测试，重新加@Transactional注解
（2）@Transactional这个注解是可以被子类继承的
 */
//@Service
@Transactional(readOnly=true,propagation=Propagation.SUPPORTS)
public class BaseServiceImpl<T> implements IBaseService<T> {

	//高版本的Mybatis支持这种写法
	@Autowired
	private BaseMapper<T> mapper;
	@Override
	//@Transactional(readOnly=false,propagation=Propagation.REQUIRED)
	@Transactional
	public int delete(Serializable id) {
		return mapper.deleteByPrimaryKey(id);
	}
	@Override
	@Transactional
	public int add(T record) {
		return mapper.insert(record);
	}
	@Override
	public T getOne(Serializable id) {
		return mapper.selectByPrimaryKey(id);
	}
	@Override
	public List<T> getAll() {
		return mapper.selectAll();
	}

	@Override
	@Transactional
	public int update(T t) {
		return mapper.updateByPrimaryKey(t);
	}

}
