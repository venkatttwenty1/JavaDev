package io.javabrains.springbootstarter.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TopicService {
	private List<Topic> listOfTopics=new ArrayList<>(Arrays.asList(
			new Topic(1,"venkat","Spring"),
			new Topic(2,"Sanyog","Node"),
			new Topic(3,"Vijay","React")
			));
	public List<Topic> getAllTopics()
	{	return listOfTopics;
	}
	
	public Topic getTopic(int id)
	{
		return listOfTopics.stream().filter(t->t.getId()==id).findFirst().get();
	}
	
	public void addTopic(Topic topic)
	{
		listOfTopics.add(topic);
	}
	public void updateTopic(int id,Topic topic)
	{
		int cnt=0;
		for(Topic t:listOfTopics)
		{
			cnt++;
			if(t.getId()==id)
			{
				listOfTopics.set(cnt-1,topic);
				return ;
			}
		}
	}
	
	public void deleteTopic(int id,Topic topic)
	{
		int cnt=0;
		for(Topic t:listOfTopics)
		{
			cnt++;
			if(t.getId()==id)
			{
				listOfTopics.remove(cnt-1);
				return ;
			}
		}
	}
	
}
