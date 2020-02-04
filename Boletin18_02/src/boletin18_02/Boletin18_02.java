/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_02;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class Boletin18_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos alumnos = new Metodos();
        int resposta;
        alumnos.notas();
        do {
            System.out.println("Que queres facer?"
                    + "\n 1.-Buscar a nota dun alumno determinado"
                    + "\n 2.-Mostrar os nomes dos alumnos aprobados"
                    + "\n 3.-Ordenar notas"
                    + ""
                    + ""
                    + "\n 0.-Saír");
            Scanner sc = new Scanner(System.in);
            resposta = sc.nextInt();
            switch (resposta) {
                case 1:
                    alumnos.buscarAlumnoNota();
                    break;
                case 2:
                    alumnos.nomeAprobados();
                    break;
                case 3:
                    alumnos.ordenarNotas();
                    break;
                case 4:
                    
            }
        } while (resposta != 0);

    }

}
