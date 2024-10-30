import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


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

    public static PatientType searchPatientByMRN(String ID) throws SQLException {
        PatientType patient = null;
        //String query = "SELECT * FROM Patients WHERE room_number = ?";
        String query = "SELECT * FROM Patients WHERE patient_id = ?";

        try (Connection connect = DatabaseConnection.getConnection();
             PreparedStatement stmt = connect.prepareStatement(query)) {

            stmt.setString(1, ID);

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

    public static PatientType searchPatientByPCP(String pcp) throws SQLException {
        PatientType patient = null;
        String query = "SELECT * FROM Patients WHERE pcp = ?";
        try (Connection connect = DatabaseConnection.getConnection();
        PreparedStatement stmt = connect.prepareStatement(query)) {
            stmt.setString(1, pcp);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    patient = new PatientType();
                    patient.setMRN(rs.getString("patient_id"));
                    patient.setfname(rs.getString("first_name"));
                    patient.setlname(rs.getString("last_name"));
                    String[] parts = rs.getString("date_of_birth").split("-");
                    int year = Integer.parseInt(parts[0]);
                    patient.setBirthYear(year);
                    int month = Integer.parseInt(parts[1]);
                    patient.setBirthMonth(month);
                    int day = Integer.parseInt(parts[2]);
                    patient.setBirthDay(day);
                    patient.setGender(rs.getString("gender"));
                    parts = rs.getString("admission_date").split("-");
                    year = Integer.parseInt(parts[0]);
                    patient.setAdminYear(year);
                    month = Integer.parseInt(parts[1]);
                    patient.setAdminMonth(month);
                    day = Integer.parseInt(parts[2]);
                    patient.setAdminDay(day);
                    patient.setRoomNumber(rs.getString("room_number"));
                    patient.setPcpString(rs.getString("pcp"));
                    patient.setDiagnosis(rs.getString("diagnosis"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patient;
    }

    public static PatientType searchPatientByaddmissionDate(String admindate) throws SQLException {
        /*PatientType patient = null;
        String query = "SELECT * FROM Patients WHERE addmission_date = ?";
        try (Connection connect = DatabaseConnection.getConnection();
        PreparedStatement stmt = connect.prepareStatement(query)) {
            stmt.setString(1, admindate);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    patient = new PatientType();
                    patient.setMRN(rs.getString("patient_id"));
                    patient.setfname(rs.getString("first_name"));
                    patient.setlname(rs.getString("last_name"));
                    String[] parts = rs.getString("date_of_birth").split("-");
                    int year = Integer.parseInt(parts[0]);
                    patient.setBirthYear(year);
                    int month = Integer.parseInt(parts[1]);
                    patient.setBirthMonth(month);
                    int day = Integer.parseInt(parts[2]);
                    patient.setBirthDay(day);
                    patient.setGender(rs.getString("gender"));
                    parts = rs.getString("admission_date").split("-");
                    year = Integer.parseInt(parts[0]);
                    patient.setAdminYear(year);
                    month = Integer.parseInt(parts[1]);
                    patient.setAdminMonth(month);
                    day = Integer.parseInt(parts[2]);
                    patient.setAdminDay(day);
                    patient.setRoomNumber(rs.getString("room_number"));
                    patient.setPcpString(rs.getString("pcp"));
                    patient.setDiagnosis(rs.getString("diagnosis"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patient;*/
    return null;
    }

    /*
    //prototype for all in one function
    public static PatientType searchPatientBy(String criteria, String type) throws SQLException {
        PatientType patient = null;
        String query = "";
        if (type == "name"){
            query = "SELECT * FROM Patients WHERE first_name = ? AND last_name = ?";
        } else if (type == "room") {
            query = "SELECT * FROM Patients WHERE room_number = ?";
        } else if (type == "pcp") {
            query = "SELECT * FROM Patients WHERE pcp = ?";
        } else if (type == "MRN") {
            query = "SELECT * FROM Patients WHERE MRN = ?";
        }
        try (Connection connect = DatabaseConnection.getConnection();
             PreparedStatement stmt = connect.prepareStatement(query)) {
            if (type == "name"){
                stmt.setString(1, fName);
                stmt.setString(2, lName);
            } else if (type == "room") {
            } else if (type == "pcp") {
            } else if (type == "MRN") {
            }
        }

    } */
        //create searches for Admission date.
        //Admission date will be passed in as a string and parsed into the 3 ints to be searched if it matches all 3 on a patient
}
