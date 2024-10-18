import java.util.LinkedList;
public class AddElements {
    public void execute() {
        boolean on = true;
        LinkedList<PatientType> patientList = new LinkedList<PatientType>();
        pcpType Dr1 = new pcpType("Renata", "Glasc", "General Surgery");

        pcpType Dr2 = new pcpType("Margaret", "Levy", "Cardio Thoracic Surgery");

        PatientType patient1 = new PatientType("John", "Smith", "123-45-6789", "23132312", "123",
                1, 2, 2001, Dr1, true, "This is a chart", "Yay youre a patient");
        PatientType patient2 = new PatientType("Jane", "Smith", "321-54-9876", "80085", "124",
                11, 12, 2005, Dr2, true, "This is also a chart", "Dang... youre a patient");
        do {
            patientList.add(patient1);
            patientList.add(patient2);

            on = false;
        } while (on);
        printList(patientList);
    }

    public static void printList(LinkedList<PatientType> patientList) {
        for (int i = 0; i < patientList.size(); i++) {
            PatientType currentpatient = patientList.get(i);
            currentpatient.printPatient();
        }
    }
}
