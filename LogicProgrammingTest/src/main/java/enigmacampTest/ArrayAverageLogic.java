package enigmacampTest;

import jakarta.validation.ConstraintValidatorContext;
import org.hibernate.validator.constraintvalidation.HibernateConstraintValidatorContext;

import java.util.List;

public class ArrayAverageLogic {

    // menghitung rata2 pada suatu list yang diberikan


    static double average(List<Integer> list){
        //check kondisi dimana jika list null dan kosong balikkan 0
        if (list == null || list.isEmpty()){
            return 0;
        }


        double sum = 0;
        for (int get : list){
            sum += get;
        }

        return sum / list.size();
    }


    public static void main(String[] args) {
        double average = average(List.of(4, 6, 8, 9, 12));
        System.out.println(average);
    }


}
