//Client
public class Client{
	void createASCIIText(Document doc){
	ASCIIConverter asciiBuilder = new ASCIIConverter();
	RTFReader rtfReader = new RTFReader(asciiBuilder);
		rtfReader.parseRTF(doc);
	ASCIIText asciiText = asciiBuilder.getResult();
	}
	public static void main(String args[]){
		Client client=new Client();
		Document doc=new Document();
		client.createASCIIText(doc);

       system.out.println("This is an example of Builder Pattern");
	}
}