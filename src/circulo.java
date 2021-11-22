public class circulo implements Figura{
    private int raio;
    public circulo(int raio){
        this.raio=raio;
    }

    public double calculaArea() {
        return this.raio * this.raio * Math.PI;
    }
    public double calculaPerimetro(){
        return this.raio* 2 * Math.PI;
    }
}
