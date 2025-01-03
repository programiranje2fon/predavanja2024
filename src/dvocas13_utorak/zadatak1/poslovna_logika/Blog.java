package dvocas13_utorak.zadatak1.poslovna_logika;

import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dvocas13_utorak.zadatak1.util.LocalDateTimeTypeAdapter;

import java.io.*;
import java.time.LocalDateTime;

public class Blog {
	
	private List<BlogPost> postovi = new ArrayList<BlogPost>();
	
	public void dodajPost(BlogPost noviPost) {
		postovi.add(noviPost);
	}
	
	
	
	public List<BlogPost> getPostovi() {
		return postovi;
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
	
	public void serijalizujBlog(String putanja) {
		try (ObjectOutputStream out =
				new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(putanja)));){
			
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
	
	public void sacuvajBlogJSON(String putanja) {
		try(PrintWriter out = new PrintWriter(new FileWriter(putanja))) {
			
			Gson gson = new GsonBuilder().
					setPrettyPrinting().
					serializeNulls().
					registerTypeAdapter(LocalDateTime.class, new LocalDateTimeTypeAdapter()).create();
					
			String json = gson.toJson(postovi);
			
			out.print(json);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
