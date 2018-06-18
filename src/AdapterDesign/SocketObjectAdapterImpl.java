package AdapterDesign;

public class SocketObjectAdapterImpl implements SocketAdapter {

	private Socket sock = new Socket();
	
	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		return null;
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
	
}
