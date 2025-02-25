package dev.geco.gsit.api.event;

import org.bukkit.event.*;
import org.bukkit.event.player.PlayerEvent;

import dev.geco.gsit.objects.*;

public class PlayerGetUpCrawlEvent extends PlayerEvent {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IGCrawl c;

    private final GetUpReason r;

    public PlayerGetUpCrawlEvent(IGCrawl Crawl, GetUpReason Reason) {
        super(Crawl.getPlayer());
        c = Crawl;
        r = Reason;
    }

    public IGCrawl getCrawl() { return c; }

    public GetUpReason getReason() { return r; }

    public HandlerList getHandlers() { return HANDLERS; }

    public static HandlerList getHandlerList() { return HANDLERS; }

}