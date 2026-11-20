//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("\nHomework 10");

        System.out.println("\nЗадача 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("\nЗадача 2");

        String empFirstName = "Ivan";
        String empMiddleName = "Ivanovich";
        String empLastName = "Ivanov";
        String employeeFullName = empLastName + " " + empFirstName + " " + empMiddleName;

        String reportFullName = employeeFullName.toUpperCase();

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + reportFullName);

        System.out.println("\nЗадача 3");

        String employeeFio = "Иванов Семён Семёнович";
        String correctedFio = employeeFio.replace('ё', 'е');

        System.out.println("Данные Ф. И. О. сотрудника — " + correctedFio);
    }
}