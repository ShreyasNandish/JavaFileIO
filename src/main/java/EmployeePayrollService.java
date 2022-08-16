import java.io.File;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
public class EmployeePayrollService {
    List<EmployeePayrollData> employeePayrollData = new ArrayList<>();

    public enum IOService
    {
        FILE_IO,CONSOLE_IO
    }
    public EmployeePayrollService(List<EmployeePayrollData> list)
    {
        this.employeePayrollData = list;
    }

    Boolean writeEmployeePayrollData(IOService ioService)
    {
        PayrollService payrollService = getEmployeePayrollObject(ioService);
        try {
            return payrollService.writePayrollData(employeePayrollData);
        }
        catch (IOException e)
        {
            System.out.println("Catch block");
        }
        return false;
    }

    public void readEmployeePayrollData(IOService ioService) {
        PayrollService payrollService = getEmployeePayrollObject(ioService);
        try {
            payrollService.readPayrollData();
        } catch (IOException e) {
            System.out.println("Catch block");
        }
    }

        public int countEmployeePayrollData(IOService ioService)
        {
            PayrollService payrollService = getEmployeePayrollObject(ioService);
            try {
                payrollService.countEntries();
            } catch (IOException e) {
                System.out.println("Catch block");
            }
            return 0;
        }

    private PayrollService getEmployeePayrollObject(IOService ioService){
        PayrollService payrollService = null;
        if(IOService.FILE_IO.equals(ioService)){
            payrollService = new File;
        }
        else if(IOService.CONSOLE_IO.equals(ioService)){
            payrollService = new ConsoleIOService();
        }
        return payrollService;
    }
}
