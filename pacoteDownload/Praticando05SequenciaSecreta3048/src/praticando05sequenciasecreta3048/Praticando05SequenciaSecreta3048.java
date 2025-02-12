/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praticando05sequenciasecreta3048;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class Praticando05SequenciaSecreta3048 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Tamanho da sequência
        int[] sequence = new int[N];

        // Leitura da sequência
        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextInt();
        }

        scanner.close();

        int count = 1; // O primeiro número sempre é marcado
        int lastMarked = sequence[0];

        // Percorre a sequência marcando números sem repetir consecutivamente
        for (int i = 1; i < N; i++) {
            if (sequence[i] != lastMarked) {
                count++;
                lastMarked = sequence[i];
            }
        }

        System.out.println(count);
    }
    
}
