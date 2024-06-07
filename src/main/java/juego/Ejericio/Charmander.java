package juego.Ejericio;

public class Charmander extends Pokemon implements IFuego {

    public Charmander(){
    
    }
       

    @Override
    public void atacarPunioFuego() {
        System.out.println("Esto es un ataque de puño fuego soy Charmander");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Esto es un ataque de lanza llamas soy Charmander");
    }


    @Override
    protected void AtacarPlacaje() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'AtacarPlacaje'");
    }


    @Override
    protected void AtacarAraniazo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'AtacarAraniazo'");
    }


    @Override
    public void AtacarMordisco() {
        System.out.println("ataque moridisco de charmander");
    }

}
