/*Esto es simplemente un archivo de prueba para aprender a usar java,
no es ningún programa */
public class Main {
    public static void main(String[] args) {
        final String name = "br0k3n";   // final al principio de la variable significa que no se puede cambiar luego convirtiendola en solo lectura
        short myNum;
        myNum = 3800;
        String cpuName = "Ryzen 7 ";
        short cpuNumber = 5800;
        String cpuLetters = "X3D";
        String fullCpu = cpuName + cpuNumber + cpuLetters;  // Se puede crear una combinación de varibles para no escribir en un comando una combinacion de ellas 
        System.out.println("Hello World");
        System.out.println("I Hate Bolivia");
        System.out.println(name + "-d3m0n");    // Se pueden combinar variables con texto suelto o otras variables usando +
        System.out.print("Ryzen 7 ");
        System.out.print(myNum);
        System.out.print("X");
        System.out.println();
        System.out.println("My old CPU was a");
        System.out.print("Ryzen 7 ");
        System.out.print(400 * 4 + 100);    // Se pueden introducir operaciones matemáticas
        System.out.print("X");
        System.out.println();
        System.out.print("I want to upgrade my CPU to a ");
        System.out.println(fullCpu);
    }
}