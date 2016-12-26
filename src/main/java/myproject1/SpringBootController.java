package myproject1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/welcome")
public class SpringBootController 
{

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public Emp home() {
		
		Emp e=new Emp();
		
		e.setName("Navya");
		e.setId("1");
		return e;
	}

}
