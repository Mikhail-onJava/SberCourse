package ProfModulTest1;

public class StudTest {

    public static void main(String[] args) {
        Person[] studentk = new Person[2];
        studentk[0] = new Person("Олег", "Фёдоров");
        studentk[1] = new Person("Игорь", "Логинов");
        studentk[0].setGrades();
        studentk[1].setGrades();
        double average1 = studentk[0].averageGrade();
        double average2 = studentk[1].averageGrade();
        //  System.out.println(studentk[0].name + " " + studentk[0].surname + " " + average1);
        // System.out.println(studentk[1].name + " " + studentk[1].surname + " " + average2);

        try {
            Person.compare(average1, average2);
        } catch (MyCheckedException e) {
            System.out.println(e.getMessage());
        }
        if (average1 > average2) {
            System.out.println("Победитель - " + studentk[0].name + " " + studentk[0].surname);
        } else if (average1 < average2) {
            System.out.println("Победитель - " + studentk[1].name + " " + studentk[1].surname);
        }
    }
}

class Person {
    public String name;
    public String surname;
    private int[] grades = new int[2];

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setGrades() {
        for (int i = 0; i < grades.length; i++) {
            grades[i] = 1 + (int) (Math.random() * 4);
            // System.out.print(" " + grades[i]);
        }
    }

    public double averageGrade() { // средний бал
        double sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        System.out.println("Средний бал студента  " + name + " " + surname + " " + "равен " + (sum / grades.length));
        return sum;
    }

    public static void compare(double average1, double average2) throws MyCheckedException {
        System.out.println("Ищем победителя!");
        if (!(average1 == average2)) {
            System.out.println("Есть победитель");
        } else {
            throw new MyCheckedException();
        }
    }
}

