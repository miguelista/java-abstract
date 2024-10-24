public class estabulo {
    public static void main(String args[]){
        cavalo s1 = new cavalo();
        s1.altura = 160;
        s1.comprimento = 200;
        s1.patas = 4;
        s1.peso = 100;
        //----------------
        s1.comportamento();
        s1.som();
        s1.dormir();

        cavalo_de_3_pernas s2 = new cavalo_de_3_pernas();
        s2.altura = 130;
        s2.comprimento = 150;
        s2.patas = 3;
        s2.peso = 75;
//----------------
        s2.comportamento();
        s2.som();
        s2.dormir();
    }


}

