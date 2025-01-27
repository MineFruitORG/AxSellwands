package com.artillexstudios.axsellwands.api.events;

import org.bukkit.block.Block;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;

public class AxSellwandsItemsFromSourceEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final SellwandOperationType operation;
    private final Block source;

    private final Collection<ItemStack> items = new ArrayList<>();

    public AxSellwandsItemsFromSourceEvent(SellwandOperationType type, Block source) {
        this.operation = type;
        this.source = source;
    }

    public SellwandOperationType operation() {
        return operation;
    }

    public Block source() {
        return source;
    }

    public Collection<ItemStack> items() {
        return items;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    public enum SellwandOperationType {
        SELL,
        INSPECT
    }
}