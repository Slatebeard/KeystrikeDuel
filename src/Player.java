
public class Player {
    private String name;      
    private String fireButton;  

    public Player(String name, String fireButton) {
        this.name = name;
        this.fireButton = fireButton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFireButton() {
        return fireButton;
    }

    public void setFireButton(String fireButton) {
        this.fireButton = fireButton;
    }
}
