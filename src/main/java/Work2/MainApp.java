package Work2;

public class MainApp {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] stringArray={
                {"1","2","3","4"},
                {"5","P","7","2"},
                {"1","2","3","4"},
                {"1","2","3","4"}};
        transformToInt(stringArray);
    }
    public static void transformToInt(String[][] myArray) throws MyArraySizeException, MyArrayDataException {

        for (int i=0;i< myArray.length;i++) {
            if (myArray.length != 4 || myArray[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
         int Sum=0;
            for (int i=0;i< myArray.length;i++) {
                for (int j = 0; j < myArray[i].length; j++) {
                    try {
                        Sum += Integer.parseInt(myArray[i][j]);
                    } catch (NumberFormatException ex) {
                        throw new MyArrayDataException(i, j);
                    }
            }
            System.out.println(Sum);
        }
    }
}

