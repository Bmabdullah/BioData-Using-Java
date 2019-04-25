
package biodata;
import java.util.Scanner;
/**
 *
 * @author Badhon
 */
public class BioData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        System.out.println("Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Enter Your Father's Name: ");
        String fname = input.nextLine();
        System.out.println("Enter Your Mother's Name: ");
        String mname = input.nextLine();
        System.out.println("Enter Your Age: ");
        String age = input.nextLine();
        System.out.println("Enter Your Village: ");
        String vill = input.nextLine();
        System.out.println("Enter Your Postal Code: ");
        String post = input.nextLine();
        System.out.println("Enter Your Thana: ");
        String thana = input.nextLine();
        System.out.println("Enter Your District: ");
        String dis = input.nextLine();
        System.out.println("Enter Your Phone Number: ");
        String phone = input.nextLine();
        System.out.println("Enter Your E-Mail: ");
        String mail = input.nextLine();
        System.out.println("Enter Your Educational Qualification: ");
        String edu = input.nextLine();
        
        System.out.println();System.out.println();System.out.println();
        
        System.out.println("Here is Your Biodata: ");
        System.out.println();
        System.out.println("Name: " + name );
        System.out.println("Father's Name: " + fname);
        System.out.println("Mother's Name: " + mname);
        System.out.println("Age: " + age );
        System.out.println("Village: " + vill);
        System.out.println("Postal Code: " + post);
        System.out.println("Thana: " + thana );
        System.out.println("District: " + dis);
        System.out.println("Phone: " + phone);
        System.out.println("E-Mail: " + mail );
        System.out.println("Education: " + edu);
        
}
}
