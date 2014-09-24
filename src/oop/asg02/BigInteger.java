package oop.asg02;

public class BigInteger
{
	int number;
	
    public BigInteger(int init) {
    	number = init;
    }

    public BigInteger(String init) {
    	String new_init = init;
    	int count = 0;
    	while(count < init.length() - 1)
    	{
	    	char begin = new_init.charAt(count);
	    	String begin_string = Character.toString(begin);
	    	int begin_int = Integer.parseInt(begin_string);
	    	count ++;
	    	if(begin_int == 0) {
	    		new_init = init.substring(count);
	    	}
	    	else break;	
    	}
    	number = Integer.parseInt(new_init);
    }

    public String toString() {
    	String s = Integer.toString(number);
        return s;
    }

    public boolean equals(Object other) {
        return toString().equals(other.toString());
    }

    public long toLong() {
        return 0;  
    }

    public BigInteger add(BigInteger other) {
        return null; 
    }

    public BigInteger subtract(BigInteger other) {
        return null;  
    }
}
