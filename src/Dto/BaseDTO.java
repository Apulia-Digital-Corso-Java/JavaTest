package Dto;

import java.util.Objects;

public class BaseDTO {
	private Long id;

	BaseDTO () {
		this.id = 123456L;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof BaseDTO)) return false;
		BaseDTO that = (BaseDTO) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

}