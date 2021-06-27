public class monster {
    String name;
    int maxhp;
    int attackPower;
    int heroSkill;
    int money;



    public monster(String name, int maxhphp, int attackPower, int heroSkill, int money) {
        this.name = name;
        this.maxhp = maxhp;
        this.attackPower = attackPower;
        this.heroSkill = heroSkill;
        this.money = money;

    }
    public void attack(hero hero){
        hero.maxhp -= attackPower;
        System.out.println(this.name + " нанес " + this.name + " урон " + this.attackPower);
        System.out.println("У героя " + this.name + " осталось " + this.maxhp + "  единиц здоровья ");
    }
}


