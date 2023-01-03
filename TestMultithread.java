import java.util.Random;

class TestMultithread{
	public static void main(String args[]){
		RandomThread r = new RandomThread();
		r.start();
	}
}

class RandomThread extends Thread{
	public void run(){
		try{
        	Random r = new Random();
			for(int i=0;i<10;i++){
    			int num = r.nextInt(100);
    			Thread.sleep(1000);
   	    		if(num%2==0)
   	        		new EvenThread(num).start();
   	    		else
   	        		new OddThread(num).start();
            }
        }
        catch(Exception e){
            System.out.println("Interrupted");
        }

	}
}

class EvenThread extends Thread{
	private int num;
	public EvenThread(int num){
		this.num = num;
	}
	public void run(){
		System.out.println("Square of "+num+" = "+num*num);
	}
}

class OddThread extends Thread{
	private int num;
	public OddThread(int num){
		this.num = num;
	}
	public void run(){
		System.out.println("Cube of "+num+" = "+num*num*num);
	}
}
