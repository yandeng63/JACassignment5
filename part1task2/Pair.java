package part1task2;

public class Pair<T,P> {
	    private T x;
	    private P y;
		
	    public Pair(T x, P y) {
			super();
			this.x = x;
			this.y = y;
		}

		public T getX() {
			return x;
		}

		public void setX(T x) {
			this.x = x;
		}

		public P getY() {
			return y;
		}

		public void setY(P y) {
			this.y = y;
		}

		@Override
		public String toString() {
			return "Pair [x=" + x + ", y=" + y + "]";
		}

	    
		
}
