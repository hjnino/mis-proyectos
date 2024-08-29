import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner menuscanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("-                        MENÚ CAPÍTULO DE PROGRAMACIÓN                        -");
            System.out.println("-                        HEIDY NIÑO - EDINSON MARTINEZ                        -");
            System.out.println("-                               HNINO - EMARTI4                               -");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("-         1.	Datos Primitivos                                              -");
            System.out.println("-         2.	String.                                                       -");
            System.out.println("-         3.	Constantes.                                                   -");
            System.out.println("-         4.	Operadores.                                                   -");
            System.out.println("-         5.	Condicional IF, ELSE IF y ELSE.                               -");
            System.out.println("-         6.	Condicional Switch.                                           -");
            System.out.println("-         7.	Condicional ternaria.                                         -");
            System.out.println("-         8.	Bucle Do While.                                               -");
            System.out.println("-         9.	Bucle While.                                                  -");
            System.out.println("-         10.	Bucle For.                                                    -");
            System.out.println("-                                                                             -");
            System.out.println("-      0.	Salir                                                             -");
            System.out.println("-------------------------------------------------------------------------------");

            System.out.print("Digite su opción: ");
            menu = menuscanner.nextInt();

            switch (menu) {
                case 0:
                    System.out.println("\n!Gracias¡");
                    System.exit(0);
                    break;
                case 1:
                    int submenu;

                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                              DATOS PRIMITIVOS                               -");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-  Son aquellos que no poseen métodos ni propiedades. Además, los valores     -");
                    System.out.println("-  asignados con estos tipos de datos son inmutables, lo que quiere decir que -");
                    System.out.println("-  después de asignar una variable a un valor primitivo, si deseas cambiar su -");
                    System.out.println("-  valor necesitaras reasignarle un valor nuevo, ya que su valor inicial no   -");
                    System.out.println("-  puede ser modificado, simplemente se substituye con el nuevo valor.        -");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                            TIPOS DE DATOS PRIMITIVOS                         -");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-         1.	Byte.                                                         -");
                    System.out.println("-         2.	Short.                                                        -");
                    System.out.println("-         3.	Int.                                                          -");
                    System.out.println("-         4.	Long.                                                         -");
                    System.out.println("-         5.	Float.                                                        -");
                    System.out.println("-         6.	Double.                                                       -");
                    System.out.println("-         7.	Boolean.                                                      -");
                    System.out.println("-         8.	Char.                                                         -");
                    System.out.println("-                                                                             -");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.print("Digite su opción: ");

                    submenu = menuscanner.nextInt();

                    if (submenu == 1){
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                    BYTE                                     -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-  Representa un tipo de dato de 8 bits con signo. De tal manera que puede    -");
                        System.out.println("-  almacenar los valores numéricos de -128 a 127 (ambos inclusive).           -");
                        System.out.println("-                                                                             -");
                        System.out.println("-  Ejemplo                                                                    -");
                        System.out.println("-                              byte edad = 25;                                -");
                        System.out.println("-------------------------------------------------------------------------------");

                    } else if (submenu == 2) {
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                    SHORT                                    -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-  Representa un tipo de dato de 16 bits con signo. De esta manera almacena   -");
                        System.out.println("-  valores numéricos de -32.768 a 32.767.                                     -");
                        System.out.println("-                                                                             -");
                        System.out.println("-  Ejemplo                                                                    -");
                        System.out.println("-                                                                             -");
                        System.out.println("-------------------------------------------------------------------------------");

                    } else if (submenu == 3) {
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                     INT                                     -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-  Es un tipo de dato de 32 bits con signo para almacenar valores numéricos.  -");
                        System.out.println("-  Cuyo valor mínimo es -2^31 y el valor máximo 2^31-1.                       -");
                        System.out.println("-                                                                             -");
                        System.out.println("-  Ejemplo                                                                    -");
                        System.out.println("-                                                                             -");
                        System.out.println("-------------------------------------------------------------------------------");
                    } else if (submenu == 4) {
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                     LONG                                    -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-  Es un tipo de dato de 64 bits con signo que almacena valores numéricos     -");
                        System.out.println("-  entre -2^63 a 2^63-1                                                       -");
                        System.out.println("-                                                                             -");
                        System.out.println("-  Ejemplo                                                                    -");
                        System.out.println("-                                                                             -");
                        System.out.println("-------------------------------------------------------------------------------");
                    } else if (submenu == 5) {
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                    FLOAT                                    -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-  Es un tipo dato para almacenar números en coma flotante con precisión      -");
                        System.out.println("-  simple de 32 bits                                                          -");
                        System.out.println("-                                                                             -");
                        System.out.println("-  Ejemplo                                                                    -");
                        System.out.println("-                                                                             -");
                        System.out.println("-------------------------------------------------------------------------------");

                    }  else if (submenu == 6) {
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                    DOUBLE                                   -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-  Es un tipo de dato para almacenar números en coma flotante con doble       -");
                        System.out.println("-  precisión de 64 bits.                                                      -");
                        System.out.println("-                                                                             -");
                        System.out.println("-  Ejemplo                                                                    -");
                        System.out.println("-                                                                             -");
                        System.out.println("-------------------------------------------------------------------------------");

                    } else if (submenu == 7) {
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                   BOOLEAN                                   -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-  Este tipo se utiliza comúnmente para almacenar valores de sí/no: true      -");
                        System.out.println("-  significa “sí, correcto, verdadero”, y false significa “no, incorrecto,    -");
                        System.out.println("-  falso”.                                                                    -");
                        System.out.println("-                                                                             -");
                        System.out.println("-  Ejemplo                                                                    -");
                        System.out.println("-               let esVerdadero = true;                                       -");
                        System.out.println("-               let esFalso = false;                                          -");
                        System.out.println("-               let mayorDeEdad = (18 >= 21); // false                        -");
                        System.out.println("-------------------------------------------------------------------------------");
                    } else if (submenu == 8) {
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                    CHAR                                     -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-  Es un tipo de datos que representa a un carácter Unicode sencillo          -");
                        System.out.println("-  de 16 bits.                                                                -");
                        System.out.println("-                                                                             -");
                        System.out.println("-  Ejemplo                                                                    -");
                        System.out.println("-                                       1                                     -");
                        System.out.println("-------------------------------------------------------------------------------");
                    } else
                        System.out.println("Número no válido, por favor verifique.");

                    break;


                case 2:
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                                   STRING                                    -");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-  El tipo de dato String representa cadenas de texto, que pueden ser         -");
                    System.out.println("-  escritas utilizando comillas simples, dobles o acentos graves (backticks). -");
                    System.out.println("-  Los acentos graves permiten crear plantillas literales (template literals) -");
                    System.out.println("-  que incluyen interpolación de variables y expresiones.                     -");
                    System.out.println("-                                                                             -");
                    System.out.println("-  Ejemplo                                                                    -");
                    System.out.println("-          comillasSimples = 'Hola, mundo!';                                  -");
                    System.out.println("-          plantillaLiteral = `Mi número favorito es ${entero}`;              -");
                    System.out.println("-          caracteresEscape = 'Texto con \"comillas\" y salto de línea';      -");
                    System.out.println("-------------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                                 CONSTANTES                                  -");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-  Es un tipo especial de variable cuyo valor no puede ser modificado una     -");
                    System.out.println("-  vez que ha sido asignado. A diferencia de las variables regulares, que se  -");
                    System.out.println("-  pueden actualizar a lo largo de la ejecución de un programa, las           -");
                    System.out.println("-  constantes mantienen su valor original durante toda su vida útil.          -");
                    System.out.println("-                                                                             -");
                    System.out.println("-  Ejemplo                                                                    -");
                    System.out.println("-               const nombreConstante = valorInicial;                         -");
                    System.out.println("-                         const PI = 3.14159;                                 -");
                    System.out.println("-------------------------------------------------------------------------------");
                    break;
                case 4:

                    int menuop;
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                                OPERADORES                                   -");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-  Un operador representa un símbolo que permite realizar operaciones         -");
                    System.out.println("-  aritméticas, relacionar elementos o hacer preguntas donde se involucra     -");
                    System.out.println("-  más de una condición.                                                      -");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                            TIPO  DE OPERADORES                              -");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-         1.	Aritméticos.                                                  -");
                    System.out.println("-         2.	Relacionales.                                                 -");
                    System.out.println("-         3.	Lógicos.                                                      -");
                    System.out.println("-         4.	Asignacion.                                                   -");
                    System.out.println("-         5.	Incremento / Decremento.                                      -");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.print("Digite su opción: ");

                    menuop = menuscanner.nextInt();

                    if (menuop == 1){
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                ARITMETICOS                                  -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                                                             -");
                        System.out.println("-  |     OPERADOR     |           DESCRIPCION            |     EJEMPLO     |  -");
                        System.out.println("-  |Suma (+)          |Este operador suma dos números y  |sum = num1+ num2 |  -");
                        System.out.println("-  |                  |devuelve el resultado.            |                 |  -");
                        System.out.println("-  |Resta (-)         |Este operador resta el segundo    |                 |  -");
                        System.out.println("-  |                  |número del primero y devuelve el  |                 |  -");
                        System.out.println("-  |				  |resultado.                        |                 |  -");
                        System.out.println("-  |Multiplicación(*) |Este operador multiplica dos      |                 |  -");
                        System.out.println("-  |                  |números y devuelve el resultado.  |                 |  -");
                        System.out.println("-  |División (/)      |Este operador divide el primer    |                 |  -");
                        System.out.println("-  |                  |número por el segundo y devuelve  |                 |  -");
                        System.out.println("-  |				  |el resultado.                     |                 |  -");
                        System.out.println("-  |Módulo (%)        |Este operador devuelve el residuo |                 |  -");
                        System.out.println("-  |                  |de la división del primer número  |                 |  -");
                        System.out.println("-  |				  |entre el segundo.                 |                 |  -");
                        System.out.println("-  |Exponenciación(**)|Este operador eleva el primer     |                 |  -");
                        System.out.println("-  |                  |número a la potencia del segundo  |                 |  -");
                        System.out.println("-  |				  |número.                           |                 |  -");
                        System.out.println("-  |Negación unaria(-)|Este operador cambia el signo del |                 |  -");
                        System.out.println("-  |                  |número al que se aplica.		     |		           |  -");
                        System.out.println("-------------------------------------------------------------------------------");

                    } else if (menuop == 2) {
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                              RELACIONALES                                   -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                                                             -");
                        System.out.println("-  |     OPERADOR     |                     EJEMPLO                        |  -");
                        System.out.println("-  |Igual (==)        |                                                    |  -");
                        System.out.println("-  |                  |                                                    |  -");
                        System.out.println("-  |Diferente (!=)    |                                                    |  -");
                        System.out.println("-  |                  |                                                    |  -");
                        System.out.println("-  |Mayor que (>)     |                                                    |  -");
                        System.out.println("-  |                  |                                                    |  -");
                        System.out.println("-  |Mayor o igual que |                                                    |  -");
                        System.out.println("-  |(>=)              |                                                    |  -");
                        System.out.println("-  |				  |                                                    |  -");
                        System.out.println("-  |Menor que (<)     |                                                    |  -");
                        System.out.println("-  |                  |                                                    |  -");
                        System.out.println("-  |Menor o igual que |                                                    |  -");
                        System.out.println("-  |(<=)              |                                                    |  -");
                        System.out.println("-  |				  |                                                    |  -");
                        System.out.println("-------------------------------------------------------------------------------");

                    } else if (menuop == 3) {
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                   LOGICOS                                   -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                                                             -");
                        System.out.println("-  |    OPERADOR   |           DESCRIPCION            |       EJEMPLO      |  -");
                        System.out.println("-  |AND (&&)       |Este operador devuelve true si    |                    |  -");
                        System.out.println("-  |               |ambas expresiones booleanas son   |                    |  -");
                        System.out.println("-  |			   |true. De lo contrario, devuelve   |                    |  -");
                        System.out.println("-  |			   |false.                            |                    |  -");
                        System.out.println("-  |OR (||)        |Este operador devuelve true si al |                    |  -");
                        System.out.println("-  |               |menos una de las expresiones      |                    |  -");
                        System.out.println("-  |			   |booleanas es true. De lo          |                    |  -");
                        System.out.println("-  |			   |contrario, devuelve false.        |                    |  -");
                        System.out.println("-  |               |                                  |                    |  -");
                        System.out.println("-  |NOT (!)        |Este operador invierte el valor   |                    |  -");
                        System.out.println("-  |               |booleano de la expresión a la que |                    |  -");
                        System.out.println("-  |			   |se aplica. Si la expresión es     |                    |  -");
                        System.out.println("-  |			   |true, devuelve false, y viceversa.|                    |  -");
                        System.out.println("-------------------------------------------------------------------------------");
                    } else if (menuop == 4) {
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                 ASIGNACION                                  -");
                        System.out.println("-------------------------------------------------------------------------------");
                    } else if (menuop == 5) {
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                          INCREMENTO / DECREMENTO                            -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-  |    OPERADOR      |          DESCRIPCION             |     EJEMPLO     |  -");
                        System.out.println("-  |Incremento (++)   |Este operador se utiliza para     |                 |  -");
                        System.out.println("-  |                  |incrementar en uno el valor de    |                 |  -");
                        System.out.println("-  |				  |una variable.                     |                 |  -");
                        System.out.println("-  |Decremento (--)   |Este operador se utiliza para     |                 |  -");
                        System.out.println("-  |                  |decrementar en uno el valor de    |                 |  -");
                        System.out.println("-  |				  |una variable.                     |                 |  -");
                        System.out.println("-------------------------------------------------------------------------------");
                    } else
                        System.out.println("Número no válido, por favor verifique.");
                    break;
                case 5:

                    int menuif;
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                        CONDICIONAL IF, ELSE IF Y ELSE                       -");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-  Las estructuras de control establecen condicionales en nuestros código.    -");
                    System.out.println("-  Por ejemplo, qué condiciones deben cumplirse para realizar una operación   -");
                    System.out.println("-  o qué debe ocurrir para ejecutar una función.                              -");
                    System.out.println("-                                                                             -");
                    System.out.println("-         1.	If.                                                           -");
                    System.out.println("-         2.	Else if.                                                      -");
                    System.out.println("-         3.	Else.                                                         -");
                    System.out.println("-         4.	Programa                                                      -");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.print("Digite su opción: ");

                    menuif = menuscanner.nextInt();

                    if (menuif == 1){
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                     IF                                      -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-  La sentencia if en Java se utiliza para evaluar una condición y ejecutar   -");
                        System.out.println("-  cierto código solo si la condición se cumple.                              -");
                        System.out.println("-                                                                             -");
                        System.out.println("-------------------------------------------------------------------------------");

                    } else if (menuif == 2) {
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                  ELSE IF                                    -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-  La sentencia else if en Java es una extensión de la sentencia if-else que  -");
                        System.out.println("-  permite especificar múltiples condiciones de control de flujo en un solo   -");
                        System.out.println("-  bloque de código. Es similar a la sentencia if-else, pero permite          -");
                        System.out.println("-  especificar varias condiciones adicionales antes de llegar a la sentencia  -");
                        System.out.println("-  else final.                                                                -");
                        System.out.println("-                                                                             -");
                        System.out.println("-------------------------------------------------------------------------------");

                    } else if (menuif == 3) {
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                   ELSE                                      -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-  La sentencia else en Java se usa junto con la sentencia if para            -");
                        System.out.println("-  especificar un bloque de código que se ejecutará si la condición           -");
                        System.out.println("-  especificada en la sentencia if es falsa.                                  -");
                        System.out.println("-                                                                             -");
                        System.out.println("-------------------------------------------------------------------------------");
                    } else if (menuif == 4) {
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                 PROGRAMA                                    -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-    Programa que muestra el ciclo vital el cual se divide en diferentes      -");
                        System.out.println("-    etapas del desarrollo humano, este se realiza utilizando                 -");
                        System.out.println("-    el if, else if y else.                                                   -");
                        System.out.println("-                                                                             -");

                        int edad;

                        System.out.print("                        Ingresar la edad:");
                        Scanner scanner = new Scanner(System.in);
                        edad = scanner.nextInt();

                        if (edad < 0){
                            System.out.println("    Edad no validad ");
                        } else if (edad >= 0  && edad <= 5) {
                            System.out.println("    Primera infancia");
                        } else if (edad >= 6 && edad <= 11) {
                            System.out.println("    Infancia");
                        } else if (edad >= 12 && edad <= 18) {
                            System.out.println("    Adolecencia");
                        } else if (edad >= 19 && edad <= 26) {
                            System.out.println("    Juventud");
                        } else if (edad >= 27 && edad <= 59) {
                            System.out.println("    Adultez");
                        } else
                            System.out.println("    Vejez");

                    }else
                        System.out.println("Número no válido, por favor verifique.");
                    break;

                case 6:
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                             CONDICIONAL SWITCH                              -");
                    System.out.println("-------------------------------------------------------------------------------");
                    break;
                case 7:
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                            CONDICIONAL TERNARIA                             -");
                    System.out.println("-------------------------------------------------------------------------------");
                    break;
                case 8:
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                               BUCLE DO WHILE                                -");
                    System.out.println("-------------------------------------------------------------------------------");
                    break;
                case 9:
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                                 BUCLE WHILE                                 -");
                    System.out.println("-------------------------------------------------------------------------------");
                    break;
                case 10:
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                                 BUCLE WHILE                                 -");
                    System.out.println("-------------------------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Número no válido, por favor verifique.");

            }

            System.out.print("Presione enter para continuar...");
            menuscanner.nextLine();
            menuscanner.nextLine();

        }while (menu != 0);


        menuscanner.close();

    }
}