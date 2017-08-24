/**
 * Classe para representar um número complexo, que é composto por uma parte real e uma parte imaginária
 */
public class Complexo {

    // Atributos da classe
    private int real;
    private int imaginaria;

    /**
     * Método construtor da classe
     *
     * @param a - parte real
     * @param b - parte imaginária
     */
    public Complexo(int a, int b) {
        this.real = a;
        this.imaginaria = b;
    }

    public int getReal() {
        return real;
    }

    public int getImaginaria() {
        return imaginaria;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginaria(int imaginaria) {
        this.imaginaria = imaginaria;
    }

    /**
     * Recebe um objeto da classe Complexo como parâmetro e faz a soma das partes reais e imaginárias
     *
     * @param c - um número complexo
     */
    public void soma(Complexo c) {
        if (c != null) {
            this.real += c.real;
            this.imaginaria += c.imaginaria;
        }
    }

    /**
     * Recebe um objeto da classe Complexo como parâmetro e faz a subtração das partes reais e imaginárias
     *
     * @param c - um número complexo
     */
    public void subtracao(Complexo c) {
        if (c != null) {
            this.real -= c.real;
            this.imaginaria -= c.imaginaria;
        }
    }

    /**
     * Imprime o número complexo no formato (real,imaginaria)
     *
     * @return (real, imaginaria)
     */
    @Override
    public String toString() {
        return "(" + this.real + "," + this.imaginaria + ")";
    }
}
