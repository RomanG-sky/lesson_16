package lgs.lviv.ua;

import java.util.Objects;

public class Camera implements Comparable<Camera> {

	private String trade_mark;
	public String model;
	private double Mpx;

	public Camera(String trade_mark, String model, double mpx) {
		super();
		this.trade_mark = trade_mark;
		this.model = model;
		Mpx = mpx;
	}

	public Camera() {
		super();
	}

	public String getTrade_mark() {
		return trade_mark;
	}

	public void setTrade_mark(String trade_mark) {
		this.trade_mark = trade_mark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getMpx() {
		return Mpx;
	}

	public void setMpx(double mpx) {
		Mpx = mpx;
	}

	@Override
	public int compareTo(Camera o) {
		return this.trade_mark.compareTo(o.getTrade_mark());
	}

	@Override
	public int hashCode() {
		return Objects.hash(Mpx, model, trade_mark);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Camera other = (Camera) obj;
		return Double.doubleToLongBits(Mpx) == Double.doubleToLongBits(other.Mpx) && Objects.equals(model, other.model)
				&& Objects.equals(trade_mark, other.trade_mark);
	}

	@Override
	public String toString() {
		return "Camera [trade_mark=" + trade_mark + ", model=" + model + ", Mpx=" + Mpx + "]";
	}
}
