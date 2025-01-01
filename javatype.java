//整數
// short 整數（佔 2 個位元組）、int 整數（佔 4 個位元組）與 long 整數（佔 8 個位元組）
//位元組
//（例如影像處理、編碼處理等），就會使用 byte 型態，若用於表示整數，byte 可表示 -128 到 127 的整數。
//浮點數
//可分為 float 浮點數（佔 4 個位元組）與 double 浮點數（佔 8 個位元組）
//字元
//支援 Unicode，char 型態佔 2 個位元組
//布林
//boolean 型態可表示 true 與 false，分別代表邏輯的「真」與「假」，不用在意 boolean 型態的長度
		
		
		
		// byte、short、int、long 範圍
        System.out.printf("%d ~ %d%n",Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("%d ~ %d%n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("%d ~ %d%n",  Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("%d ~ %d%n",  Long.MIN_VALUE, Long.MAX_VALUE);
        // float、double 精度範圍
        System.out.printf("%d ~ %d%n", Float.MIN_EXPONENT, Float.MAX_EXPONENT);
        System.out.printf("%d ~ %d%n", Double.MIN_EXPONENT, Double.MAX_EXPONENT);
        // char 可表示的 Unicode 範圍
        System.out.printf("%h ~ %h%n",  Character.MIN_VALUE, Character.MAX_VALUE);
        // boolean 的兩個值
        System.out.printf("%b ~ %b%n",   Boolean.TRUE, Boolean.FALSE);