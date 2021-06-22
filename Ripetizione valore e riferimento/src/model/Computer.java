package model;

public class Computer {
	
	private String schedaVideo;
	private int ram;
	private String cpu;
	protected int hd;
	
	public Computer() {}
	public Computer(String schedaVideo, int ram, String cpu, int hd) {
		super();
		this.schedaVideo = schedaVideo;
		this.ram = ram;
		this.cpu = cpu;
	}
	@Override
	public String toString() {
		return schedaVideo + "," + ram + "," + cpu + "," + hd;
	}
	public int getHd() {
		return hd;
	}
	public void setHd(int hd) {
		this.hd = hd;
	}
	public String getSchedaVideo() {
		return schedaVideo;
	}
	public void setSchedaVideo(String schedaVideo) {
		this.schedaVideo = schedaVideo;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpu == null) ? 0 : cpu.hashCode());
		result = prime * result + hd;
		result = prime * result + ram;
		result = prime * result + ((schedaVideo == null) ? 0 : schedaVideo.hashCode());
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
		Computer other = (Computer) obj;
		if (cpu == null) {
			if (other.cpu != null)
				return false;
		} else if (!cpu.equals(other.cpu))
			return false;
		if (hd != other.hd)
			return false;
		if (ram != other.ram)
			return false;
		if (schedaVideo == null) {
			if (other.schedaVideo != null)
				return false;
		} else if (!schedaVideo.equals(other.schedaVideo))
			return false;
		return true;
	}

	
}
