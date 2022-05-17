package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ExampleController {

  // 1 - communicate with our example.html template to add text to a paragraph
  // 2 - communicate with example.html template to populate a list of purple options
  // 2b - put the logic in a th:block
  // 3 - add data conditionally to example.html template

  @GetMapping("/class-example")
  public String populateParagraph(Model model) {

    String aNewString = "We begin our adventure, as all good adventures must, at a pub...";

    model.addAttribute("newText", aNewString);
    model.addAttribute("newTitle", "Andie's example page");

    List<String> purpleVariants = new ArrayList<>();
    purpleVariants.add("periwinkle");
    purpleVariants.add("violet");
    purpleVariants.add("magenta");
    model.addAttribute("purpleVariants", purpleVariants);

    return "examples/example";
  }


}
