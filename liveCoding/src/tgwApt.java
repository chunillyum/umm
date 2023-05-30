import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class tgwApt {

	public static void main(String[] args) {
		String id = args[0];
		String bright = args[1];
		Elevator yunElevator = new Elevator(id);
		yunElevator.callForUp(1);
		Security homeSecurity = new Security(id);
		homeSecurity.off();
		Lighting hallLamp = new Lighting(id+" / hallLamp");
		hallLamp.on();
		Lighting roomLamp = new Lighting(id+" / roomLamp");
		roomLamp.on();
		DimmingLights moodLamp = new DimmingLights (id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
				
				}

}
