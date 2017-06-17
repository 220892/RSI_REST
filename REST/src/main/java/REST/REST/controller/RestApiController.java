package REST.REST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import REST.REST.model.Comment;
import REST.REST.model.Post;
import REST.REST.service.BlogService;

@RestController
@RequestMapping("/api/")
public class RestApiController {
	
	@Autowired
	private BlogService blogService;
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String hello() {
		return "Hello!";
	}
	
	@RequestMapping(value = "/post/", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getPost(@RequestParam(value="postId") Long postId) {
		Post post = blogService.getPost(postId);
		if (post != null) {
			return new ResponseEntity<Post>(post, HttpStatus.OK);
		}
		return new ResponseEntity<Post>(post, HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/all/posts/", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllPosts() {
		List<Post> posts = blogService.getAllPosts();
		if (posts != null && !posts.isEmpty()) {
			return new ResponseEntity<List<Post>>(posts, HttpStatus.OK);
		}
		return new ResponseEntity<List<Post>>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(value = "/comments/to/post/", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getCommentsToPost(@RequestParam(value="postId") Long postId) {
		return new ResponseEntity<List<Comment>>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/add/post/", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addPost(@RequestBody String text) {
		if (blogService.addNewPost(text)) {
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.CONFLICT);
	}
	
	@RequestMapping(value = "/add/comment/", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addComment(@RequestBody Comment comment) {
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/modify/post/", method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity<?> modifyPost(@RequestBody Post post) {
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/modify/comment/", method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity<?> modifyComment(@RequestBody Comment comment) {
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/delete/all/", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteAll() {
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
