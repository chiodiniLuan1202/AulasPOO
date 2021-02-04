
public class main {

    public static void main(String[] args) {
        HanoiTorre game = new HanoiTorre();


        game.PrintTorres();
        game.RemoveFromAddAt(1, 3);
        game.PrintTorres();
        game.RemoveFromAddAt(1, 2);
        game.PrintTorres();
        game.RemoveFromAddAt(3, 1);
        game.PrintTorres();
        game.RemoveFromAddAt(1, 3);
        game.RemoveFromAddAt(1, 3);
        game.RemoveFromAddAt(1, 3);
        game.PrintTorres();
    }
}