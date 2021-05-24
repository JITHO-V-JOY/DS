class Main {
    enum Level
    {
        LOW,
	MEDIUM,
	HIGH
    }
    public static void main(String[] args)
    {
        Level myvar = Level.LOW;
	System.out.println(myvar);

	for(Level mylevel: Level.values()){
		System.out.println(mylevel);
	}

    }
    
}
