package gameInterfaceDemo.entities.abstracts;

public class BaseEntity {
	private int id;

	public BaseEntity() {
		super();
	}

	public BaseEntity(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
