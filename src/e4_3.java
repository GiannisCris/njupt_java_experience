public class e4_3 {

    //多线程
    static class Thread implements Runnable {
        private int start,end;

        Thread(int start, int end) {
            this.start = start;
            this.end = end;
        }

        //重写run函数
        @Override
        public void run() {
            int n = 0;
            for (int i = start; i< end; i++) {
                if (isPrimeNumber(i)) {
                    System.out.print(i + "\t");
                    n++;
                    //每行输出五个质数
                    if (n % 5 == 0) {
                        System.out.print("\n");
                    }
                }
            }
            System.out.println(start + "--" + end + "之间有" + n + "个质数");
        }
    }

    public static void main(String[] args) {
        new java.lang.Thread(new Thread(2, 100000), "thread1").start();
        new java.lang.Thread(new Thread(100000, 200000), "thread2").start();

    }

    //判断质数
    static boolean isPrimeNumber(int num){
        if(num == 2) return true;//2特殊处理
        if(num < 2 || num % 2 == 0) return false;//识别小于2的数和偶数
        for(int i=3; i<=Math.sqrt(num); i+=2){
            if(num % i == 0){//识别被奇数整除
                return false;
            }
        }
        return true;
    }
    //i love zhangyan
}
