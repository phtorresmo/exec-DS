package Modelo;

public class NumerosInt {
    private String valExtenso;

        public NumerosInt(String valor){
        this.setValorPorExtenso(valor);
        }

        public String getValorPorExtenso(){
        return this.valExtenso;
        }

        public void setValorPorExtenso(String valor){
        this.valExtenso = valor;
        }

}
