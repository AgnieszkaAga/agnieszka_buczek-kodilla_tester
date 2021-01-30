package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private String size;
    private boolean sealed;

    public Stamp(String name, String size, boolean sealed) {
        this.name = name;
        this.size = size;
        this.sealed = sealed;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public boolean isSealed() {
        return sealed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return sealed == stamp.sealed && Objects.equals(name, stamp.name) && Objects.equals(size, stamp.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, sealed);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", sealed=" + sealed +
                '}';
    }
}
