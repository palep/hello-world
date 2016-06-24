/**
 * 
 */
package applets;

import java.awt.event.*;
import java.awt.*;
import java.applet.*;
/**
 * @author naren_user
 *
 */
public class EventDemo extends Applet implements MouseListener, MouseMotionListener{
	
	String msg= " ";
	int mouseX=0,mouseY=0;
	
	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public void mouseDragged(MouseEvent e) {
		mouseX = e.getXOnScreen();
		mouseY = e.getYOnScreen();
		msg = "*";
		showStatus("mouse dragged at location "+mouseX+" "+mouseY);
		repaint();
		
	}
	public void mouseMoved(MouseEvent e) {
		mouseX = e.getXOnScreen();
		mouseY = e.getYOnScreen();
		msg = "Mouse Moved";
		showStatus("mouse moved at location "+mouseX+" "+mouseY);
		repaint();
	}
	public void mouseClicked(MouseEvent e) {
		mouseX = e.getXOnScreen();
		mouseY = e.getYOnScreen();
		msg = "Mouse Clicked";
		showStatus("mouse clicked at location "+mouseX+" "+mouseY);
		repaint();
	}
	public void mousePressed(MouseEvent e) {
		mouseX = e.getXOnScreen();
		mouseY = e.getYOnScreen();
		msg = "Down";
		showStatus("mouse pressed at location "+mouseX+" "+mouseY);
		repaint();
	}
	public void mouseReleased(MouseEvent e) {
		mouseX = e.getXOnScreen();
		mouseY = e.getYOnScreen();
		msg = "Up";
		showStatus("mouse released at location "+mouseX+" "+mouseY);
		repaint();
	}
	public void mouseEntered(MouseEvent e) {
		mouseX = e.getXOnScreen();
		mouseY = e.getYOnScreen();
		msg = "Mouse Entered";
		showStatus("mouse entered at location "+mouseX+" "+mouseY);
		repaint();
	}
	public void mouseExited(MouseEvent e) {
		mouseX = e.getXOnScreen();
		mouseY = e.getYOnScreen();
		msg = "Mouse Exited";
		showStatus("mouse exited at location "+mouseX+" "+mouseY);
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(msg, mouseX, mouseY);
	}

}
