package java11;

public class Main {
    public static void main(String[] args) {
        Item[] items = {
            new Buki("“S‚ÌŒ•",20),
            new Armor("”ç‚Ì•ž",10)
        };
        for (Item item : items) {
            item.use();
        }
    }
}
