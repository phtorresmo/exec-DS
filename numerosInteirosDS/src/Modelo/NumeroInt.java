package Modelo;

public class NumeroInt {
    private String valExtenso;

        public NumeroInt(String valor){
        this.setValorPorExtenso(valor);
        }

        public String getValorPorExtenso(){
        return this.valExtenso;
        }

        public void setValorPorExtenso(String valor){
        this.valExtenso = valor;
        }

}
