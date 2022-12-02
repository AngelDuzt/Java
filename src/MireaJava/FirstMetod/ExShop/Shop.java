package MireaJava.FirstMetod.ExShop;
import java.util.*;

public class Shop {

    ArrayList <String> Computers = new ArrayList<>();
    public static void main(String[] args) {
        Shop obj = new Shop();
        System.out.println("Здравствуйте, вас приветствует консультант Иван, выберети какую из операций вы хотите провести:");
        System.out.println("0. Выход");
        System.out.println("1. Поиск необходимого устройства");
        System.out.println("2. Добавление нового устройства");
        System.out.println("3. Удаление необходимого устройства");
        Scanner sc = new Scanner(System.in);
        String answer = "123456";
        do{
            System.out.println("Введите операцию");
            do {
                answer = sc.nextLine();
                if(!answer.equals("0") && !answer.equals("1") && !answer.equals("2") && !answer.equals("3")){
                    System.out.println("Команда не найдена, повторите попытку");
                }
            }
            while(!answer.equals("0") && !answer.equals("1") && !answer.equals("2") && !answer.equals("3"));
            if(!answer.equals("0")) {
                System.out.println(("Введите имя устройства"));
            }
            String comp = sc.nextLine();
            if (answer.equals("1")){
                if(obj.SearchComputer(comp) == 1){
                    System.out.println("Компьютер найден");
                }
                else{
                    System.out.println("Компьютер не найден");
                }
            }
            if(answer.equals("2")){
                obj.AddComputer(comp);
                System.out.println("Устройство добавлено");
            }
            if (answer.equals("3")){
                obj.DeleteComputer(comp);
                System.out.println("Устройство удалено");
            }
        } while (! answer.equals("0"));
    }
    public void AddComputer(String name){
        Computers.add(name);
    }

    public void DeleteComputer(String name){
        Computers.remove(name);
    }

    public int SearchComputer(String name){
        if(Computers.contains(name)){
            return 1;
        }
        else{
            return 0;
        }
    }

}
