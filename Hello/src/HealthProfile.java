import java.util.ArrayList;

public class HealthProfile {

    private String name;
    private String LastName;
    private String gender;
    private Integer birthDay;
    private Integer birthMonth;
    private Integer birthYear;
    private Double height;
    private Double weight;

    public HealthProfile(String name, String lastName, String gender, Integer birthDay, Integer birthMonth, Integer
            birthYear, Double height, Double weight) {
        this.name = name;
        LastName = lastName;
        this.gender = gender;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return LastName;
    }

    public String getGender() {
        return gender;
    }

    public Integer getBirthDay() {
        return birthDay;
    }

    public Integer getBirthMonth() {
        return birthMonth;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
    }

    public void setBirthMOnth(Integer birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public static Integer ageCalculation(Integer year) {
        return 2019 - year;
    }

    public static Integer maxHeartRate(Integer age) {
        return 220 - age;
    }

    public static Double targetHeartRate(Integer maxRate) {
        return 0.80 * maxRate;
    }

    public static ArrayList completeName(String name) {
        String[] parts = name.split(" ");
        ArrayList outputName = new ArrayList();
        outputName.add(parts[0]);
        outputName.add(parts[1]);
        return outputName;
    }

    public static ArrayList birthDate(String birthday) {
        String[] parts = birthday.split("/");
        ArrayList outputDate = new ArrayList();
        outputDate.add(Integer.valueOf(parts[0]));
        outputDate.add(Integer.valueOf(parts[1]));
        outputDate.add(Integer.valueOf(parts[2]));
        return outputDate;
    }

    public static Double imc(Double height, Double mass) {
        return mass / (height * height);
    }
}


