package util;

public class ConversorDeMoeda {
    public static double IOF = 0.06;
    public static double calculos(double quant, double preco){
        return quant*preco + (quant*preco*IOF);
    }
}
