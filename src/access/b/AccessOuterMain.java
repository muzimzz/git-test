package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 1;
        data.publicMethod();

        //data.defaultField = 1;
        //data.defaultMethod();

        //data.protectedMethod();

        // data.privateField = 1;
        // data.privateMethod();

        data.innerAccess();
    }
}
