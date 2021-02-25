public class Main {

    public static void main(String[] args) {

	Spelare person1 = new Spelare("Anders", "880101-0202");
	Spelare person4 = new Spelare("Anders", "880101-0202");
	Spelare person2 = new Spelare("Lotta", "900202-0303");
	Spelare person3 = new Spelare("Sven", "920505-0606");


	Spelare.addSpelare(person1);
	Spelare.addSpelare(person4);
	Spelare.addSpelare(person2);
	Spelare.addSpelare(person3);


	FotbollsLag malmöSenior1 = new FotbollsLag(person1, "Malmö");
	FotbollsLag malmöSenior2 = new FotbollsLag(person1, "Svenska Landslaget");
	FotbollsLag malmö1 = new FotbollsLag(person2,"Malmö");
	FotbollsLag malmöJunior1 = new FotbollsLag(person3, "Malmö");


	FotbollsLag.addTeams(malmöSenior1);
	FotbollsLag.addTeams(malmöSenior2);
	FotbollsLag.addTeams(malmö1);
	FotbollsLag.addTeams(malmöJunior1);

	//FotbollsLag.showPlayer("880101-0202");
		//System.out.println(Spelare.spelarLista);
		//System.out.println(FotbollsLag.lagLista);

    }
}
