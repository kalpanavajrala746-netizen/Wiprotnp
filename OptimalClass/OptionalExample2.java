package OptionalClass; // Fixed: changed 'Package' to lowercase 'package'

import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        String address = null;
        
        // If address is null, orElse fallbacks to the default value "India"
        String result = Optional.ofNullable(address).orElse("India");
        
        System.out.println(result);
    }
}
