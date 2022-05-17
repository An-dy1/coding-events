package org.launchcode.codingevents.models;

public class Event {

  /* FIELDS */
  private String name;
  private String description;

  /* CONSTRUCTOR */
  public Event(String name, String description) {
    this.name = name;
    this.description = description;
  }

  /* METHODS */
  @Override
  public String toString() {
    return name;
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
}
