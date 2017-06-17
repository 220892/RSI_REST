package REST.REST.to;

import java.util.List;

import org.springframework.hateoas.ResourceSupport;

import REST.REST.model.Post;

public class PostsTO extends ResourceSupport {
	private List<Post> posts;

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
}
