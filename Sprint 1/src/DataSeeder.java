package src;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class DataSeeder {

    private static final String URL = "jdbc:mysql://localhost:3306/HospitalManagement?useSSL=false&serverTimezone=America/New_York";
    private static final String USER = "root";
    private static final String PASSWORD = "SQL355%Grouppa55";
    private static final int NUMBER_OF_PATIENTS = 10000; // Number of patients to generate

    private static final String[] firstNames = {"John", "Jane", "Alice", "Bob", "Carol", "Dave", "Eva", "Frank", "Grace", "Henry"};
    private static final String[] lastNames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez"};
    private static final String[] diagnoses = {"Hypertension", "Migraine", "Fracture", "Asthma", "Diabetes", "Infection", "Allergy", "Depression", "Anxiety", "Arthritis"};

    public static void main(String[] args) {
        Random random = new Random();

        String sql = "INSERT INTO Patients (first_name, last_name, date_of_birth, gender, admission_date, discharge_date, room_number, attending_physician, diagnosis) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {

            for (int i = 0; i < NUMBER_OF_PATIENTS; i++) {
                // Generating random patient data
                String firstName = firstNames[random.nextInt(firstNames.length)];
                String lastName = lastNames[random.nextInt(lastNames.length)];
                Date dateOfBirth = new Date(System.currentTimeMillis() - (random.nextInt(60) + 20) * 365L * 24 * 60 * 60 * 1000L); // Age 20-80
                String gender = random.nextBoolean() ? "M" : "F";
                Date admissionDate = new Date(System.currentTimeMillis() - (random.nextInt(10) * 24L * 60L * 60L * 1000L)); // Past 10 days
                Date dischargeDate = random.nextBoolean() ? new Date(admissionDate.getTime() + (random.nextInt(5) * 24L * 60L * 60L * 1000L)) : null; // Within 5 days or null
                int roomNumber = random.nextInt(50) + 1; // Rooms 1-50
                int attendingPhysician = random.nextInt(5) + 1; // Physicians 1-5
                String diagnosis = diagnoses[random.nextInt(diagnoses.length)];

                // Setting values for SQL statement
                pstmt.setString(1, firstName);
                pstmt.setString(2, lastName);
                pstmt.setDate(3, dateOfBirth);
                pstmt.setString(4, gender);
                pstmt.setDate(5, admissionDate);
                if (dischargeDate != null) {
                    pstmt.setDate(6, dischargeDate);
                } else {
                    pstmt.setNull(6, java.sql.Types.DATE);
                }
                pstmt.setInt(7, roomNumber);
                pstmt.setInt(8, attendingPhysician);
                pstmt.setString(9, diagnosis);

                // Add to batch
                pstmt.addBatch();
            }

            // Execute the batch of inserts
            pstmt.executeBatch();
            System.out.println(NUMBER_OF_PATIENTS + " patients have been successfully added to the database.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
