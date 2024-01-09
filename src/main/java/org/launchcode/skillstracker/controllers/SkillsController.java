package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
@GetMapping
    public String prgLanguage(){
         String html =
            "<html>" +
                    "<body>" +
                "<h1>Skills Tracker </h1>"+
                        "<h2>Launguages </h2>"+
                        "<ol>" +
                        "<li>Java</li>"+
                        "<li>JavaScript</li>"+
                        "<li>Python</li>"+
                        "</ol>"+
                    "</body>"+
                    "</html>" ;

        return html;

    }
    @GetMapping("form")
    public String formLaunguage(){
    String fLang =
            "<html>" +
                    "<body>" +
            "<form method = 'post' action = 'hello'>" +
                    "<label for='name'> Name:<br></label>"+
                    "<input type = 'text' name = 'name' /><br><br>"+
                    "<label for='name'> My Favorite Language: <br></label>"+
                    "<select name = 'language1'>" +
                    "<option value = 'Java'> Java </option>" +
                    "<option value = 'JavaScript'> JavaScript </option>" +
                    "<option value = 'Python'> Python </option>" +
                    "</select><br><br>" +
                    "<label for='name'> My Second Favorite Language: <br></label>"+
                    "<select name = 'language2'>" +
                    "<option value = 'Java'> Java </option>" +
                    "<option value = 'JavaScript'> JavaScript </option>" +
                    "<option value = 'Python'> Python </option>" +
                    "</select><br><br>" +
                    "<label for='name'> My Third Favorite Language: <br></label>"+
                    "<select name = 'language3'>" +
                    "<option value = 'Java'> Java </option>" +
                    "<option value = 'JavaScript'> JavaScript </option>" +
                    "<option value = 'Python'> Python </option>" +
                    "</select><br><br>" +
                    "<input type = 'submit' value = 'Submit' />" +
                    "</body>"+
                    "</html>" ;
    return fLang;

    }
    @PostMapping ("hello")
    public String helloWithQueryParam(@RequestParam String name, String language1,String language2,String language3) {
        String myPage =  "<h2>" + name +" </h2>"+
                "<ol>" +
                "<li> " + language1 + " </li>"+
                "<li> " + language2 + " </li>"+
                "<li> " + language3 + " </li>"+
                "</ol>";
        return myPage;
    }

}
