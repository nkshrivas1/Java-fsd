package exceptions;

public class InvalidLoginException extends RuntimeException
{
    public InvalidLoginException(String message) {
        super(message);
    }
}
//Task
// login method
// predefined ->  username password
// user will enter -> username password
// if predefined and usr input matched
// successful login
// throw invalidloginexception
