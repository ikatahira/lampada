public class TesteLampada {
    
public static void main(String[] args) {
    Lampada l=new Lampada();

    l.desligar();

    if(l.isSituacaoLampada()){
        System.out.println("Lampada ligada");
    }
    else{
        System.out.println("Lampada desligada");
    }

}
}
