package com.gmail.nossr50.events.party;

import com.gmail.nossr50.datatypes.party.Party;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * Called when a player create a party.
 */
public class McMMOPartyCreatedEvent extends PlayerEvent implements Cancellable {
    private Party party;
    private boolean cancelled;

    public McMMOPartyCreatedEvent(Player player, Party party) {
        super(player);

        this.party = party;
        this.cancelled = false;
    }

    /**
     * @return The party created
     */
    public Party getParty() {
        return party;
    }

    /** Following are required for Cancellable **/
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    /** Rest of file is required boilerplate for custom events **/
    private static final HandlerList handlers = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
