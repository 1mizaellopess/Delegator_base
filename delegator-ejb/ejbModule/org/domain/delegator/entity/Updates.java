package org.domain.delegator.entity;

// Generated 00:56:58 13/09/2009 by Hibernate Tools 3.2.4.GA

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.NotNull;

/**
 * Updates generated by hbm2java
 */
@Entity
@Table(name = "updates", catalog = "dropdb")
public class Updates implements java.io.Serializable {

	private int tid;
	private Tasks tasks;
	private String updates;
	private Date changeTime;
	private byte memo;

	public Updates() {
	}

	public Updates(Tasks tasks, Date changeTime, byte memo) {
		this.tasks = tasks;
		this.changeTime = changeTime;
		this.memo = memo;
	}

	public Updates(Tasks tasks, String updates, Date changeTime, byte memo) {
		this.tasks = tasks;
		this.updates = updates;
		this.changeTime = changeTime;
		this.memo = memo;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "tasks"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "Tid", unique = true, nullable = false)
	public int getTid() {
		return this.tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	@NotNull
	public Tasks getTasks() {
		return this.tasks;
	}

	public void setTasks(Tasks tasks) {
		this.tasks = tasks;
	}

	@Column(name = "Updates")
	public String getUpdates() {
		return this.updates;
	}

	public void setUpdates(String updates) {
		this.updates = updates;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ChangeTime", nullable = false, length = 19)
	@NotNull
	public Date getChangeTime() {
		return this.changeTime;
	}

	public void setChangeTime(Date changeTime) {
		this.changeTime = changeTime;
	}

	@Column(name = "Memo", nullable = false)
	@NotNull
	public byte getMemo() {
		return this.memo;
	}

	public void setMemo(byte memo) {
		this.memo = memo;
	}

}
