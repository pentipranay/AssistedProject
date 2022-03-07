//You are given a project to demonstrate the execution of sleep(), wait(), and its uses in the threading concept.
package assistedProjects;
public class Threading_13 {
		private static Object obj = new Object();

		public static void main(String[] args) throws InterruptedException {
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + " Thread is invoked after three second");
			synchronized (obj) {
				obj.wait(3000);
				System.out.println(obj + " Object is in waiting state and invoked after 3 seconds");
			}
		}
}
