package BTK;

public class Getter_Setter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //getter :getirme(readonly) işlemlerinden sorumludur.
	    //setter: işlemi set etmeye yeni değer atamaya yarar.
	}
	public class Product{
		
		int _id;
		String name;
		String description;
		
		
		public int getId() {
			return _id;
		}
		public void setId(int id) {
			_id=id;
		}
	}

}
