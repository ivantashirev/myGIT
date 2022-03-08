package Jcore_HW2;

public class DateException extends Exception{
    private int row;
    private int column;

    public DateException(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String getMessage() {
        return "Incorrect date in massive: x = " + row + " y = " + column;
    }
}
