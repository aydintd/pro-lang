import javax.swing.JOptionPane;

public class Dizisiralama {
	public static void main(String[] args) {
		int[] dizi = new_list();
		JOptionPane.showMessageDialog(null, "Dizi " + list2str(dizi), "Dizi", 1);
		JOptionPane.showMessageDialog(null, "Büyükten Kücüge: " + list2str(b_sort(dizi)), "Dizi", 1);
		JOptionPane.showMessageDialog(null, "Küçükten Büyüğe: " + list2str(sort(dizi)), "Dizi", 1);
		JOptionPane.showMessageDialog(null, "Max: " + max(dizi), "Dizi", 1);
		JOptionPane.showMessageDialog(null, "Toplamı: " + sum(dizi), "Dizi", 1);
	}

	public static int[] new_list() {
		final int size = 10;
		int i = 0;
		int[] myArray = new int[size];

		for (i=0; i<size; i++) {
			int a = Integer.parseInt(JOptionPane.showInputDialog(null, i+1+". Sayı :", "Sayı Girişi", 1));
			myArray[i] = a;
		}
		return myArray;
	}

	public static String list2str(int[] dizi) {
		int i = 0;
		String strArray = "";
		int size = dizi.length;

		for (i=0; i<size; i++) {
			if (i != size - 1)
				strArray += dizi[i] + " - ";
			else
				strArray += dizi[i];
		}
		return strArray;
	}

	public static int[] sort(int[] dizi) {
		int[] s_dizi = dizi;
		for (int k = 0; k < s_dizi.length; k++) {
			for (int i = 0; i < s_dizi.length - 1 ; i++) {
				if(s_dizi[i] >= s_dizi[i + 1]) {
					int temp = s_dizi[i + 1];
					s_dizi[i + 1] = s_dizi[i];
					s_dizi[i] = temp;
				}
			}
		}
		return s_dizi;
	}

	public static int[] b_sort(int[] dizi) {
		int[] s_dizi = dizi;
		for (int k = 0; k < s_dizi.length; k++) {
			for (int i = 0; i < s_dizi.length - 1 ; i++) {
				if(s_dizi[i] <= s_dizi[i + 1]) {
					int temp = s_dizi[i + 1];
					s_dizi[i + 1] = s_dizi[i];
					s_dizi[i] = temp;
				}
			}
		}
		return s_dizi;
	}

	public static int max(int[] dizi) {
		return b_sort(dizi)[0];
	}

	public static int sum(int[] dizi) {
		int sum = 0;
		for (int i = 0; i < dizi.length; i++) {
			sum += dizi[i];
		}
		return sum;
	}
}