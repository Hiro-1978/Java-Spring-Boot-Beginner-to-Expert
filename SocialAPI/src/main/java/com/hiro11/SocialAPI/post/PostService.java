package com.hiro11.SocialAPI.post;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hiro11.SocialAPI.location.Location;
import com.hiro11.SocialAPI.user.User;

@Service
public class PostService {

private PostRepository postRepository;
	
	public List<Post> getAllPosts() {
	   List<Post> posts = new ArrayList<>();
	   
	   postRepository.findAll()
	   .forEach(posts::add);
	   
	   return posts;	 
	}
	
	public List<Post> getPostsByUser(String id) {
		   List<Post> posts = new ArrayList<>();
		   
		   postRepository.findByUserId(id)
		   .forEach(posts::add);
		   
		   return posts;	 
		}
	   	   
	public Optional<Post> getPost(String id) {
		return postRepository.findById(id);
	}

	public void addPost(Post post) {
		postRepository.save(post);
	}
	
	public void updatePost(String id, Post post) {
		postRepository.save(post);
	}
	
	public void deletePost(String id) {
	     postRepository.deleteById(id);	
	}	
	
	/*
	User user1 = new User("u1", "Jany", "Lawrence", new Location("l1", "Lagos"), "Jany@gmail.com");

	User user2 = new User("u2", "Jadon", "Mills", new Location("l2", "Asaba"), "Jadon@gmail.com");

	Post post1 = new Post("p1", "01-Jan-19", user1, "Its good to love and be loved");

	Post post2 = new Post("p2", "02-Jan-19", user2, "We all need someone");

	// List<Post> posts = Arrays.asList(post1, post2);
	List<Post> posts = new ArrayList<>(Arrays.asList(post1, post2));

	public List<Post> getAllPosts() {
		return posts;
	}

	public Post getPost(String id) {
		Post post = posts.stream().filter(t -> id.equals(t.getId())).findFirst().orElse(null);

		return post;
	}

	public void addPost(Post post) {
		posts.add(post);
	}

	public void updatePost(String id, Post post) {

		for (int i = 0; i < posts.size(); i++) {

			Post p = posts.get(i);

			if (p.equals(post)) {

				posts.set(i, post);
			}
		}
	}

	public void deletePost(String id) {
		posts.removeIf(p -> p.getId().equals(id));
	}
*/
}
