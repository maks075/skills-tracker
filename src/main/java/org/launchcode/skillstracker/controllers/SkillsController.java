package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
                            "<li>Ruby</li>" +
                         "</ol>" +
            "</body>" +
            "</html>";
}

@GetMapping("form")
@ResponseBody
public String form() {
        return "<html>" +
                "<body>" +
                "<form method='post' action='results'>" +
                "<label>Name:</label><br /><input type='text' name='name'><br />" +
                "<label>My first language of choice:<br>" +
                "<select name='firstlang'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='ruby'>Ruby</option>" +
                "</select></label><br />" +
                "<label>My second favorite language<br />" +
                "<select name='secondlang'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='ruby'>Ruby</option>" +
                "</select></label><br />" +
                "<label>My third favorite language<br />" +
                "<select name='thirdlang'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='ruby'>Ruby</option>" +
                "</select></label><br />" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
}

    @PostMapping("results")
    @ResponseBody
    public String respondToFormSubmision(@RequestParam String name, @RequestParam String firstlang, @RequestParam String secondlang, @RequestParam String thirdlang) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<table>" +
                "<tr><th>First language</th>" +
                "<th>Second language</th>" +
                "<th>Third language</th></tr>" +
                "<tr><td>" + firstlang + "</td>" +
                "<td>" + secondlang + "</td>" +
                "<td>" + thirdlang + "</td></tr>" +
                "</table>" +
                "</body>" +
                "</html>";
    }



}
