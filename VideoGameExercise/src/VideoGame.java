public class VideoGame {
    private int code;
    private String title;
    private String console;
    private int gamersQuantity;
    private String category;

    public VideoGame() {}

    public VideoGame(int code, String title, String console, int gamersQuantity, String category) {
        this.code = code;
        this.title = title;
        this.console = console;
        this.gamersQuantity = gamersQuantity;
        this.category = category;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public int getGamersQuantity() {
        return gamersQuantity;
    }

    public void setGamersQuantity(int gamersQuantity) {
        this.gamersQuantity = gamersQuantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
