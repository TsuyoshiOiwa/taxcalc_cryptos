package tcc.domain.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;



@Entity
@Table(name="sum_order_histories")
public class SumOrderHistory implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	
	@Column(name="timestamp")
	Timestamp timestamp;
	
	@JoinColumn(name="id")
	Exchange exchange;
	
	@JoinColumn(name="id")
	Market market;
	
	@Column(name="order_type")
	
	
	
}
