package dvocas11_utorak.zadatak1;

import java.util.*;
import java.io.*;

public class Blog {
	
	private List<BlogPost> postovi =
			new ArrayList<BlogPost>();
	
	public void dodajPost(BlogPost noviPost) {
		postovi.add(noviPost);
	}
	
	public void sacuvajBlogTXT(String fajl) {
		try (PrintWriter out = 
					new PrintWriter(
							new FileWriter(fajl));){
			
			for(BlogPost post: postovi) {
				out.println(post);
				out.println();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void serijalizujBlog() {
		try (ObjectOutputStream out =
				new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream("blog.dat")));){
			
			//Varijanta 1 - svaki blog post se serijalizuje posebno u isti fajl.
			for(BlogPost post: postovi)
				out.writeObject(post);
			
			//Varijanta 2 - sacuvam celu listu, cuva se i sve sto je u listi
			//out.writeObject(postovi);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}
	
	public void deserijalizujBlog() {
		try(ObjectInputStream in =
				new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream("blog.dat")));){
			
			//Varijanta 1 - ucitavaju se pojedinacni blog postovi
			postovi.clear();
			
			try {
				while(true) {
					BlogPost post = (BlogPost) in.readObject();
					
					postovi.add(post);
				}
			} catch (Exception e) {}
			
			//Varijanta 2 - ucitava se cela lista i njen sadrzaj
			//postovi = (List<BlogPost>) in.readObject();
									
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
