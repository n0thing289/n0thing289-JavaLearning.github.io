public class Homework09{
	public static void main(String[] args){
		Music myMusic = new Music("未闻花名", 3.56);
		// myMusic.play();
		// System.out.println(myMusic.getInfo());
	}
}


class Music{
	String name;
	double times;

	public Music(){

	}

	public Music(String name, double times){
		this.name = name;
		this.times = times;

		play();
		System.out.println(getInfo());
	}

	public void play(){
		System.out.println(this.name + "  is playing");
	}


	public String getInfo(){
		int min = (int)this.times;//强制转换语法
		int sec = (int)((this.times - min) * 100);//自动类型转换
		return this.name + "  " + min + ":" + sec;
	}
}