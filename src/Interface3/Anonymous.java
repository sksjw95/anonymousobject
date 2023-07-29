package Interface3;

public class Anonymous {
    private int field;
    public void method(final int arg1, final int arg2){
        final int var1 = 0;
        final int var2 = 0;

        field = 10;

        // final 특성을 갖고있어 값을 변경할 수 없다.
        //arg1 = 20;
        //arg2 = 20;

       // var1 = 30;
       // var2 = 30;
        Calculatable calc = new Calculatable() {
            @Override
            public int sum() {
                int result = field + arg1 + arg2 + var1 + var2;
                return result;
            }
        };
        System.out.println(calc.sum());
    }
}
