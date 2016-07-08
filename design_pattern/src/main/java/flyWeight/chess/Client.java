package flyWeight.chess;

public class Client {
    public static void main(String[] args) {
        ChessFlyWeightFactory factory = new ChessFlyWeightFactory();
        ChessFlyWeight chess1 = factory.getChess("黑色");
        ChessFlyWeight chess2 = factory.getChess("黑色");
        System.out.println(chess1);
        System.out.println(chess2);

        System.out.println("增加外部状态的处理===========");
        chess1.display(new Coordinate(10, 10));
        chess2.display(new Coordinate(20, 20));
    }
}
