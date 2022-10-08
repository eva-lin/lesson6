import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //Задание 1-4
        System.out.println("Задание 1-4");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " "+ firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        String fullNameReport = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+ fullNameReport);

        String fullNameAdmin = fullName.replace(' ', ';');
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullNameAdmin);

        if (fullName.contains("ё")){
            fullName = fullName.replace('ё','е');
        }
        System.out.println("ФИО сотрудника — " + fullName);

        //Задание 5
        System.out.println("Задание 5");
        fullName = "Ivanov Ivan Ivanovich";
        String [] part = fullName.split(" ");
        lastName = part[0];
        firstName = part[1];
        middleName = part[2];
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);

        //Задание 6
        System.out.println("Задание 6");
        fullName = "ivanov ivan ivanovich";
        char[] fullNameChange = fullName.toCharArray();
        for (int i = 0; i < fullNameChange.length; i++){
            if ( i == 0 || fullNameChange[i-1] == ' '){
                fullNameChange[i] = Character.toUpperCase(fullNameChange[i]);
            }
        }
        fullName = new String(fullNameChange);
        System.out.println(fullName);

        //Задание 7
        System.out.println("Задание 7");

        String firstString = "135";
        String secondString = "246";
        StringBuilder resultString = new StringBuilder();
        for (int i=0; i<firstString.length();i++){
            resultString.append(firstString.charAt(i));
            resultString.append(secondString.charAt(i));
        }
        System.out.println("Данные строки - " + resultString);

        //Задание 8
        System.out.println("Задание 8");
        StringBuilder alph = new StringBuilder("aabccddefgghiijjkk");
        for(int i=0; i<alph.length(); i++){
              for (int j = i+1; j<alph.length();j++){
                  if (alph.charAt(i) == alph.charAt(j)){
                      alph.deleteCharAt(j);
                  }
              }
        }
        System.out.println(alph);

    }

}