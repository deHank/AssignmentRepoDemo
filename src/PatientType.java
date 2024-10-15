public class PatientType {
    String patientFName;
    String patientLName;
    String SSN;
    String MRN;
    int adminDay;
    int adminMonth;
    int adminYear;
    //will be obj later
    String pcp;
    boolean insurance;
    String chart;
    String event;

    public PatientType()
    {
        this.patientFName = "";
        this.patientLName = "";
        this.SSN = "";
        this.MRN = "";
        this.adminDay = 1;
        this.adminMonth = 1;
        this.adminYear = 1900;
        this.pcp = "";
        this.insurance = false;
        this.chart = "";
        this.event = "";
    }

    public PatientType(String fname, String lname, String SSN, String MRN, int aDay,
                   int aMonth, int aYear, String pcp, boolean insurance, String chart, String event) {
        this.patientFName = fname;
        this.patientLName = lname;
        this.SSN = SSN;
        this.MRN = MRN;
        this.adminDay = aDay;
        this.adminMonth = aMonth;
        this.adminYear = aYear;
        this.pcp = pcp;
        this.insurance = insurance;
        this.chart = chart;
        this.event = event;
    }
    public String getPatientFName() {return patientFName;}
    public String getPatientLName() {return patientLName;}
    public String getSSN() {return SSN;}
    public String getMRN() {return MRN;}
    public int getAdminDay() {return adminDay;}
    public int getAdminMonth() {return adminMonth;}
    public int getAdminYear() {return adminYear;}
    public String getPcp() {return pcp;}
    public boolean getInsurance() {return insurance;}
    public String getChart() {return chart;}
    public String getEvent() {return event;}

    public void setfname(String fname)
    {
        this.patientFName = fname;
    }
    public void setlname(String lname) { this.patientLName = lname; }
    public void setSSN(String SSN) { this.SSN = SSN; }
    public void setMRN(String MRN) { this.MRN = MRN; }
    public void setAdminDay(int aDay) { this.adminDay = aDay; }
    public void setAdminMonth(int aMonth) { this.adminMonth = aMonth; }
    public void setAdminYear(int aYear) { this.adminYear = aYear; }
    public void setPcp(String pcp) { this.pcp = pcp; }
    public void setInsurance(boolean insurance) { this.insurance = insurance; }
    public void setChart(String chart) { this.chart = chart; }
    public void setEvent(String event) { this.event = event; }

    public void printPatient() {
        System.out.println("----------Info for patient: " + this.getPatientFName() + "-----------");
        System.out.println("First name: " + this.getPatientLName());
        System.out.println("Last name: " + this.getSSN());
        System.out.println("Admission date: " + this.getAdminMonth() + "/" + this.getAdminDay() + "/" + this.getAdminYear());
        System.out.println("PCP: " + this.getPcp());
        System.out.println("Insured?: " + this.getInsurance());
        System.out.println("Chart: " + this.getChart());
        System.out.println("Upcoming event: " + this.getEvent());
    }
    /*
    public void formatDate(int day, int month, int year) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern( );

    }*/
    

}
