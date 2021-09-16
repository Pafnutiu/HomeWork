package HomeWork_1;
import java.util.Random;
public class Course {
    String courseArray[]=new String[4];
    public static Random random = new Random();
    public int PointTeam=0;

    public Course(){
        this.courseArray[0]="Sprint";
        this.courseArray[1]="Swimm";
        this.courseArray[2]="Long Jump";
        this.courseArray[3]="High Jump";
        this.PointTeam=0;
    }
    public void doIt(Team team){
        int PointTeamtmp=0;
        //int PointTeam=0;
        System.out.println("Команда " + team.name + " начала проходить препятствия");
        for (int i=0;i<4;i++){
            PointTeamtmp=randomIntRange(10,100);
            System.out.println("Участник " + team.Participant[i] + " проходит испытание: " + courseArray[i] + " и получает " + PointTeamtmp + " очков");
            PointTeam=PointTeamtmp+PointTeam;
        }
        team.Rezult=PointTeam;
        System.out.println("Команда набрала " + PointTeam + " очков");
                }

    public static int randomIntRange(int min, int max) {
        int diff = max - min;
        int value = random.nextInt(diff + 1);
        return min + value;
    }
    }
