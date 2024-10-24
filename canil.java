public class canil {
    public static void main(String args[]){
        cachorro p1 = new cachorro();
        p1.altura = 30;
        p1.comprimento = 40;
        p1.patas = 4;
        p1.peso = 15.7    ;
        //----------------

        p1.comportamento();
        p1.som();
        p1.dormir();


        cachorro_selvagem p2 = new cachorro_selvagem();
        p2.altura = 50;
        p2.comprimento = 60;
        p2.patas = 4;
        p2.peso = 25;
        //---------------
        p2.comportamento();
        p2.som();
        p2.dormir();

    }


}
