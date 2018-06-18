package AdapterDesign;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter{

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		Volt v = getVolt();
		return ConvertVolt(v,10);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		Volt v = getVolt();
		return ConvertVolt(v,40);
	}
	public Volt ConvertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
	
}
