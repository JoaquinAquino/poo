public class TestThread
{
        public static Object Lock1 = new Object();
        public static Object Lock2 = new Object();

        public static void main(String[] args)
        {
                ThreadDemo1 T1 = new ThreadDemo1();
                ThreadDemo2 T2 = new ThreadDemo2();
                T1.start();
                T2.start();
        }

        private static class ThreadDemo1 extends Thread
        {
                public void run()
                {
                        synchronized(Lock1)
                        {
                                System.out.println("Thread 1: "
                                        + "Reteniendo a Lock1...");
                                try { Thread.sleep(10); }
                                catch (InterruptedException e) {}
                                System.out.println("Thread 1: "
                                        + "Esperando a Lock2...");
                                synchronized (Lock2)
                                {
                                System.out.println("Thread 1: "
                                        + "Reteniendo a Lock1 y Lock2");
                                }
                        }
                }
        }

        private static class ThreadDemo2 extends Thread
        {
                public void run()
                {
                        synchronized (Lock2)
                        {
                                System.out.println("Thread 2: "
                                        + "Reteniendo a Lock2...");
                                try { Thread.sleep(10); }
                                catch (InterruptedException e) {}
                                System.out.println("Thread 2: "
                                        + "Esperando por Lock1...");
                                synchronized(Lock1)
                                {
                                System.out.println("Thread 2: "
                                        + "Reteniendo a Lock1 y Lock2");
                                }
                        }
                }
        }
}