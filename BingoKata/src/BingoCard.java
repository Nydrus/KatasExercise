import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BingoCard {

    private List<Integer> numbers = new ArrayList<Integer>();
    private Column[] columns = {
            new Column("B", 1, 5, 1, 15),
            new Column("I", 6, 10, 16, 30),
            new Column("N", 11, 14, 31, 45),
            new Column("G", 15, 19, 46, 60),
            new Column("O", 20, 24, 61, 75),
    };

    public String[] getCard() {
        return new BingoCard().cardGrid();
    }

    public String[] cardGrid() {
        ArrayList<String> cards = new ArrayList<>();
        for (Column column : columns) {
            for (int cellNumber = column.startCell; cellNumber <= column.endCell; cellNumber++) {
                cards.add(getCell(cellNumber));
                System.out.println(cards);
            }
        }
        return cards.toArray(new String[0]);
    }

    private String getCell(int cellNumber) {
        int index = cellNumber - 1;
        Cell cell = new Cell("", 0);
        for (Column column : columns) {
            if (cellNumber >= column.startCell && cellNumber <= column.endCell) {
                numbers.add(index, randomNumber(column.startValue, column.endValue));
                cell.word = column.word;
                cell.number = numbers.get(index);
            }
        }
        return getCellFormat(cell);
    }

    private String getCellFormat(Cell cell) {
        return String.format("%s%d", cell.word, cell.number);
    }

    private int randomNumber(int min, int max) {
        int random = min + new Random().nextInt(max - min + 1);
        return numbers.contains(random) ? randomNumber(min, max) : random;
    }

    private static class Cell {
        String word;
        int number;

        public Cell(String word, int number) {
            this.word = word;
            this.number = number;
        }
    }

    public static class Column {
        String word;
        int startCell;
        int endCell;
        int startValue;
        int endValue;

        public Column(String word, int startCell, int endCell, int startValue, int endValue) {
            this.word = word;
            this.startCell = startCell;
            this.endCell = endCell;
            this.startValue = startValue;
            this.endValue = endValue;
        }
    }
}
