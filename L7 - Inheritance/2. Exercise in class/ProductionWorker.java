import java.time.LocalDate;

class ProductionWorker extends Employee {
    int shift;
    double hourly_wage;

    ProductionWorker()
    {

    }
    ProductionWorker(String employee_name,String employee_number,LocalDate hire_date,int shift, double hourly_wage )
    {

        super(employee_name, employee_number,hire_date);
        this.shift=shift;
        this.hourly_wage=hourly_wage;
    }
}