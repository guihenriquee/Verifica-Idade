/*
Receba uma idade como entrada,
Se idade for maior ou igual que 18 imprima "Adulto",
Senão imprima "Ainda não é adulto" 
 */
public class VerificaIdade {
    public static void main(String[] args) {
        int idade = 15;
        if (idade >= 18) {
        System.out.println("Adulto");
        
         }else{
            System.err.println("Ainda nao eh adulto");
         }
    }
}