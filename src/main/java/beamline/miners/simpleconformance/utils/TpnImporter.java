package beamline.miners.simpleconformance.utils;

import java.io.IOException;
import java.io.InputStream;

public class TpnImporter {

	public final static String INVISIBLE_EVENT_TYPE = "$invisible$";
	
	public static Object[] load(String name, InputStream input) throws IOException {
//		Petrinet petrinet = PetrinetFactory.newPetrinet(name);
//		TpnParser parser = new TpnParser(input);
//		// LogEvents logEvents = null;
//
//		try {
//			parser.start(petrinet);
//			Marking state = parser.getState();
//			// context.getProvidedObjectManager().createProvidedObject("Initial
//			// marking of "+p.getLabel(), state, context);
//
//			// logEvents = new LogEvents();
//			Iterator<? extends Transition> it = petrinet.getTransitions().iterator();
//
//			while (it.hasNext()) {
//				Transition t = it.next();
//				String s = ((PetrinetGraph) t).getLabel();
//
//				String DELIM = "\\n";
//				int i = s.indexOf(DELIM);
//				if ((i == s.lastIndexOf(DELIM)) && (i > 0)) {
//
//					String s2 = s.substring(i + DELIM.length(), s.length());
//
//					if (s2.equals(INVISIBLE_EVENT_TYPE)) {
//						t.setInvisible(true);
//					}
//				}
//			}
//
//			return new Object[] { petrinet, state };
//			// return new ConnectedObjects(c);
//		} catch (Throwable x) {
//			throw new IOException(x.getMessage());
//		}
		return null;
	}
}
