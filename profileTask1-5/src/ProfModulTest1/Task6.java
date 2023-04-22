package ProfModulTest1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Task6 {
    public static void main(String[] args) throws Exception {
        FormValidator person = new FormValidator();
        String dateOfBirth = person.getDateOfBirth();
        String gender = person.getGender();
        String name = person.getName();
        String height = person.getHeight();
        FormValidator.checkGender(gender);
        FormValidator.checkName(name);
        FormValidator.checkHeight(height);
        FormValidator.checkBirthdate(dateOfBirth);
    }
}

class FormValidator {
    enum Gender {Male, Female}

    private String name = "Alex";
    private String dateOfBirth = "23-05-1987";
    private String gender = "Male";
    private String height = "178";  // NumberFormatException

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getHeight() {
        return height;
    }

    public static void checkBirthdate(String dateOfBirth) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        Date date = new Date(); // текущая дата
        // System.out.println(date);
        Date date1 = formatter.parse(dateOfBirth); // дата дня рождения
        // System.out.println(date1);
        Date date2 = formatter.parse("01-01-1900"); // дата из условия
        // System.out.println(date2);
        if (date1.after(date) || date1.before(date2)) {
            throw new Exception("Дата рождения не удовлетворяет условию");
        }
    }

    public static void checkGender(String gender) throws Exception {
        if (!(gender.matches(String.valueOf(Gender.Male)))) {
            throw new Exception("Ошибка, пол из списка не указан");
        }
    }

    public static void checkName(String name) throws Exception {
        if (name.length() < 2 || name.length() > 20) {
            throw new Exception("Длина строки не соответствует условию");
        } else if ('a' <= name.charAt(0) && name.charAt(0) <= 'z') {
            throw new Exception("Ошибка, имя начинается со строчной буквы");
        }
    }

    public static void checkHeight(String height) throws Exception {
        double i = Double.parseDouble(height.trim());
        if (i <= 0) {
            throw new Exception("Указан недопустимый рост");
        }
    }
}
