import java.io.IOException;
import java.util.List;

public interface PayrollService {
    boolean writePayrollData(List<EmployeePayrollData> employeePayrollData) throws IOException;
    void readPayrollData() throws IOException;
    long countEntries() throws IOException;

}
