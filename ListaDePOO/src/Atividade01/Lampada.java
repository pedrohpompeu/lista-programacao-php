package Atividade01;

public class Lampada {

    private boolean ligada;
    private int brilho = 0;
    private String cor = "";

    public Lampada() {
        this.ligada = false;
        this.brilho = 0;
        this.cor = "branca";
    }

    public Lampada(boolean ligada, int brilho, String cor) {
        this.ligada = ligada;
        this.brilho = brilho;
        this.cor = cor;
    }

    public String getLigada () {
        if (this.ligada == true) {
            return "ligada";
        }else  {
            return "Desligada";
        }
    }

    public void setLigar() {
        this.ligada = true;
    }

    public void setDesligar() {
        this.ligada = false;
    }

    public int getBrilho() {
        return this.brilho;
    }

    public void setreduzirBrilho(int valor) {
        if ((this.brilho - valor) < 0) {
            valor = 0;
            this.brilho = valor;
        } else {
            this.brilho -= valor;
        }
    }

    public void setaumentarBrilho(int valor) {
        if ((this.brilho + valor) > 100) {
            valor = 100;
            this.brilho = valor;
        } else {
            this.brilho += valor;
        }
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void falar() {
        System.out.println("\n Á lampada está:"+getLigada()+"\n seu brilho é: " + getBrilho() + "\n Sua cor é: " + getCor() );
    }


}