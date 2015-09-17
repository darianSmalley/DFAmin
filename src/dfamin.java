/**
 * Created by darian on 9/16/15.
 */
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;

public class dfamin {
    int D[][];
    int S[][];

    public static class State {
        int id;
        Edge[] adjacencies;
        boolean isAccept = false;

        public State () {

        }

    }

    public static class Edge {
        State target;
        int letter;

        public Edge () {

        }
    }

    //check states before minimizing for unreachable states
    static public class DFA {
        Set<Integer> Q; //set of states in DFA
        Set<Character> lang; //set of characters in the language accepted by this DFA
        Set<Integer> F; //set of accept states
        int transition[][]; //state transition table. rows are states, columns are characters
        int q_0; //start state
        int size; //number of states in DFA

        public DFA (Set<Integer> Q, Set<Character> lang,int transition[][] ,int q_0, Set<Integer> F) {
            this.Q = Q;
            this.lang = lang;
            this.transition = transition;
            this.q_0 = q_0;
            this.F = F;

            this.size = Q.size();
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //number of DFA to reduce
        String input;
        String[] terms;
        int s = 0; //number of states in DFA, 0 - (s-1)
        int v = 0; //size of input alphabet, first lower case v letters
        int a = 0; //number of accept states, a <= s
        List<String> acceptStates_list;
        List<Integer> intList = new ArrayList<>();

        Set<Integer> acceptStates;

        for( int i = 0; i < n; i++) {
            input = br.readLine();
            terms = input.split(" ");
            s = Integer.parseInt(terms[0]);
            v = Integer.parseInt(terms[1]);

            input = br.readLine();
            terms = input.split(" ");
            a = Integer.parseInt(terms[0]);
            acceptStates_list = Arrays.asList(terms);
            acceptStates_list.remove(0);

            for (int j = 0; j < s; j++) {

            }

        }

    }

    public static Set<Integer> newHashSet(List<Integer> list) {
        Set<Integer> set = new HashSet<Integer>();
        list.stream().forEach(i -> set.add(i));
        return set;
    }

}
