package org.launchcode.codingevents.controllers;

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
  private static Map<String, String> events = new HashMap<>();


  @GetMapping()
  public String displayAllEvents(Model model) {
    events.put("Event 1", "Red");
    events.put("Event 2", "Orange");
    events.put("Event 3", "Yellow");
    model.addAttribute("events", events);
    model.addAttribute("title", "A different title");
    model.addAttribute("address", "456 E West St, KC MO");
    return "events/index";
  }

  @GetMapping("create")
  public String renderEventForm(Model model) {
    model.addAttribute("title", "A different title");
    return "events/create";
  }

  @PostMapping("create")
  public String acceptFormSubmission(@RequestParam String eventName) {
    if(!eventName.equals("")) {
      events.put(eventName, "placeholder");
    }
    return "redirect:";
  }
}
