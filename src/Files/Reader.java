package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader{


    //ArrayList to hold values:
    private ArrayList<Employee> records = new ArrayList<>();
    //Delimiter used in CSV file
    private static final String DELIMITER = ",";
    private static final String FILE_NAME = "/Users/mac/Desktop/HRMS/src/Files/File.txt";
    
    private Scanner input;
    private File file;
    
    
    //DataStructure to hold Employee Objects:
    ArrayList <Employee> employeeList = new ArrayList<>();
    
    /**
    * Method to open file for reading:
    */
    public void openFile(){
        try{
            //Get the input file instance:
            file = new File(FILE_NAME);
            //Use Scanner to read file:
            input = new Scanner(file);
            
	}catch (Exception e) {
		e.printStackTrace();
	} 
    }

    public ArrayList<Employee> readIntoArray() throws IOException {
        while (input.hasNext()) {
            String data = input.nextLine(); //Read row
            String[] values = data.split(DELIMITER);
            
            Employee emp = resolveEmployeeType(Integer.parseInt(values[0]), values[7]);
        
            emp.setFirstName(values[1]);
            emp.setLastName(values[2]);
            emp.setGender(values[3].charAt(0));
            emp.setDateOfBirth(values[4]);
            emp.setAddress(values[5]);
            emp.setCity(values[6]);
            //(Department is static constant)
            emp.setTitleOfEmployment(values[8]);
            emp.setDateHired(values[9]);
            emp.setHoursWorked(Double.parseDouble(values[10]));
            emp.setRateOfPay(Double.parseDouble(values[11]));
            emp.calculateBaseSalary();
            //(Car allowance rate is static constant)
            emp.calculateCarAllowance();
            emp.setMonthlyGratuity(Double.parseDouble(values[15]));
            //(Tax rate is static constant)
            emp.setLeaveDays(Integer.parseInt(values[17]));
            //Add employye record to list:
            this.records.add(emp);     
        }
        return this.records;
    }

    public Employee resolveEmployeeType(int id, String department){
        
        Employee emp;
        
        switch(department) {
            case "Marketing":
                emp = new MarketingExecutive(id);
                break;
            case "Human Resource":
                emp = new HumanResourceOfficer(id);
                break;
            case "Accounts":
                emp = new AccountsOfficer(id);
                break;
            case "Support Staff":
                emp = new SupportStaff(id);
                break;
            case "Management":
                emp = new ManagementTeam(id);
                break;
            case "Temporary Staff":
                emp = new TempStaff(id);
                break;
            default:
                emp = null;
        }return emp;
        
    }
    
    public void closeFile() throws IOException {
        try{
            input.close();
        }catch(Exception e){
            e.printStackTrace();
        }  
    }
    
}
