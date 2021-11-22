public class retangulo implements Figura{
    private int altura;
    private int largura;
    public retangulo(int largura,int altura){
        this.largura=largura;
        this.altura=altura;
    }

    public double calculaArea() {
        return this.largura * this.altura;
    }
    public double calculaPerimetro(){
        return this.altura*2 +this.largura*2;
    }
}
