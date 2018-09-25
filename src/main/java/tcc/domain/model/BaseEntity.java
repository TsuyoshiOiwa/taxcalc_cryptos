package tcc.domain.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@MappedSuperclass
public class BaseEntity implements Serializable {

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	@PrePersist
	public void prePersist() {
		createdAt = new Timestamp(System.currentTimeMillis());
		updatedAt = new Timestamp(System.currentTimeMillis());
	}

	@PreUpdate
	public void preUpdate() {
		updatedAt = new Timestamp(System.currentTimeMillis());
	}

}
