package product;

public class Student {
    private int idSV;
    private String nameSV;
    private int ageSV;
    private String sexSV;
    private String addressSV;
    private double averageScoreSV;

    public Student() {
    }

    public Student(int idSV, String nameSV, int ageSV, String sexSV, String addressSV, double averageScoreSV) {
        this.idSV = idSV;
        this.nameSV = nameSV;
        this.ageSV = ageSV;
        this.sexSV = sexSV;
        this.addressSV = addressSV;
        this.averageScoreSV = averageScoreSV;
    }

    public int getIdSV() {
        return idSV;
    }

    public void setIdSV(int idSV) {
        this.idSV = idSV;
    }

    public String getNameSV() {
        return nameSV;
    }

    public void setNameSV(String nameSV) {
        this.nameSV = nameSV;
    }

    public int getAgeSV() {
        return ageSV;
    }

    public void setAgeSV(int ageSV) {
        this.ageSV = ageSV;
    }

    public String getSexSV() {
        return sexSV;
    }

    public void setSexSV(String sexSV) {
        this.sexSV = sexSV;
    }

    public String getAddressSV() {
        return addressSV;
    }

    public void setAddressSV(String addressSV) {
        this.addressSV = addressSV;
    }

    public double getAverageScoreSV() {
        return averageScoreSV;
    }

    public void setAverageScoreSV(double averageScoreSV) {
        this.averageScoreSV = averageScoreSV;
    }

    //int idSV, String nameSV, int ageSV, String sexSV, String addressSV, double averageScoreSV

    public static Student parse(String record) {
        String[] fields = record.split(",");
        int id = Integer.parseInt(fields[0]);
        String name = fields[1];
        int age = Integer.parseInt(fields[2]);
        String sex = fields[3];
        String address = fields[4];
        double averageScore = Double.parseDouble(fields[5]) ;
        return new Student(id, name, age, sex, address, averageScore);
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s",
                idSV,
                nameSV,
                ageSV,
                sexSV,
                addressSV);
    }

}
