package com.ruthik.www;

class Television{
	private	int brightness,volume,contrast;
	
	void playmovies() {
		System.out.println("TV is playing movie");
	}
	void playRadio() {
		System.out.println("TV is playing music in radio");
	}
	public int getBrightness() {
		return brightness;
	}
	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume<=60) {
			this.volume = volume;
		}
		else {
			System.out.println("Kindly dont cross above 60");
		}
	}
	public int getContrast() {
		return contrast;
	}
	public void setContrast(int contrast) {
		this.contrast = contrast;
	}	
}
public class Beta {

	public static void main(String[] args) {
		Television t = new Television();
		t.setBrightness(100);
		t.setContrast(100);
		t.setVolume(100);
		System.out.println(t.getBrightness());
		System.out.println(t.getContrast());
		System.out.println(t.getVolume());
		//t.brightness=100;
		//t.contrast=100;
		//t.volume=100;
		//System.out.println(t.brightness);
		//System.out.println(t.contrast);
		//System.out.println(t.volume);
		t.playmovies();
		t.playRadio();

	}

}
