package springbootprojecttopic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SpringBootprojectTopicController {
	
@RequestMapping("/topics")	
public List<Topic> getAlltopics()

{
	
	
	return Arrays.asList(new Topic("springid","springframework","springdescription"),new Topic("javaid","javaframework","javadescription"),new Topic("cid","cframework","cescription"));
	
}


}
