public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        if (op == "+") {
            return v1 + v2;
        } else if (op == "-") {
            return v1 - v2;
        } else if (op == "*") {
            return v1 * v2;
        } else if (op == "/") { //this one can take not integer value but assuming no... and division by zero watchout...
            return (v1 / v2);
        }
        else {
            return 0;
        }
    }
}