package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("events")
public class EventController {

//  private static List<String> events = new ArrayList<>();
//  private static Map<String, String> events = new HashMap<>();

  private static List<Event> events = new ArrayList<>();


  @GetMapping()
  public String displayAllEvents(Model model) {
//    events.add(new Event("Event 1", "Red"));
//    events.add(new Event("Event 2", "Orange"));
//    events.add(new Event("Event 3", "Yellow"));

    model.addAttribute("events", events);
    model.addAttribute("title", "Andie's dynamic coding events title");
    model.addAttribute("address", "456 E West St, KC MO");
    return "events/index";
  }

  @GetMapping("create")
  public String renderEventForm(Model model) {
    model.addAttribute("title", "A dynamic title for the create page");
    return "events/create";
  }

  @PostMapping("create")
  public String acceptFormSubmission(@RequestParam String eventName, @RequestParam String eventDescription) {
    if(!eventName.equals("") && !eventDescription.equals("")) {
      events.add(new Event(eventName, eventDescription));
    }
    return "redirect:";
  }
}
