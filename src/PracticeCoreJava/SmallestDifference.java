package PracticeCoreJava;

public class SmallestDifference {

	public static void main(String[] args) {
		int a[]= {1, 3, 15, 11, 2};
		int b[]= {23, 127, 235, 19, 8};
		int smallDiff=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				int diff=b[j]-a[i];
				System.out.println(diff);
			
				if(diff<smallDiff) {
					smallDiff=diff;
				}
			}
			
		}
		System.out.println(smallDiff);
	}

}
