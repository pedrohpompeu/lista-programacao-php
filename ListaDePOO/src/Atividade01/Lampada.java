package Atividade01;

public class Lampada {
    public class lampada {
        private boolean ligada;
        private int brilho = 0-100;
        private String cor = "";

        public lampada(){
            this.ligada = false;
            this.brilho = 0;
            this.cor = "Branco";
        }

        public lampada(boolean ligada, int brilho, String cor){
            this.ligada = ligada;
            this.brilho = brilho;
            this.cor = cor;
        }

        public boolean getligada(){
            return !this.ligada;
        }

        public void setligada(boolean ligada){
            this.ligada = true;
        }

        public boolean getdesligada(){
            return this.ligada;
        }

        public void setDesligada(boolean ligada){
            this.ligada = false;
        }

        public int getBrilho(){
            return this.brilho;
        }

        public void setReduzirBrilho(int brilho){
            if((this.brilho-brilho) < 0){
                brilho = 0;
                this.brilho = brilho;
            } else {
                this.brilho = brilho;
            }
        }

        public void setAumentarBrilho(int brilho){
            if(())
        }

        public void setCor(String cor){
            this.cor = cor;
        }
    }
}
