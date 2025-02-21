
    - Lớp java.util.Arrays trong java được sử dụng để thực hiện một số thao tác như sao chép, sắp xếp và tìm kiếm các phần tử trên các mảng
1. Java Array get() Method
- Được sử dụng để truy cập giá trị của phần tử tại một vị trí cụ thể trong mảng
- Cú pháp:
    ```java
    public static Object get(Object array, int index)  
                  throws IllegalArgumentException,  
                         ArrayIndexOutOfBoundsException  
    ```
    + array: Mảng mà bạn muốn truy cập.
    + index: Vị trí của phần tử bạn muốn lấy từ mảng.
- Ví dụ:
    + FileName: ReflectArraygetExample.java
        ```java
        import java.lang.reflect.Array;  

        public class ReflectArraygetExample1 {  
            public static void main(String[] args) {  
            
                String[] sarr = (String[]) Array.newInstance(String.class, 3);  
            
                Array.set(sarr, 0, "Java");  
                Array.set(sarr, 1, ".net");  
                Array.set(sarr, 2, "Python");  
                for(int i=0;i<sarr.length;i++)  
                {  
                        System.out.println("sarr["+i+"] = " + Array.get(sarr, i));  
                }  
                
            }  
        }  
        ```
    + Output:
        ```java
        sarr[0] = Java
        sarr[1] = .net
        sarr[2] = Python
        ```
2. Java Array getBoolean() Method
- Được sử dụng để truy cập giá trị boolean tại một vị trí cụ thể trong mảng
- Cú pháp:
    ```java
    public static boolean getBoolean(Object array,  int index)  
                          throws IllegalArgumentException,  
                                 ArrayIndexOutOfBoundsException  
    ```
    + array: Mảng mà bạn muốn truy cập.
    + index: Vị trí của phần tử bạn muốn lấy từ mảng.
- Ví dụ:
    + FileName: ReflectArraygetBooleanExample.java
        ```java
        import java.lang.reflect.Array;  

        public class ReflectArraygetBooleanExample  {  
            public static void main(String[] args) {  
            
                boolean[] sarr = (boolean[]) Array.newInstance(boolean.class, 3);  
            
                Array.set(sarr, 0, true);  
                Array.set(sarr, 1, false);  
                Array.set(sarr, 2, true);  
                for(int i=0;i<sarr.length;i++)  
                {  
                        System.out.println("sarr["+i+"] = " + Array.get(sarr, i));  
                }       
            }  
        }  
        ```
    + Output:
        ```java
        sarr[0] = true
        sarr[1] = false
        sarr[2] = true
        ```
3. Java Array getByte() Method
- Được sử dụng để truy cập giá trị byte tại một vị trí cụ thể trong mảng
- Cú pháp:
    ```java
    public static byte getByte(Object array,   int index)  
                    throws IllegalArgumentException,  
                           ArrayIndexOutOfBoundsException  
    ```
    + array: Mảng mà bạn muốn truy cập.
    + index: Vị trí của phần tử bạn muốn lấy từ mảng.
- Ví dụ:
    + FileName: ReflectArraygetByteExample.java
        ```java
        import java.lang.reflect.Array;  

        public class ReflectArraygetByteExample1   {  
            public static void main(String[] args) {  
            
                byte[] arr = new byte[]{1,2,3};  
            
                for(int i=0;i<arr.length;i++)  
                {  
                        System.out.println("arr["+i+"] = " + Array.get(arr, i));  
                }  
            }  
        }  
        ```
    + Output:
        ```java
        arr[0] = 1
        arr[1] = 2
        arr[2] = 3
        ```
4. Java Array getChar() Method
- Được sử dụng để truy cập giá trị ký tự (char) tại một vị trí cụ thể trong mảng
- Cú pháp:
    ```java
    public static char getChar(Object array,  int index)  
                    throws IllegalArgumentException,  
                           ArrayIndexOutOfBoundsException 
    ```
    + array: Mảng mà bạn muốn truy cập.
    + index: Vị trí của phần tử bạn muốn lấy từ mảng.
- Ví dụ: 
    + FileName: ReflectArraygetCharExample.java
        ```java
        import java.lang.reflect.Array;  

        public class ReflectArraygetCharExample1 {  
            public static void main (String args[]) {  
                char[] arr = new char[]{'J','T','P'};  
            
                char vlu = Array.getChar(arr, 1);  
            
                System.out.println("Value :: " +vlu);  
            }  
        }  
        ```
    + Output:
        ```java
        Value :: T
        ```
5. Java Array getDouble() Method
- Được sử dụng để truy cập giá trị kiểu double tại một vị trí cụ thể trong mảng
- Cú pháp:
    ```java
    public static double getDouble(Object array,  int index)  
                        throws IllegalArgumentException,  
                               ArrayIndexOutOfBoundsException 
    ```
    + array: Mảng mà bạn muốn truy cập.
    + index: Vị trí của phần tử bạn muốn lấy từ mảng.
- Ví dụ:
    + FileName: ReflectArraygetDoubleExample.java
        ```java
        import java.lang.reflect.Array;   

        public class ReflectArraygetDoubleExample1 {   
            public static void main(String[] args)   
            {   
                double arr[] = { 1.9, 2.7, 3.9 };    
                for (int i = 0; i < arr.length; i++) {   
            
                    double vl = Array.getDouble(arr, i);   
                    System.out.print(vl + "  , ");   
                }   
            }   
        }   
        ```
    + Output:
        ```java
        1.9 , 2.7 , 3.9 ,
        ```
6. Java Array getFloat() Method
- Được sử dụng để truy cập giá trị kiểu float tại một vị trí cụ thể trong mảng
- Cú pháp:
    ```java
    public static float getFloat(Object array, int index)  
                      throws IllegalArgumentException,  
                             ArrayIndexOutOfBoundsException  
    ```
    + array: Mảng mà bạn muốn truy cập.
    + index: Vị trí của phần tử bạn muốn lấy từ mảng.
- Ví dụ:
    + FileName: ReflectArraygetFloatExample.java
        ```java
        import java.lang.reflect.Array;

        public class ReflectArraygetFloatExample1 {  
            public static void main (String args[]) {  
                float[] array = new float[]{1.1F,2.2F,3.3F};  
                
                
                float value = Array.getFloat(array, 1);  
            
                System.out.println(value);  
            
            }  
        }  
        ```
    + Output:
        ```java
        2.2
        ```
7. Java Array getInt() Method
- Được sử dụng để truy cập giá trị kiểu int tại một vị trí cụ thể trong mảng
- Cú pháp:
    ```java
    public static int getInt(Object array,  int index)  
                  throws IllegalArgumentException,  
                         ArrayIndexOutOfBoundsException  
    ```
    + array: Mảng mà bạn muốn truy cập.
    + index: Vị trí của phần tử bạn muốn lấy từ mảng.
- Ví dụ:
    + FileName: ReflectArraygetIntExample.java
        ```java
        import java.lang.reflect.Array;  

        public class ReflectArraygetIntExample1 {  
            public static void main(String[] args) {  
            
                int[] arr = new int[]{90,89,79};  
            
                System.out.println("arr[0] = " + Array.getInt(arr, 0));  
                System.out.println("arr[1] = " + Array.getInt(arr, 1));  
                System.out.println("arr[2] = " + Array.getInt(arr, 2));  
            }  
        }  
        ```
    + Output:
        ```java
        arr[0] = 90
        arr[1] = 89
        arr[2] = 79
        ```
8. Java Array getLength() Method
- Được sử dụng để lấy độ dài của một mảng
- Cú pháp:
    ```java
    public static int getLength(Object array)  
                     throws IllegalArgumentException  
    ```
    + array: Mảng mà bạn muốn truy cập.
- Ví dụ:
    + FileName: ReflectArraygetLengthExample.java
        ```java
        import java.lang.reflect.Array;  
        import java.util.Arrays;  

        public class ReflectArraygetLengthExample2  {  
            public static void main(String[] args) {  
                int[] valarr = { 890, 980 };   
                System.out.println("Array length :: " +Array.getLength(valarr));  
            }   
        }  
        ```
    + Output:
        ```java
        Array length :: 2
        ```
9. Java Array getLong() Method
- Được sử dụng để truy cập giá trị kiểu long tại một vị trí cụ thể trong mảng
- Cú pháp:
    ```java
    public static long getLong(Object array, int index)  
                    throws IllegalArgumentException,  
                           ArrayIndexOutOfBoundsException  
    ```
    + array: Mảng mà bạn muốn truy cập.
    + index: Vị trí của phần tử bạn muốn lấy từ mảng.
- Ví dụ:
    + FileName: ReflectArraygetLongExample.java
        ```java
        import java.lang.reflect.Array;  

        public class ReflectArraygetLongExample1 {  
            public static void main (String args[]) {  
                long[] arr = new long[]{89768, 8765678, 9876567};  
                double value = Array.getLong(arr, 1);  
                System.out.println("value :: " +value);  
            }  
        }  
        ```
    + Output:
        ```java
        value :: 8765678.0
        ```
10. Java Array getShort() Method
- Được sử dụng để truy cập giá trị kiểu short tại một vị trí cụ thể trong mảng
- Cú pháp:
    ```java
    public static short getShort(Object array, int index)  
                      throws IllegalArgumentException,  
                             ArrayIndexOutOfBoundsException  
    ```
    + array: Mảng mà bạn muốn truy cập.
    + index: Vị trí của phần tử bạn muốn lấy từ mảng.
- Ví dụ:
    + FileName: ReflectArraygetShortExample.java
        ```java
        import java.lang.reflect.Array;  

        public class ReflectArraygetShortExample2 {  
            public static void main (String args[]) {  
                short[] arr = new short[]{56,54,76};  
                short value = Array.getShort(arr, 1);  
                System.out.println(value);  
            }  
        }  
        ```
    + Output:
        ```java
        54
        ```
11. Java Array newInstance() Method
- Được sử dụng để tạo một mảng mới với kiểu phần tử và kích thước được chỉ định
- Cú pháp:
    ```java
    public static Object newInstance(Class<?> componentType, int length)  
      throws NegativeArraySizeException  
  
  
    public static Object newInstance(Class<?> componentType,  int... dimensions)  
        throws IllegalArgumentException,  
                NegativeArraySizeException  
    ```
    + componentType: Kiểu phần tử của mảng mới.
    + length: Độ dài của mảng mới.
    + dimensions
- Ví dụ 1:
    + FileName: ReflectArraynewInstanceExample1.java
        ```java
        import java.lang.reflect.Array;  

        public class ReflectArraynewInstanceExample1 {  
            public static void main(String[] args) {  
            
                String[][] strarr = (String[][]) Array.newInstance(String.class, 3,3);  
            
                Array.set(strarr[0], 0, "javaTpoint");  
                Array.set(strarr[1], 1, ".Net");  
                Array.set(strarr[2], 2, "c#");  
            
                System.out.println("Array[0][0] = " + Array.get(strarr[0], 0));  
                System.out.println("Array[1][1] = " + Array.get(strarr[1], 1));  
                System.out.println("Array[2][2] = " + Array.get(strarr[2], 2));  
            }  
        }  
        ```
    + Output:
        ```java
        Array[0][0] = javaTpoint
        Array[1][1] = .Net
        Array[2][2] = c#
        ```
- Ví dụ 2:
    + FileName: ReflectArraynewInstanceExample2.java
        ```java
        import java.lang.reflect.Array;  
        import java.math.BigDecimal;  
        import java.math.BigInteger;  
        import java.util.Arrays;  
        
        public class ReflectArraynewInstanceExample2  {  
        
            public static void main(String... args) {  
                int lnth = 4;  
                Object obj = Array.newInstance(BigDecimal.class, lnth);  
                for (int i = 0; i < lnth; i++) {  
                    Array.set(obj, i, BigDecimal.valueOf(i));  
                }  
                System.out.println(Arrays.toString((Object[]) obj));  
            }  
        }  
        ```
    + Output:
        ```java
        [0, 1, 2, 3]
        ```
12. Java Array set() Method
- Được sử dụng để gán giá trị mới cho một phần tử tại vị trí cụ thể trong mảng
- Cú pháp:
    ```java
    public static void set(Object array, int index, Object value)  
                throws IllegalArgumentException,  
                       ArrayIndexOutOfBoundsException  
    ```
    + array: Mảng mà bạn muốn thay đổi giá trị.
    + index: Vị trí của phần tử bạn muốn gán giá trị mới.
    + value: Giá trị mới mà bạn muốn gán cho phần tử tại vị trí chỉ định.
- Ví dụ:
    + FileName: ReflectArraySetExample.java
        ```java
        import java.lang.reflect.Array;  
        import java.util.Arrays; 

        public class ReflectArraySetExample2  {  
            public static void main(String[] argv) throws Exception {  
                int[] arr = { 1, 2, 3 };   
                Object obj = Array.get(arr, 2);  
                System.out.println("obj:"+obj);  
                Array.set(arr, 2, 1);  
                System.out.println("Array :: " +Arrays.toString(arr));  
            }  
        }  
        ```
    + Output:
        ```java
        obj:3
        Array :: [1, 2, 1]
        ```
13. Java Array setBoolean() Method
- Được sử dụng để gán giá trị boolean mới cho một phần tử tại vị trí cụ thể trong mảng
- Cú pháp
    ```java
    public static void setBoolean(Object array, int index, boolean value)  
                       throws IllegalArgumentException,  
                              ArrayIndexOutOfBoundsException  
    ```
    + array: Mảng mà bạn muốn thay đổi giá trị.
    + index: Vị trí của phần tử bạn muốn gán giá trị mới.
    + value: Giá trị boolean mới mà bạn muốn gán cho phần tử tại vị trí chỉ định.
- Ví dụ:
    + FileName: ReflectArraySetBooleanExample.java
        ```java
        import java.lang.reflect.Array;  

        public class ReflectArraySetBooleanExample1  {  
            public static void main(String[] args) {  
            
                boolean[] sarr = (boolean[]) Array.newInstance(boolean.class, 3);  
            
                Array.setBoolean(sarr, 0, true);  
                Array.setBoolean(sarr, 1, false);  
                Array.setBoolean(sarr, 2, true);  
                for(int i=0;i<sarr.length;i++)  
                {  
                        System.out.println("sarr["+i+"] = " + Array.get(sarr, i));  
                }  
            }  
        } 
        ```
    + Output:
        ```java
        sarr[0] = true
        sarr[1] = false
        sarr[2] = true
        ```
14. Java Array setByte() Method
- Được sử dụng để gán giá trị byte mới cho một phần tử tại vị trí cụ thể trong mảng.
- Cú pháp:
    ```java
    public static void setByte(Object array, int index, byte value)  
                    throws IllegalArgumentException,  
                           ArrayIndexOutOfBoundsException  
    ```
    + array: Mảng mà bạn muốn thay đổi giá trị.
    + index: Vị trí của phần tử bạn muốn gán giá trị mới.
    + value: Giá trị byte mới mà bạn muốn gán cho phần tử tại vị trí chỉ định.
- Ví dụ:
    + FileName: ReflectArraygetByteExample.java
        ```java
        import java.lang.reflect.Array;  

        public class ReflectArraygetByteExample2 {  
            public static void main (String args[]) {  
                byte[] arr = new byte[]{1,2,3};  
                
                byte value = Array.getByte(arr, 1);  
            
                System.out.println(value);  
            }  
        }  
        ```
    + Output:
        ```java
        2
        ```
15. Java Array setChar() Method
- Được sử dụng để gán giá trị ký tự (char) mới cho một phần tử tại vị trí cụ thể trong mảng
- Cú pháp:
    ```java
    public static void setChar(Object array, int index, char value)  
                    throws IllegalArgumentException,  
                           ArrayIndexOutOfBoundsException  
    ```
    + array: Mảng mà bạn muốn thay đổi giá trị.
    + index: Vị trí của phần tử bạn muốn gán giá trị mới.
    + value: Giá trị ký tự mới mà bạn muốn gán cho phần tử tại vị trí chỉ định.
- Ví dụ:
    + FileName: ReflectArraysetCharExample.java
        ```java
        import java.lang.reflect.Array;  

        public class ReflectArraysetCharExample2 {  
            public static void main(String[] args) {  
            
                char[] arr = new char[4];  
            
                Array.setChar(arr,0,'J');  
                Array.setChar(arr,1,'A');  
                Array.setChar(arr,2,'V');  
                Array.setChar(arr,3,'A');  
                    
                System.out.println(  Array.getChar(arr, 0) +""+ Array.getChar(arr, 1) +""+ Array.getChar(arr, 2) +""+ Array.getChar(arr, 3));  
                
            }  
        }  
        ```
    + Output:
        ```java
        JAVA
        ```
16. Java Array setDouble() Method
- Được sử dụng để gán giá trị kiểu double mới cho một phần tử tại vị trí cụ thể trong mảng
- Cú pháp:
    ```java
    public static void setDouble(Object array, int index, double value)  
                      throws IllegalArgumentException,  
                             ArrayIndexOutOfBoundsException  
    ```
    + array: Mảng mà bạn muốn thay đổi giá trị.
    + index: Vị trí của phần tử bạn muốn gán giá trị mới.
    + value: Giá trị double mới mà bạn muốn gán cho phần tử tại vị trí chỉ định.
- Ví dụ:
    + FileName: ReflectArraysetDoubleExample.java
        ```java
        import java.lang.reflect.Array; 

        public class ReflectArraysetDoubleExample1 {   
            public static void main(String[] args)   
            {   
                double arr[] = new double[3];    
                Array.setDouble(arr , 0 , 2.4);  
                Array.setDouble(arr , 1 , 7.4);  
                    Array.setDouble(arr , 2 , 9.4);  
                
                for (int i = 0; i < arr.length; i++) {   
            
                    double vl = Array.getDouble(arr, i);   
                    System.out.print(vl + "  , ");   
                }   
            }   
        }
        ```
    + Output:
        ```java
        2.4 , 7.4 , 9.4
        ```
17. Java Array setFloat() Method
- Được sử dụng để gán giá trị kiểu float mới cho một phần tử tại vị trí cụ thể trong mảng
- Cú pháp:
    ```java
    public static void setFloat(Object array, int index, float f)  
       throws IllegalArgumentException,  
            ArrayIndexOutOfBoundsException  
    ```
    + array: Mảng mà bạn muốn thay đổi giá trị.
    + index: Vị trí của phần tử bạn muốn gán giá trị mới.
    + value: Giá trị float mới mà bạn muốn gán cho phần tử tại vị trí chỉ định
- Ví dụ:
    + FileName: ReflectArraysetFloatExample.java
        ```java
        import java.lang.reflect.Array;  

        public class ReflectArraysetFloatExample2 {  
            public static void main (String args[]) {  
                float[] arr = new float[3];  
                for(int i=0;i<arr.length;i++)  
                {  
                    Array.setFloat(arr , i , i+8.0f);  
                }  
                
                for(int i=0;i<arr.length;i++)  
                {  
                double value = Array.getFloat(arr, i);  
            
                System.out.println(value);  
                }  
            }  
        } 
        ```
    + Output:
        ```java
        8.0
        9.0
        10.0
        ```
18. Java Array setInt() Method
- Được sử dụng để gán giá trị kiểu int mới cho một phần tử tại vị trí cụ thể trong mảng
- Cú pháp:
    ```java
    public static void setInt(Object array, int index, int value)  
                   throws IllegalArgumentException,  
                          ArrayIndexOutOfBoundsException
    ```
    + array: Mảng mà bạn muốn thay đổi giá trị.
    + index: Vị trí của phần tử bạn muốn gán giá trị mới.
    + value: Giá trị int mới mà bạn muốn gán cho phần tử tại vị trí chỉ định.
- Ví dụ:
    + FileName: ReflectArraysetIntExample.java
        ```java 
        import java.lang.reflect.Array;   

        public class ReflectArraysetIntExample1 {   
            public static void main(String[] args)   
            {   
                int arr[] = new int[3];    
                Array.setInt(arr , 0 , 2);  
                Array.setInt(arr , 1 , 7);  
                    Array.setInt(arr , 2 , 9);  
                
                for (int i = 0; i < arr.length; i++) {   
            
                    double vl = Array.getInt(arr, i);   
                    System.out.print(vl + "  , ");   
                }   
            }   
        }  
        ```
    + Output:
        ```java
        2.0 , 7.0 , 9.0 ,
        ```