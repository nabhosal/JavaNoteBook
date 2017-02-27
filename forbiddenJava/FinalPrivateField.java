package forbiddenJava;

import java.lang.reflect.Field;

/*
 * Using Java reflection for updating final fields
 * http://java-performance.info/updating-final-and-static-final-fields/
 * 
 */

public class FinalPrivateField {
	
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        final A instance = new A( 10 );
        B.updateA( instance, 20 );
        System.out.println( instance.getField() );
    }
 
    public static class A
    {
        private final int m_field;
 
        public A( final int field ) {
            m_field = field;
        }
 
        public int getField() {
            return m_field;
        }
    }
 
    public static class B
    {
        public static void updateA( final A other, final int newValue ) throws NoSuchFieldException, IllegalAccessException
        {
            final Field fieldA = A.class.getDeclaredField( "m_field" );
            fieldA.setAccessible( true );
            fieldA.setInt( other, newValue );
        }
    }
}