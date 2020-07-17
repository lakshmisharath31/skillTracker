package org.launchcode.skillstracker.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillController {

    @GetMapping
    public String skillsTracker(){
        String html="<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Skills to learn</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>TypeScript</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        return html;

    }

     @GetMapping("form")
     public String skillsTrackerForm(){
        String form = "<html>" +
                "<body>" +
                "<form method=post action = '/success' >" +
                "<label>Enter your Name: <input type='text' name = 'username' /></label><hr>" +
                "<label >My favorite language: <br>" +
                "<select name='firstSkill'>"+
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='TypeScript'>TypeScript</option>" +
                "</select></label><br>" +
                "<label >My second favorite language: <br> " +
                "<select name='secondSkill'>"+
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='TypeScript'>TypeScript</option>" +
                "</select></label><br>" +
                "<label >My third favorite language: <br> " +
                "<select name='thirdSkill'>"+
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='TypeScript'>TypeScript</option>" +
                "</select></label><br>" +
                "<input type='submit' value= 'Submit'/>" +
                "</form>"+
                "</body>" +
                "</html>" ;
       return form;

    }

     @PostMapping("success")
     public String skillsTrackerFormSuccess(@RequestParam String username, String firstSkill,String secondSkill,String thirdSkill){
        String html="<html>" +
                          "<body>" +
                          "<h1>Skills Tracker for "+ username+" </h1>" +
                          "<h2>Skills to learn</h2>" +
                          "<ol>" +
                          "<li>"+firstSkill+"</li>" +
                          "<li>"+secondSkill+"</li>" +
                          "<li>"+thirdSkill+"</li>" +
                          "</ol>" +
                          "</body>" +
                          "</html>";
        return html;

    }
    }
