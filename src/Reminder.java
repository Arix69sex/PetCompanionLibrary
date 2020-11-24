import java.util.List;

//Clase que representa un patrón de diseño tipo Observer
//Se encarga de mantener el estado de subscripción de nuestros usuarios

public class Reminder {
    private List<Long> premiumUsers;

    public void addPremiumUser(Long id){
        premiumUsers.add(id);
    }

    public void removeNonPremiumUser(Long id){
        premiumUsers.remove(id);
    }

    public List<Long> getPremiumUsers() {
        return premiumUsers;
    }

    public void setPremiumUsers(List<Long> premiumUsers) {
        this.premiumUsers = premiumUsers;
    }
}
