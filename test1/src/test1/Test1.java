
package test1;

class Customer {

String name;

protected double bal;

Customer() {

}

Customer(String name) {

this.name = name;

}

Customer(String n, double b) {

this.name = n;

this.bal = b;

}

public void setName(String n) {

this.name = n;

}

public String getName() {

return this.name;

}

public double getBalance() {

return this.bal;

}

public void CR(int callType, int mins) {

if (callType == 1) {

this.bal += (2 * mins);

} else {

this.bal += mins;

}

}

public void RP(double amount) {

this.bal -= amount;

}

public String toString() {

return this.name + " has outstanding balance of " + this.bal;

}

}

class GC extends Customer {

int totalTime = 0;

GC() {

super();

}

GC(String a) {

// super();

super(a);

}

GC(String a, double b) {

super(a, b);

}

public void CR(int callType, int mins) {

if (callType == 1) {

if (this.totalTime <= 60) {

int timeleft = 60 - totalTime;

if (timeleft > mins) {

bal += 2.5 * mins;

totalTime += mins;

} else {

bal += timeleft * 2.5;

bal += (mins - timeleft) * 0.75;

totalTime += mins;

}

} else {

bal += mins * 0.75;

totalTime += mins;

}

} else {

super.CR(2, mins);

}

}

}

public class Test1 {

    public static void main(String[] args) {
        
        // Customer s1 = new Customer();

// Customer s2 = new Customer("Ali");

// Customer s3 = new Customer("Asghar", 40.0);

// GC g1 = new GC();

GC g2 = new GC("hamza", 50.0);

// s3.CR(1, 4);

System.out.println(g2.totalTime);

System.out.println(g2);

g2.CR(1, 30);

System.out.println(g2.totalTime);

System.out.println(g2);

g2.CR(1, 25);

System.out.println(g2.totalTime);

System.out.println(g2);

g2.CR(1, 15);

System.out.println(g2.totalTime);

// System.out.println(s1);

// System.out.println(s2);

// System.out.println(s3);

// System.out.println(g1);

System.out.println(g2);

g2.CR(1,20);

System.out.println(g2.totalTime);

System.out.println(g2);
    }
    
}
