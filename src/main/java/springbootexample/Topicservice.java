package springbootexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class Topicservice {





	private List<Topic> topics = new ArrayList(		
			Arrays.asList(
            new Topic("spring", "spring framework", "spring framework description"),
new Topic("java", "java core", "java  description"), 
           new Topic("javascript", "javascript language","javascript description")));

	
           public List<Topic> getAlltopics()
           {
        	   return topics;
           }


           public Topic getTopic(String name)
           {
        	   return topics.stream().filter(a->a.getId().equals(name)).findFirst().get();
           }
               
         public void addTopic(Topic topic)
           {
        	  topics.add(topic);
           }


		public void updateTopic(String id, Topic topic) {
			for(int i=0;i<topics.size();i++)
			{
				Topic t=topics.get(i);
				if(t.getId().equals(id))
				{
					topics.set(i, topic);
					return;
			}
		}
		}

		public void deleteTopic(String id)
		{
			         	    topics.removeIf(a->a.getId().equals(id));

		}


		



	}


		

	
           

