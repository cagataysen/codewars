import java.util.List;
import java.util.ArrayList;

public class RemoveEveryOther {

    public static Object[] removeEveryOther(Object[] arr) {


        List<Object> newList = new ArrayList<Object>();

        for(int i = 0; i < arr.length; i++){

            if(i%2 == 0){
                newList.add(arr[i]);
            }

        }

        Object[] newObjectArray = new Object[newList.size()];

        for(int j = 0; j < newList.size(); j++){
            newObjectArray[j] = newList.get(j);
        }

        return newObjectArray;


    }
}