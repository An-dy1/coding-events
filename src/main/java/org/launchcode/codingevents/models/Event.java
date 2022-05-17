package org.launchcode.codingevents.models;

import java.util.Objects;

public class Event {

  /* FIELDS */
  private String name;
  private String description;
  private int eventId;

  private static int nextId = 1;

  /* CONSTRUCTOR */
  public Event(String name, String description) {
    this.name = name;
    this.description = description;
    this.eventId = nextId;
    nextId++;
  }

  /* METHODS */
  @Override
  public String toString() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Event event = (Event) o;
    return eventId == event.eventId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId);
  }

  /* GETTERS AND SETTERS */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getEventId() {
    return eventId;
  }
}
