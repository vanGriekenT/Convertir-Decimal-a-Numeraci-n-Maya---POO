import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

class ConvertidorMaya {
    // Atributos (Variables de instancia)
    private int numero;
    private Vector<Integer> digitosBaseMaya;

    //Constructor (metodo especial para inicializar objetos)
    public ConvertidorMaya(int numero) {
        this.numero = numero;
        this.digitosBaseMaya = new Vector<>();
        this.convertirBaseMaya();
        Collections.reverse(this.digitosBaseMaya);
    }

    private void convertirBaseMaya() {
        int num = this.numero;
        while (num > 0) {
            this.digitosBaseMaya.add(num % 20);
            num /= 20;
        }
        if (this.numero == 0) {
            this.digitosBaseMaya.add(0);
        }
    }

    public Vector<Integer> getDigitosBaseMaya() {
        return this.digitosBaseMaya;
    }
}
class CodigoMaya {
    public static String ObtenerCodigoMaya(int digito) {
        String codigoMaya = "";
        switch (digito) {
            case 0:
                codigoMaya = " @";
                break;
            case 1:
                codigoMaya = " .";
                break;
            case 2:
                codigoMaya = " . .";
                break;
            case 3:
                codigoMaya = ". . .";
                break;
            case 4:
                codigoMaya = ". . . .";
                break;
            case 5:
                codigoMaya = "______";
                break;
            case 6:
                codigoMaya = " .\n" + "\t______";
                break;
            case 7:
                codigoMaya = " . .\n" + "\t______";
                break;
            case 8:
                codigoMaya = ". . .\n" + "\t______";
                break;
            case 9:
                codigoMaya = ". . . .\n" + "\t______";
                break;
            case 10:
                codigoMaya = "______\n" + "\t______";
                break;
            case 11:
                codigoMaya = " .\n" + "\t______\n" + "\t______";
                break;
            case 12:
                codigoMaya = " . .\n" + "\t______\n" + "\t______";
                break;
            case 13:
                codigoMaya = ". . .\n" + "\t______\n" + "\t______";
                break;
            case 14:
                codigoMaya = ". . . .\n" + "\t______\n" + "\t______";
                break;
            case 15:
                codigoMaya = "______\n" + "\t______\n" + "\t______";
                break;
            case 16:
                codigoMaya = " .\n" + "\t______\n" + "\t______\n" + "\t______";
                break;
            case 17:
                codigoMaya = " . .\n" + "\t______\n" + "\t______\n" + "\t______";
                break;
            case 18:
                codigoMaya = ". . .\n" + "\t______\n" + "\t______\n" + "\t______";
                break;
            default:
                codigoMaya = ". . . .\n" + "\t______\n" + "\t______\n" + "\t______";
                break;
        }
        return codigoMaya;
    }

}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número a convertir: ");
        int numeroAConvertir = sc.nextInt();

        ConvertidorMaya convertidor = new ConvertidorMaya(numeroAConvertir);
        Vector<Integer> digitos = convertidor.getDigitosBaseMaya();

        System.out.println("Representación en Sistema numérico Maya: ");

        for (int digito: digitos) {
            String codigo = CodigoMaya.ObtenerCodigoMaya(digito);
            System.out.println("\t" + codigo);
            System.out.println(":::::::::::::::::");// Se usa para separar los niveles 1´s  20´s 400´s  8000´s  160000´s etc De abajo hacia arriba.
        }
        sc.close();
    }
}
