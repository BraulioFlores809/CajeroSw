package cajerosw;

import java.util.Scanner;

public class ClasesCaj {
    private float saldo=0f;
    private float num=0f;
    private float num2 = 0f;
    
    public ClasesCaj(){
        
    }     
    public void AgregarSaldo(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el dinero a agregar: ");
        num = scanner.nextFloat();
   
        saldo = saldo + num;
        
    }
    public void RetirarSaldo(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el dinero a retirar: ");
        num2 = scanner.nextFloat();
   
        saldo = saldo - num2;
    }
    public void ConsultarSaldo(){
        System.out.println("Tu saldo es "+saldo);
    }
}