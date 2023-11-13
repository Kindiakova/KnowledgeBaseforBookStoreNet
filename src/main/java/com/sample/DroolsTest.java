package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import java.util.List;
/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

         
			List<Author> authors = FactsCreator.createAuthors();
            List<Genre> genres = FactsCreator.createGenres();
            List<Book> books = FactsCreator.createBooks(authors, genres);
            List<Store> stores = FactsCreator.createStores(books);
            
                for (Author author : authors) {
                	kSession.insert(author);
                }
                for (Genre genre : genres) {
                	kSession.insert(genre);
                }
                for (Book book : books) {
                	kSession.insert(book);
                }
                for (Store store : stores) {
                	kSession.insert(store);
                }

                       
            kSession.fireAllRules();           
           
            kSession.dispose();
            System.out.println("Authors { \n");
            for (Author author : authors) {
                System.out.println(author);
            }

            System.out.println("}\n");
            
            
            System.out.println("Books { \n");
            for (Book book : books) {
                System.out.println(book);
            }            
            System.out.println("}\n");
            
            System.out.println("Stores { \n");
            for (Store store : stores) {
                System.out.println(store);
            }

            System.out.println("}");
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
        
    }

    
}
