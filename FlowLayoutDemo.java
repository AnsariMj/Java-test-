import java.awt.*;
//public class FlowLayoutDemo extends Frame

public class BorderLayoutDemo extends Frame
{
/*  Button b1,b2,b3;
   FlowLayoutDemo()
   {
	setSize(600, 150);
	setTitle("FlowLayout Demo");
	setLayout (new FlowLayout(FlowLayout.LEFT));
	b1=new Button("Button 1");
	b2=new Button("Button 2");
	b3=new Button("Button 3");
	
	
	add(b1);
	add(b2);
	add(b3);
	setVisible(true);
   }
*/

     Button b1,b2,b3;
     BorderLayoutDemo()
     { 
	setSize(500,200);
	setTitle("BorderLayout Demo");
	BorderLayout(new BorderLayout());
	
	b1=new Button("Button1");
	b2=new Button("Button2");
	b3=new Button("Button3");
	b4=new Button("Button4");
	b5=new Button("Button5");

	add(b1, BorderLayout.NORTH);
	add(b2, BorderLayout.SOUTH);
	add(b3, BorderLayout.EAST);
	add(b4, BorderLayout.WEST);
	add(b5, BorderLayout.CENTER);
	
	setVisible(ture);

      }

  public static void main(String args[])
   {
	//new FlowLayoutDemo();
	
	 BorderLayoutDemo frame= new BorderLayoutDemo();
   }
}	