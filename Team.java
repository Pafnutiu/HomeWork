package HomeWork_1;

public class Team {
   String name;
   String Participant[] = new String[4];
    int Rezult;

    public Team(String name){
        this.name=name;
        this.Participant[0]="Ivanov Ivan";
        this.Participant[1]="Petrov Petr";
        this.Participant[2]="Sergeev Sergey";
        this.Participant[3]="Usov Leonid";
        this.Rezult=0;
    }

    public void showResults(){
        if (Rezult<200) {
            System.out.println("Команда " + name + " с количеством балов " + Rezult + " не прошла полосу препятствий");
        } else {System.out.println("Команда " + name + " с количеством балов " + Rezult + " прошла полосу препятствий");}
    }

    public void teamInfoAll(){
        System.out.println("Состав команды: " + name);
        for (int i=0;i<4;i++) {
            System.out.println(i+1 + " " + Participant[i]);
        }
        System.out.println();
    }
}
