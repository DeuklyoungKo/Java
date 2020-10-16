public class J22_2_1 extends Thread {

    private int[] temp;

    public J22_2_1(String threadname) {
        super(threadname);
        temp = new int[10];

        for (int start = 0; start < temp.length; start++) {
            temp[start] = start;
        }
    }

    public void run() {
        for (int start : temp) {
            try {
                Thread.sleep(1000);

            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println("스레드이름:" + currentThread().getName());
            System.out.println("temp value :" + start);
        }
    }

    public static void main(String[] args) {
        J22_2_1 st = new J22_2_1("첫번째");
        st.start();
        J22_2_1 st2 = new J22_2_1("두번째");
        st2.start();        
    }
}
