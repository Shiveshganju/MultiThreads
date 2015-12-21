
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewThread();
		try{
			for(int i=0;i<5;i++){
				System.out.println("main thrad: "+i);
				Thread.sleep(1000);
			}
		}
			catch(InterruptedException e){
				System.out.println("Main thread interrupted");
			}
			System.out.println("Main thread Exiting");
		}

	}



