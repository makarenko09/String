public class Main {
    public static void main(String[] args) {
//task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        System.out.println("Ф.И.О. сотрудника -- " + lastName + " " + firstName + " " + middleName);
//task 2
        String fullNameTaskTwo = " " + lastName + " " + firstName + " " + middleName + " ";
        String initials = fullNameTaskTwo.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета -- " + initials);
//task 3
        String fullName = "Иванов Семён Семёнович";
        // Замена "ё" на "е"
        String modifiedName = fullName.replace("ё", "е");

        System.out.println("Оригинальная строка: " + fullName);
        System.out.println("Модифицированная строка: " + modifiedName);


    }
}