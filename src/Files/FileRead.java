
package Files;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

/**
 *
 * @author user
 */
public class FileRead {
    
  public static void main(String[] args) {
    try {
      File myObj = new File("/Users/mac/Desktop/HRMS/src/Files/File.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("no file");
      e.printStackTrace();
    }
  }
}