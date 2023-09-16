package ru.fsv67;

import java.util.Collection;

/**
 * Интерфейс взаимодействия с БД
 */
public interface Database {
    void load();

    void save();

    public Collection<Entity> getAll();
}
