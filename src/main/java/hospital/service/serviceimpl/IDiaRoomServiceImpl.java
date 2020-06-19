package hospital.service.serviceimpl;

import hospital.dao.IDiaRoomMapper;
import hospital.domain.DiaRoom;
import hospital.service.IDiaRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IDiaRoomServiceImpl extends BaseServiceImpl<DiaRoom> implements IDiaRoomService {
    @Autowired
    private IDiaRoomMapper diaRoomMapper;

    @Override
    public DiaRoom getDiaRoom(String ipAddress) {
        DiaRoom diaRoom = diaRoomMapper.getDiaRoom(ipAddress);
        return diaRoom;
    }

    @Override
    public DiaRoom getDiaRoomByRoomName(String name) {
        DiaRoom diaRoom = diaRoomMapper.getDiaRoomByRoomName(name);
        return diaRoom;
    }
}
