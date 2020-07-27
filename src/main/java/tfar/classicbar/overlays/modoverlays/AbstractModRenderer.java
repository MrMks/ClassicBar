package tfar.classicbar.overlays.modoverlays;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import tfar.classicbar.overlays.IBarOverlay;

public abstract class AbstractModRenderer implements IBarOverlay {
    @Override
    public boolean shouldRender(EntityPlayer player, RenderGameOverlayEvent.ElementType type) {
        return type == RenderGameOverlayEvent.ElementType.ALL && shouldRender(player);
    }

    protected abstract boolean shouldRender(EntityPlayer player);
}
