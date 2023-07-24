
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;


class JavaPaintUI extends JFrame {

    private int tool = 1;
    public List<Point> points=new ArrayList();

    public JavaPaintUI() {

    }
    
    public void addPoint(Point p){
        points.add(p);
    }
    
    public void go(){
        initComponents();
    }

    private void initComponents() {

        jPanel2 = new Panel2();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        

        this.setContentPane(jPanel2);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    public JPanel jPanel2;

    class Panel2 extends JPanel {

        Panel2() {

            setPreferredSize(new Dimension(1000,1000));
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            if (points.size()==0) return;
            
            Point origin=points.get(0);
     
            
            for (Point p : points){
                if (p==origin) continue;
                g.drawLine(origin.x, origin.y, p.x, p.y);
                origin.x=p.x;
                origin.y=p.y;
            }
            
        }
    }
    
    
}