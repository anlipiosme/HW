public class ArrayExceptions {
    public static void checkAndSumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("У массива должно быть 4 колонки и 4 строки. А тут " + array.length + " строки");
        }
        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyArraySizeException("У массива должно быть 4 колонки и 4 строки. А тут " + row.length + " колонки");
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не могу посчитать. В ячейке (" + i + "," + j + ") не число");
                }
            }
        }
        System.out.println("Сумма массива: " + sum);
    }
}
