import java.util.Date;
import java.util.Objects;

public class Passport {
    //«Номер паспорта» (уникальное, неповторяющееся значение);
//«Фамилия»;
//«Имя»;
//«Отчество» (если имеется; может быть пустым);
//«Дата рождения».
    private final Integer numberPassport;
    private final String surName;
    private final String name;
    private final String patronymic;
    private final String date;

    public Passport(Integer numberPassport, String surName, String name, String patronymic, String date) {
        this.numberPassport = numberPassport;
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.date = date;
    }

    public Integer getNumberPassport() {
        return numberPassport;
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passport passport)) return false;
        return numberPassport.equals(passport.numberPassport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberPassport);
    }

    @Override
    public String toString() {
        return "Паспорт{" +
                " Фамилия='" + surName + '\'' +
                ", Имя='" + name + '\'' +
                ", отчество='" + patronymic + '\'' +
                ", дата рождения='" + date + '\'' +
                '}';
    }
}
