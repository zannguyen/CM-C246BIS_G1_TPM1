package view;

public class Chia {
	public static String tinh(int a, int b) {
        if (b == 0) return "Không chia được cho 0";
        return String.valueOf(a / b);
    }
}

