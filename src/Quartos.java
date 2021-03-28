
public class Quartos {
	private String name;
	private String email;
	private int quarto;
	
	public Quartos() {
		
	}
	public Quartos(String name, String email, int quarto) {
		this.name = name;
		this.email = email;
		this.quarto = quarto;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}
	public int getQuarto() {
		return quarto;
	}
	
	public String toString() {
		return name + ", " + email;
	}
}
