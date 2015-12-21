
public class NewThread implements Runnable{
     Thread t;
     NewThread(){
    	 t=new Thread(this,"Demo Thread");
    	 System.out.println("Chile Thread: "+t);
    	 t.start();
     }
     public synchronized void run(){
    	 try{
    		 for(int i=0;i<5;i++){
    			 System.out.println("Child Thread: "+i);
    			 Thread.sleep(500);
    		 }
    	 }
    	 catch(InterruptedException e){
    		 System.out.println("Child Interrupted");
    	 }
    	 System.out.println("Exiting Child Thread");
     }
}
