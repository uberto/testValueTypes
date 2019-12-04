package ubertob.tree;

import com.ubertob.tree.Branch;
import com.ubertob.tree.Root;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Set;

public class TreeTest {

    @Test
    public void recursiveCalls() {

        Root r = new Root();
        Branch b1 = new Branch(r, Collections.emptySet());
        Branch b2 = new Branch(r, Set.of(1,2,3));
        Branch b11 = new Branch(b1, Set.of(10,11));
        Branch b21 = new Branch(b2, Set.of(20,21));
        Branch b31 = new Branch(b21, Set.of(100, 101));


        System.out.println(b31.walkToRoot());

        b21.values.add(1000);

        System.out.println(b21.walkToRoot());

    }

}
