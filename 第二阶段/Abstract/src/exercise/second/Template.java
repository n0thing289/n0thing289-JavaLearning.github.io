package exercise.second;

public abstract  class Template{
	public abstract void job(); 
	public String calculateTime(){
		long startTime = System.currentTimeMillis();

		job();

		long finalTime = System.currentTimeMillis();
		long time = finalTime - startTime;
		return time + "ms";
	}
}