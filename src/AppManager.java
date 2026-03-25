package Klassen;

import java.util.ArrayList;

/**
 * AppManager = Controller
 */
public class AppManager
{
    private MainWindow view;
    private ArrayList<Topspieler> spielerListe;

    public AppManager()
    {
        spielerListe = new ArrayList<>();

        // === Beispieldaten ===
        Topspieler messi = new Topspieler();
        messi.setTopspielerVorname("Lionel");
        messi.setTopspielerNachname("Messi");
        messi.setTopspielerAlter(36);
        messi.setTopspielerPosition("Angriff");

        Topspieler ronaldo = new Topspieler();
        ronaldo.setTopspielerVorname("Cristiano");
        ronaldo.setTopspielerNachname("Ronaldo");
        ronaldo.setTopspielerAlter(39);
        ronaldo.setTopspielerPosition("Angriff");

        Topspieler neymar = new Topspieler();
        neymar.setTopspielerVorname("Neymar");
        neymar.setTopspielerNachname("Junior");
        neymar.setTopspielerAlter(32);
        neymar.setTopspielerPosition("Fl�gel");

        Topspieler wirtz = new Topspieler();
        wirtz.setTopspielerVorname("Florian");
        wirtz.setTopspielerNachname("Wirtz");
        wirtz.setTopspielerAlter(22);
        wirtz.setTopspielerPosition("Mittelfeld");
        
        Topspieler yildiz = new Topspieler();
        yildiz.setTopspielerVorname("Kenan");
        yildiz.setTopspielerNachname("Yildiz");
        yildiz.setTopspielerAlter(20);
        yildiz.setTopspielerPosition("Angriff");
        
        Topspieler mbappe = new Topspieler();
        mbappe.setTopspielerVorname("Kylian");
        mbappe.setTopspielerNachname("Mbappe");
        mbappe.setTopspielerAlter(27);
        mbappe.setTopspielerPosition("Sturm");

        Topspieler dembele = new Topspieler();
        dembele.setTopspielerVorname("Ousmane");
        dembele.setTopspielerNachname("Dembele");
        dembele.setTopspielerAlter(28);
        dembele.setTopspielerPosition("Sturm");

        Topspieler deBruyne = new Topspieler();
        deBruyne.setTopspielerVorname("Kevin");
        deBruyne.setTopspielerNachname("DeBruyne");
        deBruyne.setTopspielerAlter(34);
        deBruyne.setTopspielerPosition("Mittelfeld");

        Topspieler guler = new Topspieler();
        guler.setTopspielerVorname("Arda");
        guler.setTopspielerNachname("Guler");
        guler.setTopspielerAlter(20);
        guler.setTopspielerPosition("Mittelfeld");
        
        Topspieler musiala = new Topspieler();
        musiala.setTopspielerVorname("Jamal");
        musiala.setTopspielerNachname("Musiala");
        musiala.setTopspielerAlter(22);
        musiala.setTopspielerPosition("Offensives Mittelfeld");

        Topspieler kimmich = new Topspieler();
        kimmich.setTopspielerVorname("Joshua");
        kimmich.setTopspielerNachname("Kimmich");
        kimmich.setTopspielerAlter(30);
        kimmich.setTopspielerPosition("Mittelfeld / Verteidigung");

        Topspieler havertz = new Topspieler();
        havertz.setTopspielerVorname("Kai");
        havertz.setTopspielerNachname("Havertz");
        havertz.setTopspielerAlter(26);
        havertz.setTopspielerPosition("Offensives Mittelfeld / Sturm");

        Topspieler schlotterbeck = new Topspieler();
        schlotterbeck.setTopspielerVorname("Nico");
        schlotterbeck.setTopspielerNachname("Schlotterbeck");
        schlotterbeck.setTopspielerAlter(25);
        schlotterbeck.setTopspielerPosition("Verteidigung");

        Topspieler ruediger = new Topspieler();
        ruediger.setTopspielerVorname("Antonio");
        ruediger.setTopspielerNachname("Ruediger");
        ruediger.setTopspielerAlter(33);
        ruediger.setTopspielerPosition("Verteidigung");

        Topspieler werner = new Topspieler();
        werner.setTopspielerVorname("Timo");
        werner.setTopspielerNachname("Werner");
        werner.setTopspielerAlter(29);
        werner.setTopspielerPosition("Sturm");

        Topspieler yamal = new Topspieler();
        yamal.setTopspielerVorname("Lamine");
        yamal.setTopspielerNachname("Yamal");
        yamal.setTopspielerAlter(18);
        yamal.setTopspielerPosition("Rechtsau�en");

        Topspieler torres = new Topspieler();
        torres.setTopspielerVorname("Ferran");
        torres.setTopspielerNachname("Torres");
        torres.setTopspielerAlter(25);
        torres.setTopspielerPosition("Sturm");

        Topspieler lewandowski = new Topspieler();
        lewandowski.setTopspielerVorname("Robert");
        lewandowski.setTopspielerNachname("Lewandowski");
        lewandowski.setTopspielerAlter(36);
        lewandowski.setTopspielerPosition("Sturm");

        Topspieler fati = new Topspieler();
        fati.setTopspielerVorname("Ansu");
        fati.setTopspielerNachname("Fati");
        fati.setTopspielerAlter(22);
        fati.setTopspielerPosition("Sturm / Fl�gel");

        Topspieler raphinha = new Topspieler();
        raphinha.setTopspielerVorname("Raphinha");
        raphinha.setTopspielerNachname("Raphinha");
        raphinha.setTopspielerAlter(28);
        raphinha.setTopspielerPosition("Fl�gel");

        Topspieler zaireEmery = new Topspieler();
        zaireEmery.setTopspielerVorname("Warren");
        zaireEmery.setTopspielerNachname("Za�re-Emery");
        zaireEmery.setTopspielerAlter(19);
        zaireEmery.setTopspielerPosition("Mittelfeld");

        Topspieler vitinha = new Topspieler();
        vitinha.setTopspielerVorname("Vitinha");
        vitinha.setTopspielerNachname("Vitinha");
        vitinha.setTopspielerAlter(25);
        vitinha.setTopspielerPosition("Mittelfeld");

        Topspieler barcola = new Topspieler();
        barcola.setTopspielerVorname("Bradley");
        barcola.setTopspielerNachname("Barcola");
        barcola.setTopspielerAlter(23);
        barcola.setTopspielerPosition("Angriff / Fl�gel");

        Topspieler kvaratskhelia = new Topspieler();
        kvaratskhelia.setTopspielerVorname("Khvicha");
        kvaratskhelia.setTopspielerNachname("Kvaratskhelia");
        kvaratskhelia.setTopspielerAlter(23);
        kvaratskhelia.setTopspielerPosition("Angriff / Fl�gel");

        Topspieler ramos = new Topspieler();
        ramos.setTopspielerVorname("Gon�alo");
        ramos.setTopspielerNachname("Ramos");
        ramos.setTopspielerAlter(24);
        ramos.setTopspielerPosition("Sturm");
        
        Topspieler doue = new Topspieler();
        doue.setTopspielerVorname("D�sir�");
        doue.setTopspielerNachname("Doue");
        doue.setTopspielerAlter(20);
        doue.setTopspielerPosition("Angriff / Mittelfeld");
        
        Topspieler cherki = new Topspieler();
        cherki.setTopspielerVorname("Rayan");
        cherki.setTopspielerNachname("Cherki");
        cherki.setTopspielerAlter(20);
        cherki.setTopspielerPosition("Offensives Mittelfeld / Fl�gel");

        Topspieler gavi = new Topspieler();
        gavi.setTopspielerVorname("Gavi");
        gavi.setTopspielerNachname("Piqu�");
        gavi.setTopspielerAlter(19);
        gavi.setTopspielerPosition("Mittelfeld / Offensiv");

        Topspieler jonathanDavid = new Topspieler();
        jonathanDavid.setTopspielerVorname("Jonathan");
        jonathanDavid.setTopspielerNachname("David");
        jonathanDavid.setTopspielerAlter(23);
        jonathanDavid.setTopspielerPosition("Sturm / Fl�gel");

        Topspieler antonio = new Topspieler();
        antonio.setTopspielerVorname("Antonio");
        antonio.setTopspielerNachname("Cesar");
        antonio.setTopspielerAlter(24);
        antonio.setTopspielerPosition("Sturm");

        Topspieler olmo = new Topspieler();
        olmo.setTopspielerVorname("Dani");
        olmo.setTopspielerNachname("Olmo");
        olmo.setTopspielerAlter(24);
        olmo.setTopspielerPosition("Mittelfeld / Fl�gel");

        Topspieler bakayoko = new Topspieler();
        bakayoko.setTopspielerVorname("Tiemou�");
        bakayoko.setTopspielerNachname("Bakayoko");
        bakayoko.setTopspielerAlter(28);
        bakayoko.setTopspielerPosition("Mittelfeld / Defensiv");

        Topspieler upamecano = new Topspieler();
        upamecano.setTopspielerVorname("Dayot");
        upamecano.setTopspielerNachname("Upamecano");
        upamecano.setTopspielerAlter(24);
        upamecano.setTopspielerPosition("Verteidigung / Innenverteidiger");

        Topspieler reus = new Topspieler();
        reus.setTopspielerVorname("Marco");
        reus.setTopspielerNachname("Reus");
        reus.setTopspielerAlter(34);
        reus.setTopspielerPosition("Offensives Mittelfeld / Fl�gel");

        Topspieler insigne = new Topspieler();
        insigne.setTopspielerVorname("Lorenzo");
        insigne.setTopspielerNachname("Insigne");
        insigne.setTopspielerAlter(32);
        insigne.setTopspielerPosition("Fl�gel / Sturm");

        Topspieler demir = new Topspieler();
        demir.setTopspielerVorname("Yusuf");
        demir.setTopspielerNachname("Demir");
        demir.setTopspielerAlter(21);
        demir.setTopspielerPosition("Fl�gel / Offensiv");

        Topspieler gomez = new Topspieler();
        gomez.setTopspielerVorname("Alejandro");
        gomez.setTopspielerNachname("G�mez");
        gomez.setTopspielerAlter(35);
        gomez.setTopspielerPosition("Offensives Mittelfeld / Fl�gel");

        Topspieler bellingham = new Topspieler();
        bellingham.setTopspielerVorname("Jude");
        bellingham.setTopspielerNachname("Bellingham");
        bellingham.setTopspielerAlter(20);
        bellingham.setTopspielerPosition("Mittelfeld");

        Topspieler sancho = new Topspieler();
        sancho.setTopspielerVorname("Jadon");
        sancho.setTopspielerNachname("Sancho");
        sancho.setTopspielerAlter(24);
        sancho.setTopspielerPosition("Fl�gel / Angriff");

        Topspieler dest = new Topspieler();
        dest.setTopspielerVorname("Sergi�o");
        dest.setTopspielerNachname("Dest");
        dest.setTopspielerAlter(22);
        dest.setTopspielerPosition("Verteidigung / Rechtsverteidiger");

        Topspieler arnold = new Topspieler();
        arnold.setTopspielerVorname("Trent");
        arnold.setTopspielerNachname("Alexander-Arnold");
        arnold.setTopspielerAlter(24);
        arnold.setTopspielerPosition("Verteidigung / Rechtsverteidiger");

        Topspieler cancelo = new Topspieler();
        cancelo.setTopspielerVorname("Jo�o");
        cancelo.setTopspielerNachname("Cancelo");
        cancelo.setTopspielerAlter(28);
        cancelo.setTopspielerPosition("Verteidigung / Au�enverteidiger");

        Topspieler alaba = new Topspieler();
        alaba.setTopspielerVorname("David");
        alaba.setTopspielerNachname("Alaba");
        alaba.setTopspielerAlter(31);
        alaba.setTopspielerPosition("Verteidigung / Mittelfeld");

        Topspieler kante2 = new Topspieler();
        kante2.setTopspielerVorname("N'Golo");
        kante2.setTopspielerNachname("Kant�");
        kante2.setTopspielerAlter(32);
        kante2.setTopspielerPosition("Defensives Mittelfeld");

        // Spieler zur Liste hinzuf�gen
        spielerListe.add(cherki);
        spielerListe.add(gavi);
        spielerListe.add(jonathanDavid);
        spielerListe.add(antonio);
        spielerListe.add(olmo);
        spielerListe.add(bakayoko);
        spielerListe.add(upamecano);
        spielerListe.add(reus);
        spielerListe.add(insigne);
        spielerListe.add(demir);
        spielerListe.add(gomez);
        spielerListe.add(bellingham);
        spielerListe.add(sancho);
        spielerListe.add(dest);
        spielerListe.add(arnold);
        spielerListe.add(cancelo);
        spielerListe.add(alaba);
        spielerListe.add(kante2);
        spielerListe.add(messi);
        spielerListe.add(ronaldo);
        spielerListe.add(neymar);
        spielerListe.add(wirtz);
        spielerListe.add(yildiz);
        spielerListe.add(mbappe);
        spielerListe.add(dembele);
        spielerListe.add(deBruyne);
        spielerListe.add(guler);
        spielerListe.add(musiala);
        spielerListe.add(kimmich);
        spielerListe.add(havertz);
        spielerListe.add(schlotterbeck);
        spielerListe.add(ruediger);
        spielerListe.add(werner);
        spielerListe.add(yamal);
        spielerListe.add(torres);
        spielerListe.add(lewandowski);
        spielerListe.add(fati);
        spielerListe.add(raphinha);
        spielerListe.add(zaireEmery);
        spielerListe.add(vitinha);
        spielerListe.add(barcola);
        spielerListe.add(kvaratskhelia);
        spielerListe.add(ramos);
        spielerListe.add(doue);

        
        // View starten
        view = new MainWindow(this);
        view.setVisible(true);
    }

    /**
     * Wird vom Button "Ermitteln" aufgerufen
     */
    public void ermittleSpieler()
    {
        String eingabe = view.getNachname().trim();

        // Eingabepr�fung
        if (eingabe.isEmpty())
        {
            view.zeigeFehlermeldung("Bitte einen Nachnamen eingeben!");
            return;
        }

        // Suche in der Liste
        for (Topspieler spieler : spielerListe)
        {
            if (spieler.getTopspielerNachname()
                    .equalsIgnoreCase(eingabe))
            {
                view.zeigeSpieler(spieler);
                return;
            }
        }

        // Falls kein Spieler gefunden
        view.zeigeFehlermeldung("Spieler nicht gefunden!");
    }
}
