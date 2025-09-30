import MyArrayDataException.MyArrayDataException;
import MyArraySizeException.MyArraySizeException;

import javax.naming.SizeLimitExceededException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Main {
    public static Integer summ(String[][] arr){
        if (arr.length != 4){
            throw new MyArraySizeException("Размер двойного массива не соотвествует 4х4.");
        }
        for (int i = 0; i < 3; i++) {
            if (arr[i].length != 4){
                throw new MyArraySizeException("Размер двойного массива не соотвествует 4х4.");
            }
        }

        int summ = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    summ += Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("В ячейке " + i + ", " + j + " Неверные данные.");
                }
            }
        }
        return summ;
    }

    public static void main(String[] args) {
        String[][] deepArrStr =  {{"1","2"},{"5","6","7","8"},{"23","10","11","12"},{"13","14","15","16"}};
        try {
            System.out.println(summ(deepArrStr));
        } catch (MyArrayDataException e) {
            System.err.println("Ошибка типа данных");
        } catch (RuntimeException e) {
            System.out.println("Ошибка размерра массива " + e);
        }
    }
}

