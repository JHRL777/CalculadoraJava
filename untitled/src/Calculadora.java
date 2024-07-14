public class Calculadora {

    private Integer num1;
    private Integer num2;
    private String tipo;

    public Calculadora(){

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer suma(){

        return this.num1 + this.num2;

    }



    public Integer resta(){

        return this.num1 - this.num2;

    }

    public Integer multiplicacion(){

        return  this.num1 * this.num2;

    }


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public Integer sigosCalculadora(){

        switch (this.tipo){
            case "+":
                return suma();

            case "-":
                return resta();

            case "*":
                return multiplicacion();

            default:
                throw new IllegalArgumentException("Operador no válido: " + tipo);
        }

    }
}
