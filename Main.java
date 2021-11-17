import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws Exception {
       ArrayList<Person> people = new ArrayList<Person>(); //Initiates new Arraylist

       Person newPerson = new Person();
       newPerson.setName("Peyton");
       newPerson.setColor("blue");
       newPerson.setAge(21);
       people.add(newPerson);

       newPerson = new Person();
       newPerson.setName("A");
       newPerson.setColor("pink");
       newPerson.setAge(87);
       people.add(newPerson);

       newPerson = new Person();
       newPerson.setName("B");
       newPerson.setColor("yellow");
       newPerson.setAge(13);
       people.add(newPerson);

       newPerson = new Person();
       newPerson.setName("C");
       newPerson.setColor("black");
       newPerson.setAge(55);
       people.add(newPerson);

       newPerson = new Person();
       newPerson.setName("D");
       newPerson.setColor("green");
       newPerson.setAge(4);
       people.add(newPerson);

       System.out.printf(people.toString()); //USED FOR TESTING TO SHOW THAT THE LIST IS CREATED CORRECTLY
    
        try(FileWriter writer = new FileWriter("data.txt")){//Creates filewriter
            BufferedWriter bw = new BufferedWriter(writer);//sets bufferwriter to use new filewriter
            for(int i = 0; i < people.size(); i++)
            {
                bw.write(i);//writes each object inside people Arraylist
            }
            bw.close();
        }
        catch(IOException ex){
            System.err.println(ex);
            return;
        }

        try(FileReader reader = new FileReader("data.txt");){//Creates 
            BufferedReader br = new BufferedReader(reader);
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            System.out.println(sb);
        }
        catch(IOException ex){
            System.err.println(ex);
            return;
        }
    
    }
}
