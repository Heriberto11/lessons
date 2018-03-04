package com.lessons.part2;

public class E8alumno {
    public static void main(String[] args) {
        //Para la preparación de las pruebas de ingreso un alumno debe resolver N problemas de un determinado tema.
        // Si el estudiante resolvió el 40% de los mismos y de los restantes,
        // P/Q (fracción propia) de los mismos, cuántos ejercicios resolvió en total  ?

        int preguntas = 20;
        double preguntas2 = preguntas * .4;
        double preguntas3 = preguntas2 * .4;
        double preguntasresueltas = preguntas2 + preguntas3;

        System.out.println(Math.round(preguntasresueltas));


    }
}
