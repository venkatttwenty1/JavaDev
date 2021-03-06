package io.javabrains.springbootstarter.topics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicrepo;
	
	public List<Topic> getAllTopics()
	{	
		List<Topic> topics =new ArrayList<Topic>();
		topicrepo.findAll().forEach(topics::add);
		return topics;
	}
	
	public Optional<Topic> getTopic(String id)
	{
		return topicrepo.findById(id);
	}
	
	public void addTopic(Topic topic)
	{
		topicrepo.save(topic);
	}
	public void updateTopic(String id,Topic topic)
	{
		topicrepo.save(topic);
	}
	
	public void deleteTopic(String id,Topic topic)
	{
		topicrepo.deleteById(id);
	}
	
}
