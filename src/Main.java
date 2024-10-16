import java.util.LinkedList;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

//main class
public class Main {
    //first method 
    public static void showmenu1()
    {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            //Menu options between 1 and 4, currently takes numerical keyboard input to select
            System.out.printf("-------------Main Menu---------------\n");
            System.out.printf("What search would you like? \n");
            System.out.printf("1. Basic search...\n");
            System.out.printf("2. Advanced search...\n");
            System.out.printf("3. Print all Patients...\n");
            System.out.printf("4. Call a doctor...\n");
            System.out.printf("9. Exit\n");

            //Takes next input for menu selection
            choice = scanner.nextLine();

            //sub menu for advanced search
            if (choice.equalsIgnoreCase("1")) {
                System.out.printf("--------Basic Search-------------\n");
                System.out.printf("Enter patient first name...\n");
                String firstName = scanner.nextLine();
                System.out.printf("Enter patient last name...\n");
                String lastName = scanner.nextLine();
                //enter method for search algo
                //basicPatientSearch(fname, lname)

                //If selected opens sub menu for advanced search
            } else if (choice.equalsIgnoreCase("2")) {
                showmenu2();
                choice = "3";

                //If selection
            }else if (choice.equalsIgnoreCase("3")) {
                AddElements addElements = new AddElements();
                addElements.execute();
            }else if (choice.equalsIgnoreCase("4")) {
                System.out.println("Calling doctor on call...");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {  System.err.println("Interrupted: " + e.getMessage());  }
                System.out.println("But no one answered...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {  System.err.println("Interrupted: " + e.getMessage());  }
            }
        }while (!(choice.equals( "9")));

    }
    public static void showmenu2()
    {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.printf("--------Advanced Search-------------\n");
            System.out.printf("Search by... \n");
            System.out.printf("1. Room number \n");
            System.out.printf("2. Medical Record Number \n");
            System.out.printf("3. Admission Date \n");
            System.out.printf("4. Primary Care Provider \n");
            System.out.printf("9. Exit \n");
            choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("1")) {
                System.out.printf("Enter the room\n");
                String room = scanner.nextLine();
                //roomSearch(room);

                //choice = "9";
            } else if (choice.equalsIgnoreCase("2")) {
                System.out.printf("Enter the MRN\n");
                String MRN = scanner.nextLine();
                //mrnSearch(MRN);
                //choice = "9";
            } else if (choice.equalsIgnoreCase("3")) {
                System.out.printf("Enter the Admission Date in day, month, year \n");
                int addDay = scanner.nextInt();
                int addMonth = scanner.nextInt();
                int addYear = scanner.nextInt();

                //admissionDateSearch(int addDay, int addMonth, int addYear);
                //choice = "9";
            } else if (choice.equalsIgnoreCase("4")) {
                System.out.printf("Enter the PCP\n");
                String PCP = scanner.nextLine();
                //pcpSearch(PCP);
                //choice = "9";
            }
        }while(!(choice.equals("9")));
    }


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        PatientType patient = new PatientType();
        showmenu1();
    }
}