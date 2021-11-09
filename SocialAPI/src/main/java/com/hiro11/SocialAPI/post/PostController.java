package com.hiro11.SocialAPI.post;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hiro11.SocialAPI.location.Location;
import com.hiro11.SocialAPI.user.User;

@RestController
public class PostController {

	@Autowired
	private PostService postService;

	@RequestMapping(value = "/posts")
	public List<Post> getAllPosts() {

		return postService.getAllPosts();
	}
	
	@RequestMapping(value = "/posts/{id}")
	public Post getPost(@PathVariable String id) {
	    return postService.getPost( id);
	}
	
	@RequestMapping(value = "/posts", method = RequestMethod.POST)
	public void addPost(@RequestBody Post post) {
	     postService.addPost(post);
	}
	
	@RequestMapping(value="/posts/{id}", method = RequestMethod.PUT)
	public void updatePost(@PathVariable String id, @RequestBody Post post) {
	      postService.updatePost(id, post);
	}

}
