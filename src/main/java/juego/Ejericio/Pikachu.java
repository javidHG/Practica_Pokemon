package juego.Ejericio;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu(){
    
    }
       
    @Override
    protected void AtacarPlacaje() {
        System.out.println("Esto es un ataque de placaje soy pikachu");
    }

    @Override
    protected void AtacarAraniazo() {
        System.out.println("Esto es un ataque de Arañazo soy pikachu");

    }

    @Override
    protected void AtacarMordisco() {
        System.out.println("Esto es un ataque de Mordisco soy pikachu");
    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Esto es un ataque de impactrueno soy pikachu");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Esto es un ataque de puño trueno soy pikachu");
    }

}
