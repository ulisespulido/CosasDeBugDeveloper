
package com.codingdojo.numerosromanos;


public class NumerosRomanos {
    
    static String[][] Cadenas = new String[40][4000];
    public static void main(String[] args) {
        System.out.println("salida = "+getNumeroRomano(3994));
    }
    
    
    public static String getNumeroRomano(int i){   
        Cadenas[0][1]= "I";
        Cadenas[0][2]= "II";
        Cadenas[0][3]= "III";
        Cadenas[0][4]= "IV";        
        Cadenas[0][5]= "V";
        Cadenas[0][6]= "VI";
        Cadenas[0][7]= "VII";
        Cadenas[0][8]= "VIII";        
        Cadenas[0][9]= "IX";        
        Cadenas[1][1]= "X";
        Cadenas[1][2]="XX";
        Cadenas[1][3]="XXX";
        Cadenas[1][4]="XL";
        Cadenas[1][5]="L";
        Cadenas[1][6]="LX";
        Cadenas[1][7]="LXX";
        Cadenas[1][8]="LXXX";
        Cadenas[1][9]="XC";
        Cadenas[2][1]="C";
        Cadenas[2][2]="CC";
        Cadenas[2][3]="CCC";
        Cadenas[2][4]="CD";
        Cadenas[2][5]="D";
        Cadenas[2][6]="DC";
        Cadenas[2][7]="DCC";
        Cadenas[2][8]="DCCC";
        Cadenas[2][9]="CM";
        Cadenas[3][1]="M";
        Cadenas[3][2]="MM";
        Cadenas[3][3]="MMM";

        String numero = i+"";
        String salida="";
        numero = invertir(numero);
                
        for(int j=0; j<numero.length(); j++){
            String aux = Cadenas[j][  new Integer(numero.charAt(j)+"") ];            
            salida = (aux!=null ? aux:"") + salida;
        }
        return salida;
    }

    private static String invertir(String numero) {
        String salida="";
        
        for(int i=numero.length()-1; i>=0; i--){
            salida += numero.charAt(i);
        }
        return salida;
    }
}
