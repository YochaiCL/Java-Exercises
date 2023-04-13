
public class MainPersonThis {

	public static void main(String[] args) {
		boolean flag;

		Person vladi = new Person("vladi");
		System.out.println("-------vladi-------");
		vladi.show();

		Person yochai = new Person("yochai", vladi);
		System.out.println("-------vladi & yochai-------");
		yochai.show();
		vladi.show();

		Person kobi = new Person("kobi");
		System.out.println("-------kobi--------");
		kobi.show();

		yochai.setCoupleOption2(kobi);
		System.out.println("-------kobi & yochai-------");
		kobi.show();
		yochai.show();

		System.out.println("-------vladi-------");
		vladi.show();

	}
}
