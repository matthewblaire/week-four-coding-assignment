import java.util.*;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> employeeNames = new ArrayList<String>(); //instantiate list of employee names
		Set<Integer> ids = new HashSet<Integer>(); //instantiate list of employee ids
		Map<Integer, String> employeeMap = new HashMap<Integer, String>(); //instantiate map of employee names and ids
		
		employeeNames.add("Fred Jones");
		employeeNames.add("Shaggy Rogers");
		employeeNames.add("Scooby Doo");
		employeeNames.add("Daphne Blake");
		employeeNames.add("Velma Dinkley");
		
		ids.add(1481);
		ids.add(2986);
		ids.add(4422);
		ids.add(8754);
		ids.add(6240);
		
		int i = 0;
		
		for (int tempId : ids) {
			
			employeeMap.put(tempId, employeeNames.get(i)); //add ids as keys and employee names as values
			
			i++;
		}
		
		for (int key : employeeMap.keySet()){
			System.out.println("Key: " + key + " Value: " + employeeMap.get(key)); 
			//print out each key and its associated value
		}
		
		StringBuilder idsBuilder = new StringBuilder(); //instantiate new StringBuilder for employee IDs
		for (int id : ids) { // iterate through entries in ids
			idsBuilder.append(id + "-"); //append current id with "-" following
		}
		
		System.out.println(idsBuilder.toString()); //print contents of ids StringBuilder
	
		StringBuilder namesBuilder = new StringBuilder(); //instantiate new StringBuilder for employee names
		for (String name : employeeNames) { // iterate through entries in employeeNames
			namesBuilder.append(name + " ");	// append current name with " " following
		}
		System.out.println(namesBuilder.toString());
		
	}

}
