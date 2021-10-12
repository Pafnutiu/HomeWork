package Work3;

public class AppMain {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        myArrays();
        System.out.println();
        System.out.println("Задание 2");
        myBoxes();
    }

    private static void myArrays(){
        String[] names = {"Sasha","Masha","Petya","Vasya"};

        for (int i=0;i< names.length;i++){
            System.out.print(names[i]+" ");
        }
        System.out.println();
        System.out.println("___________________________________ ");

        String temp=names[0];
        names[0]=names[3];
        names[3]=temp;

        for (int i=0;i< names.length;i++){
        System.out.print(names[i]+" ");
        }


    }

    private static void myBoxes(){
        Box<Apple> appleBox=new Box<Apple>(1);
        Box<Apple> appleBox2=new Box<Apple>(1);
        Box<Orange> orangeBox=new Box<Orange>(1.5);

        for (int i=0;i<3;i++){
            orangeBox.addFruit(new Orange());
            appleBox.addFruit(new Apple());
            appleBox2.addFruit(new Apple());
        }
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        appleBox2.addFruit(new Apple());

        System.out.println("Вес коробки с яблоками: "+appleBox.getBoxWeight());
        System.out.println("Вес коробки с апельсинами: "+orangeBox.getBoxWeight());
        System.out.println("Результат сравнения коробок - : "+appleBox.compare(orangeBox));

        appleBox.addFruits(appleBox2);
    }
}
