public class DecoratorDemo {

    public static void main(String[] args) {

	System.out.println("\nCoyote 1\n");
	
	Coyote c1 = new SimpleCoyote();
	c1.chase();

	System.out.println("\nCoyote 2\n");

	Coyote c2 = new CoyoteRocketDecorator(new SimpleCoyote());
	c2.chase();
	
	System.out.println("\nCoyote 3\n");

	Coyote c3 = new CoyoteRocketDecorator(new CoyoteRollerSkatesDecorator ( new SimpleCoyote() ));
	c3.chase();
	
	System.out.println("\nCoyote 4\n");

	Coyote c4 = new CoyoteRocketDecorator(new CoyoteRocketDecorator ( new CoyoteRocketDecorator(new CoyoteRollerSkatesDecorator ( new SimpleCoyote() ))));
	c4.chase();
	
    }
}

interface Coyote {

    public void chase();

}

class SimpleCoyote implements Coyote {

    public void chase() { System.out.println("Chase!"); }

}

abstract class CoyoteDecorator implements Coyote {

    protected Coyote _decoratedCoyote;

    public CoyoteDecorator(Coyote c) {
	_decoratedCoyote = c;
    }
    
    public void chase() {
	_decoratedCoyote.chase();
    }

}

class CoyoteRocketDecorator extends CoyoteDecorator {


    public CoyoteRocketDecorator(Coyote c) {
	super(c);
    }

    @Override
    public void chase() {
        super.chase();
	chaseOnRocket();
    }

    private void chaseOnRocket() { System.out.println("Chase on Rocket!"); }

}

class CoyoteRollerSkatesDecorator extends CoyoteDecorator {

    public CoyoteRollerSkatesDecorator(Coyote c) {
	super(c);
    }

    @Override
    public void chase() {
        super.chase();
        chaseOnRollerSkates();
    }

    private void chaseOnRollerSkates() { System.out.println("Chase on Roller Skates!"); }

}
