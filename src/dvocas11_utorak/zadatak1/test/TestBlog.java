package dvocas11_utorak.zadatak1.test;

import dvocas11_utorak.zadatak1.*;

public class TestBlog {

	public static void main(String[] args) {
		BlogPost bp = new BlogPost();

		bp.setNaslov("Prvi post");
		bp.setSadrzaj("Danas je lep dan.");
		
		System.out.println(bp);
		
		BlogPost bp2 = new BlogPost("blog_post.txt");
		
		System.out.println(bp2);
		
		Blog bl = new Blog();
		
		bl.dodajPost(bp);
		bl.dodajPost(bp2);
		
		bl.serijalizujBlog();
		
		bl.deserijalizujBlog();
		
		bl.sacuvajBlogTXT("ceo_blog2.txt");
		
		
	}

}
