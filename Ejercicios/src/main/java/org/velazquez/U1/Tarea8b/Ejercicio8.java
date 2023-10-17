package org.velazquez.U1.Tarea8b;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Establecimiento de las variables para el cálculo de las horas

        int dia;
        int dia2;
        int hora1;
        int hora2;
        int soporte;
        int resultado;

        //Aplicamos primera variable para indicar el primer día
        System.out.println("Introduzca un día en número hasta el sábado, pues el programa ");
        System.out.println("no permite poner dos días iguales para su cálculo: ");
        dia = sc.nextInt();

        //Se aplica un while para indicar que mientras se ponga mal el día, seguirá diciendo que pongas
        //un día correcto
        while (dia < 1 || dia > 7) {

            System.out.println("Día incorrecto.");
            System.out.println("Por favor, introduzca un día correcto en número hasta el sábado, pues el programa ");
            System.out.println("no permite poner dos días iguales para su cálculo: ");
            dia = sc.nextInt();
        }

        //Aplicamos segundo variable para indicar el segundo día
        System.out.println("Introduzca un segundo día en número: ");
        dia2 = sc.nextInt();


        //Se aplica el mismo while para el segundo día, pero añadiendo que este no sea tampoco ni igual al
        //primer día ni que sea menor al primer día, ya que sino, no se pueden calcular las horas
        while (dia2 < 1 || dia2 > 7 || dia2 == dia || dia2 < dia) {

            System.out.println("Día incorrecto.");
            System.out.println("Por favor, introduzca un segundo día correcto en número: ");
            dia2 = sc.nextInt();
        }

        //Se aplica la siguiente variable para establecer una hora obligatoria
        System.out.println("Introduzca una hora sin minutos ni segundos: ");
        hora1 = sc.nextInt();

        //Se aplica un variable para avisar de que la hora debe estar en un rango de 1 a 24 horas
        while (hora1 < 1 || hora1 > 24) {

            System.out.println("Hora incorrecta.");
            System.out.println("Por favor, introduzca una hora correcta: ");
            hora1 = sc.nextInt();
        }

        //Se aplica la siguiente variable para indicar la segunda hora
        System.out.println("Introduzca una segunda hora sin minutos ni segundos: ");
        hora2 = sc.nextInt();

        //Se aplica otro while para dar el mismo aviso
        while (hora2 < 1 || hora2 > 24) {

            System.out.println("Hora incorrecta.");
            System.out.println("Por favor, introduzca una segunda hora correcta: ");
            hora2 = sc.nextInt();
        }

        //Se aplica un switch en el primer dia donde añadiremos en cada día un switch del segundo día
        //para poder calcular las horas que transcurren

        //Además, por cada switch del primer día, se resta uno más en el switch del segundo día, haciendo
        //mención a que el segundo día debe ser un número mayor al primer día como mínimo
        switch (dia) {
            case 1:
                switch (dia2) {
                    case 2:
                        //En cada switch del segundo día se aplica la misma fórmula para indicar el transcurso
                        //de las horas. por cada día aumentado, se añade a la suma 24 horas más
                       soporte = 24 - hora1;
                       resultado = soporte + hora2;
                        System.out.println("Del lunes al martes transcurren: "+resultado);
                        break;

                    case 3:
                        soporte = 24 - hora1;
                        resultado = soporte + 24 + hora2;
                        System.out.println("Del lunes al miércoles transcurren: "+resultado);
                        break;

                    case 4:
                        soporte = 24 - hora1;
                        resultado = soporte + 48 + hora2;
                        System.out.println("Del lunes al jueves transcurren: "+resultado);
                        break;

                    case 5:
                        soporte = 24 - hora1;
                        resultado = soporte + 72 + hora2;
                        System.out.println("Del lunes al viernes transcurren: "+resultado);
                        break;

                    case 6:
                        soporte = 24 - hora1;
                        resultado = soporte + 96 + hora2;
                        System.out.println("Del lunes al sábado transcurren: "+resultado);
                        break;

                    case 7:
                        soporte = 24 - hora1;
                        resultado = soporte + 120 + hora2;
                        System.out.println("Del lunes al domingo transcurren: "+resultado);
                        break;



                }
                break;

            case 2:
                switch (dia2) {
                    case 3:
                        soporte = 24 - hora1;
                        resultado = soporte + hora2;
                        System.out.println("Del martes al miércoles transcurren: "+resultado);
                        break;

                    case 4:
                        soporte = 24 - hora1;
                        resultado = soporte + 24 + hora2;
                        System.out.println("Del martes al jueves transcurren: "+resultado);
                        break;

                    case 5:
                        soporte = 24 - hora1;
                        resultado = soporte + 48 + hora2;
                        System.out.println("Del martes al miércoles transcurren: "+resultado);
                        break;

                    case 6:
                        soporte = 24 - hora1;
                        resultado = soporte + 72 + hora2;
                        System.out.println("Del martes al sábado transcurren: "+resultado);
                        break;

                    case 7:
                        soporte = 24 - hora1;
                        resultado = soporte + 96 + hora2;
                        System.out.println("Del martes al domingo transcurren: "+resultado);
                        break;
                }
                break;

            case 3:
                switch (dia2) {
                    case 4:
                        soporte = 24 - hora1;
                        resultado = soporte + hora2;
                        System.out.println("Del miércoles al jueves transcurren: "+resultado);
                        break;

                    case 5:
                        soporte = 24 - hora1;
                        resultado = soporte + 24 + hora2;
                        System.out.println("Del miércoles al viernes transcurren: "+resultado);
                        break;

                    case 6:
                        soporte = 24 - hora1;
                        resultado = soporte + 48 + hora2;
                        System.out.println("Del miércoles al sábado transcurren: "+resultado);
                        break;

                    case 7:
                        soporte = 24 - hora1;
                        resultado = soporte + 72 + hora2;
                        System.out.println("Del miñercoles al domingo transcurren: "+resultado);
                        break;
                }
                break;

            case 4:
                switch (dia2) {
                    case 5:
                        soporte = 24 - hora1;
                        resultado = soporte + hora2;
                        System.out.println("Del jueves al viernes transcurren: "+resultado);
                        break;

                    case 6:
                        soporte = 24 - hora1;
                        resultado = soporte + 24 + hora2;
                        System.out.println("Del jueves al sábado transcurren: "+resultado);
                        break;

                    case 7:
                        soporte = 24 - hora1;
                        resultado = soporte + 48 + hora2;
                        System.out.println("Del jueves al domingo transcurren: "+resultado);
                        break;
                }
                break;

            case 5:
                switch (dia2) {
                    case 6:
                        soporte = 24 - hora1;
                        resultado = soporte + hora2;
                        System.out.println("Del viernes al sábado transcurren: "+resultado);
                        break;

                    case 7:
                        soporte = 24 - hora1;
                        resultado = soporte + 24 + hora2;
                        System.out.println("Del viernes al domingo transcurren: "+resultado);
                        break;
                }
                break;

            case 6:
                //En el último caso se quita el switch ya que al ser sábado el primer día, solo queda
                //el domingo como segundo y único día después, así que descartamos el switch en esta parte
                soporte = 24 - hora1;
                resultado = soporte + hora2;
                System.out.println("Del sábado al domingo transcurren: "+resultado);
        }


    }
}
