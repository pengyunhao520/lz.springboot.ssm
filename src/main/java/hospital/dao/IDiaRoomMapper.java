package hospital.dao;

import hospital.dao.mapper.BaseMapper;
import hospital.domain.DiaRoom;
import org.apache.ibatis.annotations.Select;

public interface IDiaRoomMapper extends BaseMapper<DiaRoom> {
    @Select("select * from Dia_Room where ip_addess=#{ipAddess}")
    DiaRoom getDiaRoom(String ipAddess);
}
