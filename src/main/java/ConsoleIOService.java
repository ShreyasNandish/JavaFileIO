import java.util.List;
public class ConsoleIOService implements PayrollService{
    @Override
    public boolean writePayrollData(List<EmployeePayrollData> employeePayrollDataList) {
        return false;
    }

    @Override
    public void readPayrollData() {

    }

    @Override
    public long countEntries() {
        return 0;
    }
}
