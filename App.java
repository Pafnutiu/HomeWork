package HomeWork_1;

public class App {
    public static void main(String[] args){
        Team team=new Team("Uniors");
        Course c=new Course();
        team.teamInfoAll();
        c.doIt(team);
        team.showResults();
    }
}
