
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Main {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		String name, artist, duration;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the song name");
		name = sc.nextLine();
		System.out.println("Enter the artist");
		artist = sc.nextLine();
		System.out.println("Enter the duration");
		duration = sc.nextLine();
		sc.close();
		
		Song s = new Song(name, artist, duration);
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Song.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 
		jaxbMarshaller.marshal(s, new FileOutputStream("song.xml"));
	}

}
