
package Files;

/**
 *
 * @author user
 */
public abstract class Employee {
    public int employeeId, leaveDays;
    public String firstName ,lastName, dateOfBirth, address, city, titleOfEmployment, dateHired, department;
    public char gender;
    public double hoursWorked, rateOfPay, salary = 0, carAllowance = 0, monthlyGratuity, taxRate;

    public Employee() {
        this.employeeId = employeeId;
        this.leaveDays = leaveDays;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.city = city;
        this.titleOfEmployment = titleOfEmployment;
        this.dateHired = dateHired;
        this.department = department;
        this.gender = gender;
        this.hoursWorked = hoursWorked;
        this.rateOfPay = rateOfPay;
        this.monthlyGratuity = monthlyGratuity;
        this.taxRate = taxRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTitleOfEmployment() {
        return titleOfEmployment;
    }

    public void setTitleOfEmployment(String titleOfEmployment) {
        this.titleOfEmployment = titleOfEmployment;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRateOfPay() {
        return rateOfPay;
    }

    public void setRateOfPay(double rateOfPay) {
        this.rateOfPay = rateOfPay;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getCarAllowance() {
        return carAllowance;
    }

    public void setCarAllowance(double carAllowance) {
        this.carAllowance = carAllowance;
    }

    public double getMonthlyGratuity() {
        return monthlyGratuity;
    }

    public void setMonthlyGratuity(double monthlyGratuity) {
        this.monthlyGratuity = monthlyGratuity;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", leaveDays=" + leaveDays + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", city=" + city + ", titleOfEmployment=" + titleOfEmployment + ", dateHired=" + dateHired + ", department=" + department + ", gender=" + gender + ", hoursWorked=" + hoursWorked + ", rateOfPay=" + rateOfPay + ", salary=" + salary + ", carAllowance=" + carAllowance + ", monthlyGratuity=" + monthlyGratuity + ", taxRate=" + taxRate + '}';
    }

    public double calculateBaseSalary()
    {
        this.salary = this.hoursWorked * this.rateOfPay;
        
        return this.salary;
    }
        //Calculate CarAllowance:
    public abstract String getDEPARTMENT();
    
    public abstract double getCarAllowanceRate();
    
    public abstract double calculateCarAllowance();
    
    public abstract double calculateGrossSalary();
    
}
