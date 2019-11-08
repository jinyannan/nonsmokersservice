package studio.cloudstone.nonsmokersservice;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("CarCertHelper")
public class EbjCarCertController {
    public static final String SHORT_DATE_FORMAT = "yyyy-MM-dd";

    @GetMapping("genEbjCarCert")
    public ProcessLog genEbjCarCertController(@RequestParam(value = "name", required = false, defaultValue = "金燕南") String name,
                                          @RequestParam(value = "carCert", required = false, defaultValue = "冀RP6U36") String carCert,
                                          @RequestParam(value = "applyBeginDate") String applyBeginDate,
                                          @RequestParam(value = "applyEndDate") String applyEndDate){
        ProcessLog processLog = new ProcessLog();
        processLog.setName(name);

        processLog.setCarCert(carCert);
        applyBeginDate = StringUtils.isBlank(applyBeginDate) ? DateTime.now().toString(SHORT_DATE_FORMAT) : applyBeginDate;
        applyEndDate = StringUtils.isBlank(applyEndDate) ? DateTime.now().toString(SHORT_DATE_FORMAT) : applyEndDate;
        processLog.setApplyBeginDate(DateTime.parse(applyBeginDate, DateTimeFormat.forPattern(SHORT_DATE_FORMAT)));
        processLog.setApplyEndDate(DateTime.parse(applyEndDate, DateTimeFormat.forPattern(SHORT_DATE_FORMAT)));
        processLog.setProcessDate(DateTime.now());
        return processLog;
    }
}
