
import OgameApi.Localization;
import OgameApi.LocalizationValues;
import OgameApi.OgameApi;
import OgameApi.Universes;
import OgameApi.Universes.Universe;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.Locale;
import javax.xml.bind.JAXBException;

public class main {

    public static void main(String[] args) throws MalformedURLException, JAXBException, FileNotFoundException {
        String lang = Locale.getDefault().getLanguage();
        Localization localization = OgameApi.getInstance().getLocalization(lang);
        if (localization != null) {
            for (LocalizationValues.Name name : localization.getTechs().getName()) {
                System.out.println(name.getId() + " " + name.getValue());
            }
        }

        //OgameApi.getInstance().getPlayers(myUni);
        //new GUI.GUI();
        //        */
        //HashMap<Unit_Enum,Integer> ships = new HashMap();
        //ships.put(Unit_Enum.Light_Fighter, 1);
        //Solver solver = new Solver(ships, new Battle_Technologies(), new Battle_Technologies());
        //new GUI.GUI();
        //        */
        //HashMap<Unit_Enum,Integer> ships = new HashMap();
        //ships.put(Unit_Enum.Light_Fighter, 1);
        //Solver solver = new Solver(ships, new Battle_Technologies(), new Battle_Technologies());
    }

}
