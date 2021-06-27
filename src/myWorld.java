import java.util.Scanner;

public class myWorld {
   private static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        hero hero= new hero("Buch",36,3,6,15000);

        monster monster1 = new monster("Goblin",46,1,3,2000);;
        monster  monster2 = new monster("Skeleton", 20,2,2,5000);

        while (true){
        System.out.println("Добро пожаловать в мой мир");
        System.out.println("Начнем наше путешествие"+ hero  +"Приветсвуем вас!");
        System.out.println(" Куда вы хотиите пройти");
        System.out.println("1 К торговцу");
        System.out.println("2 В темный лес");
        System.out.println("3 На выход ");

        String input= sc.next();
        if(input.equals("1")){
            System.out.println("Торговец еще не вышел на работу, попробуйте позже ");
        }

        if(input.equals("2")) {
            System.out.println(" Добро пожаловать в лес ");
            System.out.println("\n Ход героя "+ hero.name);
            hero.attack(monster1);

            if (monster1.maxhp >= 0) {
                System.out.println(hero.name + " победил монстра " + monster1.name);

            }else  if(monster1.maxhp < 0){
                System.out.println(hero.name + " проиграл монстру " + monster1.name);
                break;
            }

            System.out.println("\n Ход монстра "+ monster1.name);
            monster1.attack(hero);
            if (hero.maxhp >= 0) {
                System.out.println(monster1.name + " победил героя " + hero.name);

            }else  if(hero.maxhp < 0){
                System.out.println(monster1.name + " проиграл герою " + hero.name);
                break;

            }
        }
        if(input.equals("3")){
            System.out.println("Возвращайтесь! Мы будем вас ждать! ");
        }

}
}
}



