import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//change the multiple methods into one method that varies the string query depending on the menu instruction chosen
//pls ignore how bulky this is, it will be streamlined later
public class PatientDBService {
    public static PatientType searchPatientName(String fName, String lName) {
        PatientType patient = null;
        String query = "SELECT * FROM Patients WHERE first_name = ? AND last_name = ?"; //make this an if / else statement later

        try (Connection connect = DatabaseConnection.getConnection();
            PreparedStatement stmt = connect.prepareStatement(query)) {
                stmt.setString(1, fName);
                stmt.setString(2, lName);

                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        patient = new PatientType();
                        patient.setMRN(rs.getString("patient_id"));
                        patient.setfname(rs.getString("first_name"));
                        patient.setlname(rs.getString("last_name"));
                        //make patient var for DOB (done)
                        String[] parts = rs.getString("date_of_birth").split("-");
                        int year = Integer.parseInt(parts[0]);
                        patient.setBirthYear(year);
                        int month = Integer.parseInt(parts[1]);
                        patient.setBirthMonth(month);
                        int day = Integer.parseInt(parts[2]);
                        patient.setBirthDay(day);
                        //make patient var for gender (done)
                        patient.setGender(rs.getString("gender"));
                        //make var for set admission date all in one
                        parts = rs.getString("admission_date").split("-");
                        year = Integer.parseInt(parts[0]);
                        patient.setAdminYear(year);
                        month = Integer.parseInt(parts[1]);
                        patient.setAdminMonth(month);
                        day = Integer.parseInt(parts[2]);
                        patient.setAdminDay(day);
                        //make var for patient discharge date
                        patient.setRoomNumber(rs.getString("room_number"));
                        //patient.setPcp(rs.getString("attending_physician")); // fix, might need to change pcp type to string for time being
                        patient.setPcpString(rs.getString("pcp"));
                        //make var for patient diagnosis
                        patient.setDiagnosis(rs.getString("diagnosis"));

                    }
                }
            }catch (SQLException e) {
            e.printStackTrace();
            }
        return patient;
        }

        public static PatientType searchPatientByRoom(String roomNumber) throws SQLException {
        PatientType patient = null;
        String query = "SELECT * FROM Patients WHERE room_number = ?";

        try (Connection connect = DatabaseConnection.getConnection();
             PreparedStatement stmt = connect.prepareStatement(query)) {

            stmt.setString(1,roomNumber);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    patient = new PatientType();
                    patient.setMRN(rs.getString("patient_id"));
                    patient.setfname(rs.getString("first_name"));
                    patient.setlname(rs.getString("last_name"));
                    //make patient var for DOB (done)
                    String[] parts = rs.getString("date_of_birth").split("-");
                    int year = Integer.parseInt(parts[0]);
                    patient.setBirthYear(year);
                    int month = Integer.parseInt(parts[1]);
                    patient.setBirthMonth(month);
                    int day = Integer.parseInt(parts[2]);
                    patient.setBirthDay(day);
                    //make patient var for gender (done)
                    patient.setGender(rs.getString("gender"));
                    //make var for set admission date all in one
                    parts = rs.getString("admission_date").split("-");
                    year = Integer.parseInt(parts[0]);
                    patient.setAdminYear(year);
                    month = Integer.parseInt(parts[1]);
                    patient.setAdminMonth(month);
                    day = Integer.parseInt(parts[2]);
                    patient.setAdminDay(day);
                    //make var for patient discharge date
                    patient.setRoomNumber(rs.getString("room_number"));
                    //patient.setPcp(rs.getString("attending_physician")); // fix, might need to change pcp type to string for time being
                    patient.setPcpString(rs.getString("pcp"));
                    //make var for patient diagnosis
                    patient.setDiagnosis(rs.getString("diagnosis"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patient;
        }

        //create searches for MRN, Admission date and pcp.
        //Admission date will be passed in as a string and parsed into the 3 ints to be searched if it matches all 3 on a patient
    }
