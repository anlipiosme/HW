public class Main {
    public static void main(String[] args) {
        String[][] correctArray = {
                {"99", "15", "3", "8"},
                {"11", "78", "36", "4"},
                {"6", "84", "23", "43"},
                {"25", "14", "154", "58"}
        };

        String[][] incorrectSizeArray = {
                {"26", "62", "978"},
                {"54", "521", "21"},
                {"5", "2", "94"},
                {"41", "2", "41"}
        };

        String[][] incorrectDataArray = {
                {"44", "11", "22", "88"},
                {"66", "77", "м", "22"},
                {"33", "88", "77", "55"},
                {"44", "99", "55", "66"}
        };


        try {
            ArrayExceptions.checkAndSumArray(incorrectSizeArray);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        try {
            ArrayExceptions.checkAndSumArray(correctArray);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        try {
            ArrayExceptions.checkAndSumArray(incorrectDataArray);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}