package labeight.experiment;

import labeight.data.ResultsTable;
import labeight.list.SinglyLinkedList;

/**
 * A Campaign interface used to run an experiment.
 *
 * @author Gregory M. Kapfhammer
 */

public interface Campaign {

  /** Require that any Campaign implementer can run an SinglyLinkedList's
   *  method in an experiment. */
  public ResultsTable run(SinglyLinkedList<String> list, int campaignLength);

}
