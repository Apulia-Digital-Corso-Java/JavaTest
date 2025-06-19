package Dto;

import java.util.Objects;
import java.util.Random;
import java.util.random.RandomGenerator;

public class BaseDTO //classe che fa sì che ogni volta che una classe figlia di BaseDTO viene istanziata, essa abbia un id casuale.
{
	private int id;

	BaseDTO () {

		this.id = getRandomNumber(1,9999999);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int getRandomNumber(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
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