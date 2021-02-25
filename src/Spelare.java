import java.util.HashSet;

public class Spelare {
    protected String namn;
    protected String personNr;
    protected static HashSet<Spelare> spelarLista = new HashSet<>();

    public Spelare (String namn, String personNr){
        this.namn = namn;
        this.personNr = personNr;
    }

    public static void addSpelare (Spelare s) {
        boolean duplicateFound = spelarLista.add(s);
        int i = 0;
        String pNr = s.personNr;

        if (!duplicateFound) {
            System.out.println("Spelaren finns redan i listan.");
        } else {
            System.out.println("Spelaren inlagd i listan: ");
        }
        System.out.println(spelarLista);



        while (i < spelarLista.size() && !found) {
            if (spelarLista.contains(pNr)) {
                found = true;
                System.out.println("Spelaren finns redan i listan.");
            } else {
                spelarLista.add(s);
            }
        }
        
    }

    public static void showPlayer (String personNr){
        if (spelarLista.contains(personNr)){
            System.out.println(spelarLista.contains(personNr));
        } else {
            System.out.println("Personnumret kunde inte hittas.");
        }
    }



    public String getNamn() {
        return namn;
    }

    public String getPersonNr() {
        return personNr;
    }

    @Override
    public String toString() {
        return "Spelare: " +
                "Namn='" + namn + '\'' +
                ", PersonNr='" + personNr + '\'';
    }
}
