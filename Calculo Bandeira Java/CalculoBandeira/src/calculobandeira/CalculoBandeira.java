/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculobandeira;

import java.util.Scanner;

/**
 *
 * @author autologon
 */
public class CalculoBandeira {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int resp;
        
        double alturaMastro = 0.0, compBandeira = 0.0, alturaBandeira = 0.0,
                alturaBandeira2 = 0.0, compBandeira2 = 0.0;
        System.out.println("Escolha o que quer digitar(COM O VALOR DO MASTRO): ");
        System.out.println("1 - Digitar o comprimento: ");
        System.out.println("2 - Digitar a largura: ");
        System.out.println("3 - Digitar a altura do mastro: ");
        
        System.out.println("4 - Digite a largura: ");
        System.out.println("5 - Digite o comprimento: ");
        resp = entrada.nextInt();
        
        switch(resp){
            case 1: 
                System.out.println("Digite o comprimento da bandeira: ");
                compBandeira = entrada.nextDouble();
                
                alturaMastro = compBandeira*5;
                alturaBandeira = compBandeira*0.7;
                
                System.out.println("Comprimento da bandeira: "+ compBandeira);
                System.out.println("Altura do Mastro: "+ alturaMastro);
                System.out.println("Largura da Bandeira: "+ alturaBandeira);
                break;
            
            case 2:
                System.out.println("Digite a largura: ");
                alturaBandeira = entrada.nextDouble();
                
                alturaMastro = (alturaBandeira*7)+0.4;
                compBandeira = (alturaMastro/10)*2;
                
                System.out.println("Largura: "+alturaBandeira);
                System.out.println("Altura do Mastro: "+ alturaMastro);
                System.out.println("Comprimento da bandeira: "+ compBandeira);
                break;
            case 3:
                System.out.println("Digite a altura do mastro: ");
                alturaMastro = entrada.nextDouble();
                
                compBandeira = (alturaMastro/10)*2;
                alturaBandeira = compBandeira*0.7;
                
                System.out.println("Altura do mastro: "+ alturaMastro);
                System.out.println("Comprimento da Bandeira: "+ compBandeira);
                System.out.println("Largura da Bandeira: "+ alturaBandeira);
                break;
            case 4:
                System.out.println("Digite a largura: ");
                alturaBandeira2 = entrada.nextDouble();
                
                compBandeira2 = alturaBandeira2*1.44;
                
                System.out.println("Largura da Bandeira: "+ alturaBandeira2);
                System.out.println("Comprimento da Bandeira: "+ compBandeira2);
                break;
            case 5:
                System.out.println("Digite o comprimento: ");
                compBandeira2 = entrada.nextDouble();
                
                alturaBandeira2 = compBandeira2*0.7;
                
                System.out.println("Comprimento da Bandeira: "+ compBandeira2);
                System.out.println("Largura da Bandeira: "+ alturaBandeira2);
            default:
                System.out.println("NÂO CONSEGUI ENTENDER!!!");
        }    
    }
}
