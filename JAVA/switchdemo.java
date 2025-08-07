public class switchdemo{
    public static void main(String[] args) {

        int number = 3;
        String size;

        switch(number) {
            case 1:
            size = "small";
            break; //--> break the code or stop the when condition found
            case 2:
                size = "medium";
                break;
                case 3:
                    size = "large";
                    break;
                    default:
                        size = "unknown";
                        break;
        }
              System.out.println("size : " + size);
            
        }
    }