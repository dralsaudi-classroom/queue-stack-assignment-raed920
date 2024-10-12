package com.example.project;

public class QueueStackTester {
    public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
    {
    	recSplit (q , oq , eq , q . length () , 1) ;
    }
    private static <T> void recSplit ( Queue <T > q , Queue <T > oq , Queue <T >
    eq , int count , int pos ) {
    if ( pos > count )
    return;
    T element = q . serve () ;
    q . enqueue ( element ) ;
    if ( pos % 2 == 1) {
    if (! oq . full () )
    oq . enqueue ( element ) ;
    }
    else {
    if (! eq . full () )
    eq . enqueue ( element ) ;
    }
    recSplit (q , oq , eq , count , pos + 1) ;

    	
        //throw new UnsupportedOperationException("Not supported yet.");
        // Write the recursive static method split that splits a queue of n elements into two
        // queues. The elements with odd orders (i.e. 1st, 3rd, 5th ...) should be put in the
        // first queue and elements with even orders (i.e. 2nd, 4th, 6th ...) should be put in
        // the second queue. The original queue should remain unchanged at the end of the
        // method.
        // Example. Given the queue (A, B, C, D, E), split results in oq (A, C, E), and eq(B, D).
    }
    public static <T> void remove(LinkedPQ<T> pq, int p)
    {
    	for (int i = 0 ; i<pq.length();i++) {
    		PQElement<T> tmp = pq.serve();
    		if (tmp.p>p)
    			pq.enqueue(tmp.data, tmp.p);
    		
    	}
        //throw new UnsupportedOperationException("Not supported yet.");
        // Write a static method remove that removes every element in the priority queue
        // having priority less than p.
        // Example. Given pq: [A, 10], [D, 8], [B, 5], [E, 3], [C, 2] remove(pq, 5) results in
        // pq: [A, 10], [D, 8], [B, 5].
    }
    public static <T> boolean search(Stack<T> st, T e)
    {
    	
    	if (st.empty () )
    	return false;
    	T top = st . pop () ;
    	boolean found ;
    	if (top.equals ( e ) )
    	found = true ;
    	else
    	found = search ( st , e ) ;
    	st.push(top) ;
    	return found ;
    	
    	
        //throw new UnsupportedOperationException("Not supported yet.");
        // Write the recursive static method search that searches for an element e in a stack st
        // and returns true if it’s found or false otherwise. st should not change at the end of
        // the method. You are not allowed to use any auxiliary data structures.
        // Example. Given the stack st (top-to-bottom): 5, 7, 5, 3, 2. search(st, 3) returns
        // true while search(st, 1) returns false.
    }
}