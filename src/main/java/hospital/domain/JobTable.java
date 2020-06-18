package hospital.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 职称
 */
public class JobTable {
    @JsonProperty("Serial_No")
    private char serialNo;
    @JsonProperty("Job_Name")
    private String jobName;

    public char getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(char serialNo) {
        this.serialNo = serialNo;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public String toString() {
        return "JobTable{" +
                "serialNo=" + serialNo +
                ", jobName='" + jobName + '\'' +
                '}';
    }
}
