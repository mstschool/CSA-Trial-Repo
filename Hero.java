public class Hero {
    private String name;
    private String power;
    private int level;
    private boolean isAlive;

    public Hero(String name, String power, int level, boolean isAlive) {
        this.name = name;
        this.power = power;
        this.level = level;
        this.isAlive = isAlive;
    }

    // Getter and Setter methods for each parameter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
}
