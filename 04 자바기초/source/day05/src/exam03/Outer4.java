package exam03;

public class Outer4 {
    /*private Calculator cal = new Calculator(){
        @Override
        public int add(int num1, int num2) {
            return num1 + num2;
        }
    };*/

    Calculator method(int num3){
        Calculator cal = new Calculator(){
            @Override
            public int add(int num1, int num2) {
                return num1 + num2 + num3;
            }
        };

        return cal;
    }
}
