package Two;
/*
- Создать класс `UserAuthenticator`. Создать статический метод который принимает на вход три параметра: `login`, `password` и `confirmPassword`.

Правила для `login`:
- Должен содержать только латинские буквы, цифры.
- Длина должна быть меньше 20 символов.

Если `login` не соответствует этим требованиям, необходимо выбросить `WrongLoginException`.

Правила для `password`:
- должен содержать только латинские буквы, цифры и знак подчеркивания.
- Длина должна быть меньше 20 символов.
- `password` и `confirmPassword` должны быть равны.

Если `password` не соответствует этим требованиям, необходимо выбросить `WrongPasswordException`.

`WrongPasswordException` и `WrongLoginException` - пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception. Обработка исключений проводится вне метода (В сигнатуре метода должно быть указано что он может бросить исключения). Используем `multi-catch block`. Метод возвращает `true`, если значения верны или `false`
 в другом случае.
 */
public class UserAuthenticator {
    public static void userAuthorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches(("^[a-zA-Z0-9]+$"))) {
            throw new WrongLoginException("Restricted numbers");
        }
        System.out.print("Right numbers in login");
        if (login.length() > 20) {
            throw new WrongLoginException("NOT MORE THEN 20 SYMBOLS");
        } else {
            System.out.println("WRONG LOGIN");
        }
        System.out.print("Right size in login");
        if (!password.matches(("^[a-zA-Z0-9_]+$"))) {
            throw new WrongPasswordException("PASsWORD CONTAINS UNRESOLVED SYMBOLS");
        }
        System.out.print("Right numbers in password");
        if (password.length() > 20) {
            throw new WrongPasswordException("PASSWORD SIZE IS MOR THEN 20");
        } else {
            System.out.println("WRONG PASSWORD");
        }
        System.out.print("Right size in password");
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("PASSWORDS AREN`t THE SAME");
        } else {
            System.out.println("END OF REGISTRATION");
        }


    }
}
