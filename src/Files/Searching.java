
package Files;

/**
 * @author user
 */

import java.util.ArrayList;


public class Searching {

    public ArrayList<Employee> searchEmloyeeType(String type, ArrayList<Employee> records, ArrayList<Employee> results) {

        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getDepartment().equals(type)) {
                //Append to results:
                results.add(records.get(i));
            }
        }

        return results;
    }

    /**
     * Linear search through records:
     * @param id
     * @param records
     * @return index of record else -1 which indicates an invalid id was entered:
     */
    public int searchEmployeeById(int id, ArrayList<Employee> records) {
        for (int index = 0; index < records.size(); index++) {
            if (records.get(index).getEmployeeId() == id)
                return index;
        }
        return -1;
    }

    public ArrayList<Employee> searchByGender(char gender, ArrayList<Employee> records, ArrayList<Employee> results) {

        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getGender() == gender) {
                results.add(records.get(i));
            }
        }

        return results;
    }

    public ArrayList<Employee> searchByCity(String city, ArrayList<Employee> records, ArrayList<Employee> results) {

        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getCity().equals(city)) {
                results.add(records.get(i));
            }
        }

        return results;
    }

}