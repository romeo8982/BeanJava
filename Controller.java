import java.beans.*;
public class Controller implements VetoableChangeListener,PropertyChangeListener{

	@Override
	public void vetoableChange(PropertyChangeEvent e) throws PropertyVetoException {
		Integer newVal = (Integer) e.getNewValue();
		int val = newVal.intValue();
		if(val == 37)
			throw new PropertyVetoException("Niedopuszczalna zmiana wartoœci", e);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		
		if(evt.getOldValue() instanceof Integer)
		{
			System.out.println("Previous value: " + evt.getOldValue());
			System.out.println("New value: " + evt.getNewValue());
		}
		else
		{
			System.out.println("Previous Color: " + evt.getOldValue());
			System.out.println("New Color: " + evt.getNewValue());
		}
	}
	

}
