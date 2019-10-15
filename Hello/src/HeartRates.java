import java.util.ArrayList;

public class HeartRates {
    private String name;
    private String lastName;
    private Integer birthDay;
    private Integer birthMonth;
    private Integer birthYear;

    public HeartRates(String name, String lastName, Integer birthDay, Integer birthMonth, Integer birthYear) {
        this.name = name;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
    }

    public void setBirthMonth(Integer birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
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
}
