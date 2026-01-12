import javax.swing.JFrame;

public class App{

    public static void main(String[] args) throws Exception {


        int rowCount=21;
        int columnCOunt=19;
        int tilesSize=32;
        int boardWidth=columnCOunt * tilesSize;
        int boardHeight=rowCount * tilesSize;




        JFrame frame =new JFrame("Pack Man");
        frame.setVisible(true);
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PacMan pacmanGame=new PacMan();
        frame.add(pacmanGame);
        frame.pack();
        pacmanGame.requestFocus();
        frame.setVisible(true);














    }
}