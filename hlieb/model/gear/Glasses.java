package hlieb.model.gear;

import javax.persistence.*;


@Entity  
@Table(name="Glasses")  
@AttributeOverrides({   
    @AttributeOverride(name="model_name", column=@Column(name="model_name")),  
    @AttributeOverride(name="color", column=@Column(name="color")) ,
    @AttributeOverride(name="manufacturer", column=@Column(name="manufacturer")) 
})  
public class Glasses extends Gear {
	@Transient
	private static long count;
	@Id
	@Column(name = "id_Glasses")
	private final long id = ++count;
	@Enumerated(EnumType.STRING)
	@Column(name="lense_Glasses")
	private GlassesLense lense;

	public Glasses() {
		// TODO Auto-generated constructor stub
	}

	public Glasses(String modelName, String color, String manufacturer,
			GlassesLense lense) {
		super(modelName, color, manufacturer);
		this.lense = lense;
		// TODO Auto-generated constructor stub
	}

	public GlassesLense getLense() {
		return lense;
	}

	@Override
	public String toString() {
		return "Glasses lense " + lense.toString();
	}

}
