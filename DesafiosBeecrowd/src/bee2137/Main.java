package bee2137;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()){
            int quantCodigo = scan.nextInt();
            List<String> codigos = new ArrayList<>();

            for (int i = 0; i < quantCodigo; i++) {
                codigos.add(scan.next());
            }

            Collections.sort(codigos);

            for (String codigo: codigos){
                System.out.println(codigo);
            }
        }
        scan.close();
    }
}