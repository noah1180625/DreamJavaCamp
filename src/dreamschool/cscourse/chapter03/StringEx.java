package dreamschool.cscourse.chapter03;

public class StringEx {

	public static void main(String[] args) {
		String name = "�������";
		String tenThousand = "10000";
		int thisYear = 2019;
		int intTenThousand = Integer.parseInt(tenThousand);
		String yesno = "true";
		boolean boolYesNo = Boolean.parseBoolean(yesno);
	
		System.out.println(name+ ":"+ tenThousand);
		System.out.println(thisYear + "��");
		System.out.println(tenThousand + thisYear);
		System.out.println(thisYear + intTenThousand);
		System.out.println(!boolYesNo);
	}

}
