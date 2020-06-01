package hospital.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/*医生*/
public class Employee {
    private String EmployeeCode;
    private String EmployeeName;

    @JsonProperty("employee_naturn")
    private String employeeNaturn;

    @JsonProperty("Specialist_flag")
    private String SpecialistFlag;

    @JsonProperty("HIS_Code")
    private String JobName;

    private String Specialty;
    private String Remark;

    @JsonProperty("Job_Name")
    private String hisCode;

    private String week;

    public String getEmployeeCode() {
        return EmployeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        EmployeeCode = employeeCode;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmployeeNaturn() {
        return employeeNaturn;
    }

    public void setEmployeeNaturn(String employeeNaturn) {
        this.employeeNaturn = employeeNaturn;
    }

    public String getSpecialistFlag() {
        return SpecialistFlag;
    }

    public void setSpecialistFlag(String specialistFlag) {
        SpecialistFlag = specialistFlag;
    }

    public String getJobName() {
        return JobName;
    }

    public void setJobName(String jobName) {
        JobName = jobName;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String specialty) {
        Specialty = specialty;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getHisCode() {
        return hisCode;
    }

    public void setHisCode(String hisCode) {
        this.hisCode = hisCode;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeCode='" + EmployeeCode + '\'' +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", employeeNaturn='" + employeeNaturn + '\'' +
                ", SpecialistFlag='" + SpecialistFlag + '\'' +
                ", JobName='" + JobName + '\'' +
                ", Specialty='" + Specialty + '\'' +
                ", Remark='" + Remark + '\'' +
                ", hisCode='" + hisCode + '\'' +
                ", week=" + week +
                '}';
    }
}
