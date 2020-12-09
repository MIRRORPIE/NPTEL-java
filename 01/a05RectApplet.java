import java.applet.*;
import java.awt.*;

public class a05RectApplet extends Applet{
    int x, y, w, h;
    public void init(){
        setBackground(Color.YELLOW);
        x = Integer.parseInt(getParameter("xValue"));
        y = Integer.parseInt(getParameter("yValue"));
        w = Integer.parseInt(getParameter("wValue"));
        h = Integer.parseInt(getParameter("hValue"));
    }

    public void paint(Graphics g){
        g.drawRect(x, y, w, h);
        g.drawString("Hello World!", 150, 150);
    }
}
