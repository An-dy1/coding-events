package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

  private static List<String> events = new ArrayList<>();

  @GetMapping()
  public String displayAllEvents(Model model) {
    model.addAttribute("events", events);
    model.addAttribute("title", "My Coding Events");
    return "events/index";
  }

  @GetMapping("create")
  public String renderEventForm(Model model) {
    model.addAttribute("title", "My Coding Events");
    return "events/create";
  }

  @PostMapping("create")
  public String acceptFormSubmission(@RequestParam String eventName) {
    if(!eventName.equals("")) {
      events.add(eventName);
    }
    return "redirect:";
  }
}
