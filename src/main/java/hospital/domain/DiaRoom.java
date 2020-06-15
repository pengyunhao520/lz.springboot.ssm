package hospital.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DiaRoom {
    @JsonProperty("room_code")
    private String roomCode;
    @JsonProperty("room_name")
    private String roomName;
    @JsonProperty("dept_name")
    private String deptName;
    @JsonProperty("Machine_name")
    private String machineName;
    @JsonProperty("ip_addess")
    private String ipAddess;
    @JsonProperty("His_Code")
    private String hisCode;
    @JsonProperty("Guide_Id")
    private char guideId;

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getIpAddess() {
        return ipAddess;
    }

    public void setIpAddess(String ipAddess) {
        this.ipAddess = ipAddess;
    }

    public String getHisCode() {
        return hisCode;
    }

    public void setHisCode(String hisCode) {
        this.hisCode = hisCode;
    }

    public char getGuideId() {
        return guideId;
    }

    public void setGuideId(char guideId) {
        this.guideId = guideId;
    }

    @Override
    public String toString() {
        return "DiaRoom{" +
                "roomCode='" + roomCode + '\'' +
                ", roomName='" + roomName + '\'' +
                ", deptName='" + deptName + '\'' +
                ", machineName='" + machineName + '\'' +
                ", ipAddess='" + ipAddess + '\'' +
                ", hisCode='" + hisCode + '\'' +
                ", guideId=" + guideId +
                '}';
    }
}
