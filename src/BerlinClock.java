import java.util.stream.IntStream;

public class BerlinClock {
public String berlinClock(int hours, int minutes, int seconds) {
    return  getHours(hours) + " " + getMinutes(minutes) + " " + getSeconds(seconds);
}
    protected String getSeconds(int seconds) {
        System.out.println("Seconds: " + seconds);
        return seconds % 2 == 0 ? "Y" : "0";
    }

    protected String getHours(int hours) {
    int numberTopHourLamps = hours / 5;
    int numberBottomHourLamps = hours % 5;
        StringBuilder sb = new StringBuilder();
        sb.append(getLampRow(4,numberTopHourLamps, "R"))
                        .append(" ")
                                .append(getLampRow(4,numberBottomHourLamps,"R"));
        System.out.println("Hours: " + hours);
        return sb.toString();
    }
    protected String getMinutes(int minutes) {
        int numberBottomMinutesLamps = minutes % 5;
        int numberOfTopMinutesLamps = minutes / 5;
        StringBuilder sb = new StringBuilder();
        IntStream.rangeClosed(1,11)
                .forEach(i -> sb.append(i <= numberOfTopMinutesLamps ? getMinuteLampColour(i) : "0"));

        sb.append(" ");
        sb.append(getLampRow(4, numberBottomMinutesLamps, "Y"));
        System.out.println("Minutes: " + minutes);
        return sb.toString();
    }

    private String getLampRow(int totalNumberLamps, int numberLampsOn, String lampSymbol) {
    StringBuilder sb = new StringBuilder();
    IntStream.rangeClosed(1,totalNumberLamps)
            .forEach(i -> sb.append(i <= numberLampsOn ? lampSymbol : "0"));
        System.out.println("Number of Lamps On: " + numberLampsOn +" " + lampSymbol);
        return sb.toString();
    }

    private String getMinuteLampColour (int index) {
    return index % 3 == 0 ? "R" : "Y";
    }
}
