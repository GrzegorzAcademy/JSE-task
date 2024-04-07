public enum Colour {
    
    RED("Czerwony"),
    GREEN("Zielony"),
    BLUE("Niebieski");
    private String description;

    Colour(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
