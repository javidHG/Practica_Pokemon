package juego.Ejericio;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur(){
    
    }
       
    @Override
    protected void AtacarPlacaje() {
       System.out.println("Esto es un ataque de placaje soy bulbasur");
    }

    @Override
    protected void AtacarAraniazo() {
        System.out.println("Esto es un ataque de Arañazo soy bulbasur");
    }

    @Override
    protected void AtacarMordisco() {
        System.out.println("Esto es un ataque de Mordisco soy bulbasur");
    }

    @Override
    public void atarcarDrenaje() {
        System.out.println("Esto es un ataque de drenaje soy bulbasur");
    }

    @Override
    public void atarcarParalizar() {
        System.out.println("Esto es un ataque de paralizar soy bulbasur");
    }

}
