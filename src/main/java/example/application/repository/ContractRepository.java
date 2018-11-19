package example.application.repository;

import example.domain.model.contract.Contracts;
import example.domain.model.contract.HourlyWage;
import example.domain.model.contract.MonthlyHourlyWages;
import example.domain.model.worker.WorkerNumber;
import example.domain.type.date.Date;
import example.domain.type.date.YearMonth;

public interface ContractRepository {
    void registerHourlyWage(WorkerNumber workerNumber, Date applyDate, HourlyWage hourlyWage);

    HourlyWage getHourlyWage(WorkerNumber workerNumber, Date workDay);

    MonthlyHourlyWages getMonthlyHourlyWage(WorkerNumber workerNumber, YearMonth yearMonth);

    Contracts getContracts(WorkerNumber workerNumber, Date startDate, Date endDate);
}
