public class UserNameValidator {

	private String name;

	public UserNameValidator() {
		name = "";
	}

	private String getValidation() {
		return name;
	}

	private void setValidation(String name) {
		this.name = name;
	}

	public String validate(String name) {
		if(name != null){
                    System.out.println("Validated!");
                } else {
                    System.out.println("Empty");
                }
                return name;
	}

}