// import java.util.Scanner; - импорт класса Scanner из пакета java.util,
// который позволяет считывать ввод с клавиатуры.
import java.util.Scanner;
    public class Login_and_Password {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите логин: ");
            //String savedLogin = scanner.nextLine();
            // String savedPassword = scanner.nextLine(); - считывание строки
            // с клавиатуры и сохранение ее в переменную savedLogin.
            String savedLogin = scanner.nextLine();
            System.out.println("Введите пароль: ");
            String savedPassword = scanner.nextLine();

            // boolean isLoggedIn = false; - объявление переменной типа boolean с именем isLoggedIn
            // и присвоение ей значения false.
            boolean isLoggedIn = false;
            while (!isLoggedIn) {
                System.out.println("Введите логин ещё раз: ");
                String enteredLogin = scanner.nextLine();
                System.out.println("Введите пароль ещё раз: ");
                String enteredPassword = scanner.nextLine();

                // if (enteredLogin.equals(savedLogin) && enteredPassword.equals(savedPassword))
                // { - проверка условия, если значение
                // переменной enteredLogin равно значению переменной savedLogin//
                // и значение переменной enteredPassword равно значению переменной savedPassword,
                // то выполнить следующий блок кода.
                if (enteredLogin.equals(savedLogin) && enteredPassword.equals(savedPassword)) {
                    System.out.println("Вы успешно вошли в систему!");
                    isLoggedIn = true;
                } else {
                    System.out.println("Неверный логин или пароль. Попробуйте снова.");
                }

//scanner.close(); - закрытие объекта scanner, чтобы освободить ресурсы.
                scanner.close();
            }
        }
    }
