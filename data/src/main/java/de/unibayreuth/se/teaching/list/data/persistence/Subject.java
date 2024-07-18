package de.unibayreuth.se.teaching.list.data.persistence;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public interface Subject {
    LinkedList<Observer> obs = new LinkedList<>();

    public void register_obs(@NotNull Observer observer);

    public void unregister_obs(@NotNull Observer observer);

    public void notify_obs();

}
