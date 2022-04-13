package lesson5;

public class Main {

    public static void main(String[] args) {
        Employee firstEmployee = new Employee("Иванов И.А.", "электрик", "ivanov@mail.ru", 89876544545L, 60000, 31);

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Щепетов Д.О.", "директор", "denis@mail.ru", 89876545678L, 100000, 33);
        empArray[1] = new Employee("Иванова Ю.А.", "уборщица", "iva@mail.ru", 89865676565L, 20000, 56);
        empArray[2] = new Employee("Кокина Л.Ю.", "инженер", "qwer@mail.ru", 89879999999L, 40000, 40);
        empArray[3] = new Employee("Губанова Ю.А.", "специалист", "ivarit@mail.ru", 89865677655L, 50000, 25);
        empArray[4] = new Employee("Бубнова Л.Ю.", "бухгалтер", "qwerghrkgh@mail.ru", 89879345999L, 55000, 29);
        int i;
        for (i = 0; i < empArray.length; i++) {
            if (empArray[i].age > 40) {
                empArray[i].employeeInfo();

            }
        }
    }
}
