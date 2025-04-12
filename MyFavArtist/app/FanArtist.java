public class FanArtist {
    private String name;
    private String greeting;
    private String emoji;

    public FanArtist(String name, String greeting, String emoji) {
        this.name = name;
        this.greeting = greeting;
        this.emoji = emoji;
    }

    public String getName() { return name; }
    public String getGreeting() { return greeting; }
    public String getEmoji() { return emoji; }
}

