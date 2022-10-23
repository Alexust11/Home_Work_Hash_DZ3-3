import java.util.*;

public class Main {
    private static final Set<Passport> passportList = new HashSet<>();


    public static void main(String[] args) {
//        Задание 3
//        В некоторых гос. структурах многих стран есть возможность вбить номер паспорта и получить информацию о том,
//        кому он принадлежит.
//        Напишите программу, которая содержит в себе упрощенный функционал этой системы.
//                Создайте класс Passport, содержащий в себе поля:
//«Номер паспорта» (уникальное, неповторяющееся значение);
//«Фамилия»;
//«Имя»;
//«Отчество» (если имеется; может быть пустым);
//«Дата рождения».
//        Выберите структуру данных, подходящую для хранения и получения (по номеру паспорта) объектов класса Passport.
//        Реализуйте 2 метода://
//        -Принимает объект класса Passport и сохраняет его в коллекцию. В случае если в коллекции уже есть паспорт
//        с данным номером, необходимо обновить остальные поля класса (фамилию, имя и т. д.)
//       - Принимает номер паспорта, ищет в коллекции объект с данным номером и возвращает весь объект.
//        Если объект не найден, возвращает null.
        Passport pasp1 = new Passport(123456, "Ivanov", "Ivan", "Ivanovich", "12.10.1999");
        Passport pasp2 = new Passport(323456, "Ivanov", "Ivan", "Ivanovich", "10.10.1999");
        Passport pasp3 = new Passport(123456, "Ivanov", "Petr", "Ivanovich", "06.10.1999");
        Passport pasp4 = new Passport(323459, "Kozlov", "Petr", "Ivanovich", "15.10.1999");

        addPassport(pasp1);
        addPassport(pasp1);
        addPassport(pasp3);
        addPassport(pasp4);
        addPassport(pasp2);
        System.out.println(passportList);
        getPassport(123455);

    }//_____________________________END____________________

    public static void addPassport(Passport passport) {

        for (Passport n : passportList) {
            if (passport.getNumberPassport().equals(n.getNumberPassport())) {
                passportList.remove(n);
                System.out.println("Номер паспорта повторяется, производится обновление данных ФИО и даты рождения. Удалена запись "+ n);

            }

        }
        passportList.add(passport);
    }

//

    //
    public static void getPassport(Integer number) {
            int count=0;
        for (Passport n : passportList) {
            if (n.getNumberPassport().equals(number)) {
                System.out.println(n);
            } else {
               count++;
            }
        }
        if (count>=passportList.size()) {
            System.out.println((String)null);
        }
    }
}