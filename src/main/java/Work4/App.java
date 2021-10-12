package Work4;

public class App {
    public static void main(String[] args) {
        WordsCount wordsCount=new WordsCount(createWords());
        wordsCount.findWordsInArray();
    }
    private static String[] createWords(){
        String[] slova=new String[10];
        slova[0]="two";
        slova[1]="two";
        slova[2]="two";
        slova[3]="two";
        slova[4]="lohoh";
        slova[5]="bob";
        slova[6]="seven";
        slova[7]="world";
        slova[8]="tree";
        slova[9]="pups";
        return slova;
    }
}
