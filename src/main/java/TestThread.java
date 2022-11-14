public class TestThread extends Thread{
    private int sleepTime;

    public TestThread(String name, int sleepTime) {
        super(name);
        this.sleepTime = sleepTime;
    }

    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println(this.getName() + " " + i);
            try{
                this.sleep(sleepTime);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
