/*package dataShowcase;

import java.util.Comparator;

public class Record {
    String name;
    int yearOfRelease, duration;
    double rating;

    public Record(String name, int yearOfRelease, int duration, double rating) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.duration = duration;
        this.rating = rating;
    }

    /**
     * @return data objektu tak, aby sla vlozit do JTable

    public String[] returnAsTableRow(){
        return new String[]{name, String.valueOf(yearOfRelease), String.valueOf(rating), String.valueOf(duration)};
    }

    public static Comparator<Record> byName = new Comparator<Record>() {
        @Override
        public int compare(Record o1, Record o2) {
            return o1.name.compareTo(o2.name);
        }
    };

    public static Comparator<Record> byRelease = new Comparator<Record>() {
        @Override
        public int compare(Record o1, Record o2) {
            return Integer.compare(o1.yearOfRelease, o2.yearOfRelease);
        }
    };

    public static Comparator<Record> byRating = new Comparator<Record>() {
        @Override
        public int compare(Record o1, Record o2) {
            return Double.compare(o1.rating, o2.rating);
        }
    };

    public static Comparator<Record> byDuration = new Comparator<Record>() {
        @Override
        public int compare(Record o1, Record o2) {
            return Double.compare(o1.duration, o2.duration);
        }
    };
}*/
