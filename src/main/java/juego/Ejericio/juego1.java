package juego.Ejericio;

public class juego1 {
   public static void main(String[] args) {
      Squirtle squirtle = new Squirtle();
      Charmander charmander = new Charmander();
      Bulbasaur bulbasaur = new Bulbasaur();
      Pikachu pikachu = new Pikachu();

      squirtle.AtacarAraniazo();
      squirtle.AtacarMordisco();
      squirtle.AtacarPlacaje();
      squirtle.atacarBurbuja();
      squirtle.atacarHidroBomba();
      squirtle.atacarPistolaAgua();

      pikachu.AtacarAraniazo();
      pikachu.AtacarMordisco();
      pikachu.AtacarPlacaje();
      pikachu.atacarImpacTrueno();
      pikachu.atacarPunioTrueno();

      charmander.AtacarAraniazo();
      bulbasaur.AtacarPlacaje();

   }

}
