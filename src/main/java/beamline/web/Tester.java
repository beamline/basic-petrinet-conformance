package beamline.web;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import beamline.core.miner.exceptions.MinerException;
import beamline.core.web.miner.models.MinerParameterValue;
import beamline.core.web.miner.models.MinerView;
import beamline.core.web.miner.models.Stream;
import beamline.miners.simpleconformance.SimpleConformance;

public class Tester {

	public static void main(String[] args) throws MinerException, InterruptedException {
		
		MinerParameterValue ref = new MinerParameterValue("reference", new File("C:\\Users\\andbur\\Desktop\\reference.tpn"));
		
		SimpleConformance sc = new SimpleConformance();
		sc.configure(Arrays.asList(ref));
		sc.setStream(new Stream("test", "broker.com", ""));
		sc.start();
		
		sc.consumeEvent("1", "A");
		sc.consumeEvent("1", "A");
		sc.consumeEvent("2", "A");
		sc.consumeEvent("2", "B");
		
		List<MinerView> views = sc.getViews(null);
		
		System.out.println("\n\n++++++++++++++++++++++++++++++++");
		for (MinerView v : views) {
			System.out.println("=== " + v.getName().toUpperCase() + " ===");
			System.out.println("");
			System.out.println(v.getValue());
			System.out.println("\n");
		}
		System.out.println("++++++++++++++++++++++++++++++++");
		
		sc.stop();
		System.exit(0);
	}

}
