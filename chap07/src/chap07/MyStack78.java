package chap07;

class GStack<T> {
    int tos;
    Object[] stck;
    
    public GStack() {
        tos = 0;
        stck = new Object[10];
    }
    
    public void push(T item) {
        if (tos == 10)
            return;
        
        stck[tos] = item;
        tos++;
    }
    
    public T pop() {
        if (tos == 0)
            return null;
        
        tos--;
        return (T)stck[tos];
    }
}

class Point {
    int x, y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class MyStack78 {

    public static void main(String[] args) {
        GStack<Point> stack = new GStack<>();
        
        // 3개의 점을 스택에 push
        stack.push(new Point(2, 3));
        stack.push(new Point(-5, 20));
        stack.push(new Point(30, -8));
        
        // 스택에서 점을 pop하여 출력
        for (int i = 0; i < 3; i++) {
            Point p = stack.pop();
            System.out.println(p);
        }
    } 
}
