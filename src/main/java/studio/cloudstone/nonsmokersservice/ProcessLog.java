package studio.cloudstone.nonsmokersservice;

import org.joda.time.DateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class ProcessLog {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String carCert;
    private DateTime applyBeginDate;
    private DateTime applyEndDate;
    private DateTime processDate;

    public DateTime getProcessDate() {
        return processDate;
    }

    public void setProcessDate(DateTime processDate) {
        this.processDate = processDate;
    }

    public DateTime getApplyEndDate() {
        return applyEndDate;
    }

    public void setApplyEndDate(DateTime applyEndDate) {
        this.applyEndDate = applyEndDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarCert() {
        return carCert;
    }

    public void setCarCert(String carCert) {
        this.carCert = carCert;
    }

    public DateTime getApplyBeginDate() {
        return applyBeginDate;
    }

    public void setApplyBeginDate(DateTime applyBeginDate) {
        this.applyBeginDate = applyBeginDate;
    }
}
