class hero {
    String name;
    int maxhp;
    int attackPower;
    int heroSkill;
    int money;

    public hero(String name,int maxhp, int attackPower, int heroSkill, int money){
        this.name= name;
        this.maxhp= maxhp;
        this.attackPower = attackPower;
        this.heroSkill= heroSkill;
        this.money= money;
    }
    public  void attack (monster monster1){
        monster1.maxhp -= attackPower;
        System.out.println(this.name + " нанес " + monster1.name + " урон " + this.attackPower);
        System.out.println(" У монстра " + monster1.name + " осталось " + monster1.maxhp + " единиц здоровья");

    }

}
