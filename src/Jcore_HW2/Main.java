package Jcore_HW2;

public class Main {

    public static void main(String[] args) {

        String[][] wrongArr = new String[4][4];

        try {
            sumElement(wrongArr);
        } catch (SizeException | DateException ex) {
            System.out.println(ex.getMessage());
        }

        String[][] myArray = new String[][]{{"1", "2", "3", "4"}, {"4", "1", "2", "3"}, {"3", "4", "1", "2"}, {"2", "3", "4", "1"}};

        try {
            System.out.println(sumElement(myArray));
        } catch (SizeException | DateException ex) {
            System.out.println(ex.getMessage());
        }
    }

        //Метод , на вход которого массив 4х4
        public static int sumElement (String[][] myArray) throws SizeException, DateException {
            if (myArray.length != 4) {
                throw new SizeException();
            }

            int sum = 0;
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i].length != 4) {
                    throw new SizeException();
                }

                for (int j = 0; j < myArray[i].length; j++) {
                    try {
                        int element = Integer.parseInt(myArray[i][j]);
                        sum += element;
                    } catch (NumberFormatException exception) {
                        throw new DateException(i, j);
                    }
                }
            }
            return sum;
        }
    }
