package lang;

import java.io.IOException;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import simulation.Research_Enum;
import simulation.Unit_Enum;
import utilities.IO_Utilities;

public class GUI_Lang {
    private static final GUI_Lang gui = new GUI_Lang();
    public final String shipyard_of_argessor;
    public final String shipyard_of_defender;
    public final String defense_of_defender;
    public final String research;;
    public final String agressor;;
    public final String defender;
    private static Hashtable<String,String> texts;
    public GUI_Lang() {
        texts = new Hashtable<>();
        shipyard_of_argessor = "Stocznia agresora";
        shipyard_of_defender = "Stocznia obrońcy";
        defense_of_defender = "Obrona obrońcy";
        research = "Badania";
        agressor = "Agresor";
        defender = "Obrońca";        
        texts.put("Light_Fighter", "Lekki myśliwiec");
        texts.put("Heavy_Fighter", "Ciężki myśliwiec");
        texts.put("Cruiser", "Krążownik");
        texts.put("Battleship", "Okręt wojenny");
        texts.put("Battlecruiser", "Pancernik");
        texts.put("Bomber", "Bombowiec");
        texts.put("Destroyer", "Niszczyciel");
        texts.put("Deathstar", "Gwiazda Śmierci");
        texts.put("Small_Cargo", "Mały transporter");
        texts.put("Large_Cargo", "Duży transporter");
        texts.put("Colony_Ship", "Statek kolonizacyjny");
        texts.put("Recycler", "Recykler");
        texts.put("Espionage_Probe", "Sonda szpiegowska");
        texts.put("Solar_Satellite", "Satelita słoneczny");
        
        texts.put("Rocket_Launcher", "Wyrzutnia rakiet");
        texts.put("Light_Laser", "Lekkie działo laserowe");
        texts.put("Heavy_Laser", "Ciężkie działo laserowe");
        texts.put("Gauss_Cannon", "Działo Gaussa");
        texts.put("Ion_Cannon", "Działo jonowe");
        texts.put("Plasma_Turret", "Wyrzutnia plazmy");
        texts.put("Small_Shield_Dome", "Mała powłoka ochronna");
        texts.put("Large_Shield_Dome", "Duża powłoka ochronna");
        texts.put("Anti_Ballistic_Missiles", "Przeciwrakieta");
        texts.put("Interplanetary_Missiles", "Rakieta międzyplanetarna");
        
        texts.put("Energy_Technology", "Technologia energetyczna");
        texts.put("Laser_Technology", "Technologia laserowa");
        texts.put("Ion_Technology", "Technologia jonowa");
        texts.put("Hyperspace_Technology", "Technologia nadprzestrzenna");
        texts.put("Plasma_Technology", "Technologia plazmowa");
        texts.put("Combustion_Drive", "Napęd spalinowy");
        texts.put("Impulse_Drive", "Napęd impulsowy");
        texts.put("Hyperspace_Drive", "Napęd nadprzestrzenny");
        texts.put("Espionage_Technology", "Technologia szpiegowska");
        texts.put("Computer_Technology", "Technologia komputerowa");
        texts.put("Astrophysics", "Astrofizyka");
        texts.put("Intergalactic_Research_Network", "Międzygalaktyczna Sieć Badań Naukowych");
        texts.put("Graviton_Technology", "Rozwój grawitonów");
        texts.put("Weapons_Technology", "Technologia bojowa");
        texts.put("Shielding_Technology", "Technologia ochronna");
        texts.put("Armour_Technology", "Opancerzenie");
        texts.put("Metal", "Metal");
        texts.put("Crystal", "Kryształ");
        texts.put("Deuterium", "Deuter");
        try {
            IO_Utilities.save_ini("polish", texts);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static GUI_Lang getGUI(){
        return gui;
    }
    public static String get(String key){
        return texts.getOrDefault(key,key);
    }

    
}