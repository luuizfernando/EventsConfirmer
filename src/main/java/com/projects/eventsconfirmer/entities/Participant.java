package com.projects.eventsconfirmer.entities;

import java.io.Serializable;

public class Participant implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private	String cpf;
	private Boolean presence;
	
	
	public Participant() {}
	public Participant(Long id, String name, String cpf, Boolean presence) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.presence = presence;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Boolean getPresence() {
		return presence;
	}
	public void setPresence(Boolean presence) {
		this.presence = presence;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participant other = (Participant) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
}