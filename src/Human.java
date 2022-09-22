public class Human {
    private String name;
    private int yearOfBirth;
    private String town;
    private String  job;

    public String getName() {
        return this.name;
    }

    public String getTown() {
        return this.town;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public String getName() {
        return this.job;
    }

    @Override
    public String toString() {
        return " Привет! Меня зовут " + name + " Я из города " + town + "   мне  " + yearOfBirth + "  Будем знакомы! ";
    }

    public Human(String name1, String town1, int yearOfBirth1) {
        name = name1;
        town = town1;
        yearOfBirth = yearOfBirth1;
        job = job1;


    }
}
