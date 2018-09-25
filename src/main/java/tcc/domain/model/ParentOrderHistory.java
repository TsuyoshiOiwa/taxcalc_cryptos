package tcc.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ParentOrderHistory extends BaseEntity implements Serializable{

	@Column(name="is_copied")
	private Boolean isCopied;

	abstract public SumOrderHistory convert();

	public void setIsCopiedTrue() {
		this.isCopied = true;
	}


}
