package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skills() {
    return "<html>" +
            "<body>" +
                "<h1>Skills Tracker</h1>" +
                    "<h2>We have a few skills we would like to learn</h2>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>Python</li>" +
                         "</ol>" +
            "</body>" +
            "</html>";
}

@GetMapping("form")
@ResponseBody
public String form() {
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" +  //submit a request to /hello
                "<label>Name<input type='text' name='name'></label>" +
                "<select name='language'>My favorite language:" +
                "<option value='English'>English</option>" +
                "<option value='Ukrainian'>Ukrainian</option>" +
                "<option value='German'>German</option>" +
                "<option value='French'>French</option>" +
                "<option value='Spanish'>Spanish</option>" +
                "</select>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
}


}
