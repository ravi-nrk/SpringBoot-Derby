package io.miracle.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	
	// Created TopicsService variable
	@Autowired
	private TopicService topicService;
	
	//GET API's
	
	
	// Get all details of topics
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		
		return topicService.getAllTopics();
	}
		
	// Get details of one topic by id
	@RequestMapping("/topics/{id}")	
	public Topic getTopic(@PathVariable String id) {
		
		return topicService.getTopic(id);
	}
		
	
	//Creation of  POST API's
	@RequestMapping(method = RequestMethod.POST, value="/topics")
	//Topic is Array List name
	public String addTopic(@RequestBody Topic topic) {
		
		 topicService.addTopic(topic);
		 
		 return "Record is added";
		
	}
	
	//Creation of PUT API's
	 @RequestMapping(method = RequestMethod.PUT, value="/topics/{id}")
	 public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
	
		 topicService.updateTopic(id, topic);
		 
	 }
	 
	 
	//Creation of DELETE API's
		 @RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
		 public String deleteTopic(@RequestBody Topic topic, @PathVariable String id) {
		
			 topicService.deleteTopic(id);
			 return "Topic is deleted successfully";
			 
		 }
		 
	 
		
		
// asList is a method which acts as bridge between array-based & collection based API's, in combination with collection.toArray(). 
//		return Arrays.asList(
//				new Topic("spring", "spring framework", "Spring Framework Description"),
//				new Topic("Cloud", "AWS", "AWS - Solution Architect"),
//				new Topic("Deployment", "CI/CD", "Jenkins"));
		
		
		
	}

