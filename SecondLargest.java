import java.util.Arrays;
public class SecondLargest {
public static void main(String[] args) {
    int i=0;
    String val="This is a java i constructor";
    String test[]=val.split(" ");
     int[] arr =new int[test.length];
     for (String st : test) {
        arr[i]=st.length();
        i++;
     }  //test={This,is,    i,constructor}
     Arrays.sort(arr);  //arr={1,1,2,4,4,9}
     for (String st : test) {  //st This 
        if(st.length()==arr[0])  // 4 == 1
        {
            System.out.println(st);
        }
        if(st.length()==arr[arr.length-1])  //4 == 9
        {
            System.out.println(st);
        }

     }

}
}

