package in.shital.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Book {

	private Integer id;
	private String name;
	private Double price;
}


//If we represent this class with @XmlRootElement, then this class object can be converted to xml and xml can be converted to this class object
//For JSON, we dont need any annotation