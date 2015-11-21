package amidst.map.layer;

import amidst.Options;
import amidst.map.Fragment;

public class VillageLayer extends IconLayer {
	@Override
	public boolean isVisible() {
		return Options.instance.showVillages.get();
	}

	@Override
	public void generateMapObjects(Fragment fragment) {
		Options.instance.world.getVillages(fragment.getCorner(),
				createWorldObjectConsumer(fragment));
	}
}
