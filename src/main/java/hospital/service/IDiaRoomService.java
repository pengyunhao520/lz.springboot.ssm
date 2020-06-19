package hospital.service;

import hospital.domain.DiaRoom;

public interface IDiaRoomService extends IBaseService<DiaRoom> {
    DiaRoom getDiaRoom(String ipAddress);
    DiaRoom getDiaRoomByRoomName(String name);
}
