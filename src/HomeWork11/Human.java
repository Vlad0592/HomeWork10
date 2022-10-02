package HomeWork11;

import java.time.LocalDate;

public class Human {
    private String name;
    private int yearOfBirth;
    private String town;
    private String job;
    //ffgjfg

    public String getName() {
        return this.name;
    }

    public String getTown() {
        return this.town;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public String getJob() {
        return this.job;
    }

    public void setTown(String town) {
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = LocalDate.now().getYear() - yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    @Override
    public String toString() {
        return " Привет! Меня зовут " + name + " Я из города " + town + "   мне  " + yearOfBirth + " Я работаю на должности. " + job + " Будем знакомы! ";
    }

    public Human(String name1, String town1, int yearOfBirth1, String job1) {
        name = name1;
        town = town1;
        yearOfBirth = yearOfBirth1;
        job = job1;

        if(name==null){
            this.name = "Информация не указана";
        }else {

             this.town = town;
            }
            if (yearOfBirth >= 0) {
                this.yearOfBirth = 2022 - yearOfBirth;
                this.yearOfBirth =  LocalDate.now().getYear() - yearOfBirth;
            } else {
                this.yearOfBirth = 0;
            }



    }

}
