public class Test4 extends Test3 {
    @Override
    public String test2() {
        new Test4Inner().test();
        return null;
    }

    private String test3() {
        new Test4Inner().test();
        return null;
    }



    private class Test4Inner{
        private void test(){
            Test4.this.test3();
        }
    }
}
