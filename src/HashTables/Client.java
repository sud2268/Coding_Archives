package HashTables;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HTLinkedList<String, String> list=new HTLinkedList<>();
			HTArrayList<String, String> list2=new HTArrayList<>();

			list.put("apple", "it is red");
			list.put("banana", "it is yellow");
			list.put("grapes", "it is green");
			System.out.println(list);
			System.out.println(list.get("apple"));
//			list.display();
//			System.out.println(list.remove("grapes"));
//			System.out.println("****After removal*****");
//			list.display();
	}

}
