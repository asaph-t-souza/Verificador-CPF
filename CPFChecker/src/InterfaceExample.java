interface InterfaceExample1 {
    final static int MYNUMBER = 8;

    abstract void myMethod1();
    abstract void myMethod2();
}

interface InterfaceExample2 {
    final static int MYNUMBER = 8;

    abstract void myMethod3();
    abstract void myMethod4();
}

abstract class AbsClass1{
    final static int MYNUMBER = 8;

    abstract void myMethod5();
    abstract void myMethod6();

}

abstract class AbsClass2{
    final static int MYNUMBER = 8;

    abstract void myMethod7();
    abstract void myMethod8();

}


class MyClass extends AbsClass1 implements InterfaceExample1, InterfaceExample2{

    @Override
    public void myMethod1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'myMethod1'");
    }

    @Override
    public void myMethod2() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'myMethod2'");
    }

    @Override
    public void myMethod3() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'myMethod3'");
    }

    @Override
    public void myMethod4() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'myMethod4'");
    }

}
