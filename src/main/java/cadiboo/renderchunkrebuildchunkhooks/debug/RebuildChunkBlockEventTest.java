package cadiboo.renderchunkrebuildchunkhooks.debug;

import cadiboo.renderchunkrebuildchunkhooks.event.RebuildChunkEvent.RebuildChunkBlocksEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
@Mod(modid = RebuildChunkBlockEventTest.MODID, name = "RebuildChunkBlockEventTest", version = "1.0", acceptableRemoteVersions = "*", clientSideOnly = true)
public class RebuildChunkBlockEventTest {

	public static final String MODID = "rebuild_chunk_block_event_test";
	private static final boolean ENABLED = true;

	@SubscribeEvent
	public static void onRebuildChunkBlocks(final RebuildChunkBlocksEvent event) {

		event.setCanceled(true);
		System.out.println("eh?");

	}

}