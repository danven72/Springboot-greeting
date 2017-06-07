package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The @RequestMapping annotation ensures that HTTP requests to /greeting are mapped to the greeting() method
 * The example does not specify GET vs. PUT, POST, and so forth, because @RequestMapping maps all HTTP operations by default. 
 * Use @RequestMapping(method=GET) to narrow this mapping. 
 */

/**
 *  @RequestParam binds the value of the query String parameter name into the name parameter of the greeting() method. 
 *  This query String parameter is not required; if it is absent in the request, the defaultValue of "World" is used. 
 *  The value of the name parameter is added to a Model object, ultimately making it accessible to the view template. 
 */

@Controller
public class GreetingController 
{
	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) 
	{
        model.addAttribute("name", name);
        return "greeting";
    }
}
