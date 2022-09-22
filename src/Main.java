public class Main {

    public static String resultFio(Human[] human) {

        String result = human[0].getName();
        for (int i = 1; i < human.length; i++) {


            System.out.println(human[i].getName());


        }
        return result;
    }

    public static String resultAllHumanDatails(Human[] human) {
        for (int i = 0; i < Main.human.length; i++)
            System.out.println(Main.human[i].toString());

        return null;
    }

    public static Human[] human = new Human[4];

    public static void main(String[] args) {
        Human e = new Human("Максим", "Минск", 35," Бренд-менеджером ");
        Human e2 = new Human("Аня", " Москва", 29, " Методистом образовательных программ ");
        Human e3 = new Human("Катя", " Калининград", 28, " Продакт-менеджером ");
        Human e4 = new Human("Артем", " Москва", 27, " Директором по развитию бизнеса ");
        human[0] = e;
        human[1] = e2;
        human[2] = e3;
        human[3] = e4;
        System.out.println(resultAllHumanDatails(human));
        System.out.println(resultFio(human));
    }
}