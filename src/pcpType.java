
public class pcpType {
    String drFname;
    String drLname;
    PatientType patient = new PatientType();
    public pcpType(String drFname, String drLname, PatientType newpatient) {
        this.drFname = drFname;
        this.drLname = drLname;
        //this.patient = newpatient;
    }
    public String getDrFname() {return drFname;}
    public String getDrLname() {return drLname;}
    public PatientType getPatient() {return patient;}

    public void setDrFname(String drFname) {this.drFname = drFname;}
    public void setDrLname(String drLname) {this.drLname = drLname;}
    //public void setPatient(PatientType patient ) {this.patient = patient;}


}
