package hospital.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/*患者*/
public class Patient {
    @JsonProperty("Serial_no")
    private int serialNO;

    @JsonProperty("Patient_id")
    private String patientID;

    @JsonProperty("Patient_name")
    private String patientName;

    @JsonProperty("Queue_sn")
    private int queueSN;

    @JsonProperty("Dia_room")
    private String diaRoom;

    private String Status;
    private String Doctor;

    @JsonProperty("Dia_time")
    private Date diaTime;

    @JsonProperty("Out_status")
    private String outStatus;

    @JsonProperty("Reg_Type")
    private String regType;

    @JsonProperty("Guide_Id")
    private String guideID;

    public int getSerialNO() {
        return serialNO;
    }

    public void setSerialNO(int serialNO) {
        this.serialNO = serialNO;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getQueueSN() {
        return queueSN;
    }

    public void setQueueSN(int queueSN) {
        this.queueSN = queueSN;
    }

    public String getDiaRoom() {
        return diaRoom;
    }

    public void setDiaRoom(String diaRoom) {
        this.diaRoom = diaRoom;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String doctor) {
        Doctor = doctor;
    }

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public Date getDiaTime() {
        return diaTime;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setDiaTime(Date diaTime) {
        this.diaTime = diaTime;
    }

    public String getOutStatus() {
        return outStatus;
    }

    public void setOutStatus(String outStatus) {
        this.outStatus = outStatus;
    }

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public String getGuideID() {
        return guideID;
    }

    public void setGuideID(String guideID) {
        this.guideID = guideID;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "serialNO=" + serialNO +
                ", patientID='" + patientID + '\'' +
                ", patientName='" + patientName + '\'' +
                ", queueSN=" + queueSN +
                ", diaRoom='" + diaRoom + '\'' +
                ", Status='" + Status + '\'' +
                ", Doctor='" + Doctor + '\'' +
                ", diaTime=" + diaTime +
                ", outStatus='" + outStatus + '\'' +
                ", regType='" + regType + '\'' +
                ", guideID='" + guideID + '\'' +
                '}';
    }
}
