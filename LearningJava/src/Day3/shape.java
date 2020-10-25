package Day3;

public abstract class shape {
	public double calculateVolume(int side, int height) {
		return calArea(side);
	}
	public abstract double calArea(int side);
}
