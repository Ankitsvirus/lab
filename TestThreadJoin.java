package Association;
class TestThreadJoin extends Thread{    
	 public void run(){    
	  for(int i=1;i<=5;i++){    
	   try{    
	    Thread.sleep(500);    
	   }catch(Exception e){System.out.println(e);}    
	  System.out.println(i);    
	  }    
	 }    
	public static void main(String args[]){    
		TestThreadJoin  t1=new TestThreadJoin ();    
		TestThreadJoin  t2=new TestThreadJoin () ;    
		TestThreadJoin  t3=new TestThreadJoin ();    
	 t1.start();    
	 try{    
	  t1.join(1500);    
	 }catch(Exception e){System.out.println(e);}    
	    
	 t2.start();    
	 t3.start();    
	 }    
	}    
