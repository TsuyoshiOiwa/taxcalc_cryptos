package tcc.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * @author supertsuyoshi
 * @version 0.1
 *
 * 通貨情報を格納するモデル
 * BTC, JPY, など
 */
@Entity
@Table(name="currencies")
public class Currency extends BaseEntity implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="name")
	private String name;

	@Column(name="name_long")
	private String nameLong;

}
