package java11;

public class Main {
    public static void main(String[] args) {
        Item[] items = {
            new Buki("�S�̌�",20),
            new Armor("��̕�",10)
        };
        for (Item item : items) {
            item.use();
        }
    }
}
