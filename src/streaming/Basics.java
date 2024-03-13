package streaming;

import java.io.*;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            System.out.println(sc.nextLine());
//        }

        BufferedReader br = new BufferedReader(new FileReader(new File("Movies.txt")));

        br.close();
    }
}
