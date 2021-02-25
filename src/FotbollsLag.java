import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FotbollsLag {


    protected String lag;
    protected Spelare player;
    protected static ArrayList<FotbollsLag> lagLista = new ArrayList<>();


        public FotbollsLag (Spelare player, String lag){
            this.player = player;
            this.lag = lag;
        }

        public static void addTeams (FotbollsLag playerOnTeam) {
            boolean found = false;
            int i = 0;

            while (i < lagLista.size() && !found) {
                if (lagLista.contains(playerOnTeam)) {
                    found = true;
                    System.out.println("Spelaren finns redan i listan med det laget.");
                    i++;
                } else {
                    lagLista.add(playerOnTeam);

                }
            }
        }

        public static void showPlayerWithTeams (String personNr){
            if (lagLista.contains(personNr)){
                System.out.println(lagLista.contains(personNr));
            } else {
                System.out.println("Personnumret kunde inte hittas.");
            }
        }


    @Override
    public String toString() {
        return " FotbollsLag: " + lag + " " +
                ", " + player + "\n";
    }
}

