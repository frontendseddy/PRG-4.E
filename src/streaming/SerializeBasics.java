package streaming;

import javax.sound.midi.Track;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializeBasics {
    public static void main(String[] args) {
        Tracks m = new Tracks("The Gentlemen", 2019, 9.5);
//        System.out.println(m.toString());
        //serializace:
        try {
            FileOutputStream fileOutStr = new FileOutputStream("mov.ser");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutStr);
            List<Tracks> tracks = new ArrayList<>();

            outputStream.writeObject(m);//hod objekt do souboru


            outputStream.close();
            fileOutStr.close();

        } catch (IOException ioException) {
            System.out.println("Error: " + ioException.getMessage());
        }

        //deserializace
        try {
            FileInputStream fileInStr = new FileInputStream("mov.ser");
            ObjectInputStream inputStream = new ObjectInputStream(fileInStr);
//            Object des = inputStream.readObject();
//            if (des instanceof Tracks){
//                Tracks deserialized = (Tracks) des;
//            }
            Tracks deserialized = (Tracks) inputStream.readObject();
            inputStream.close();
            fileInStr.close();
            System.out.println("Deserialization OK:");
            System.out.println(deserialized);
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
class Tracks implements Serializable {
    private String name;
    private int year;
    private double release;

    public Tracks(String name, int year, double release) {
        this.name = name;
        this.year = year;
        this.release = release;
    }

    @Override
    public String toString() {
        return "Tracks{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", release=" + release +
                '}';
    }
}
